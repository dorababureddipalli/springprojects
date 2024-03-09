package com.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.constants.HIS_Constants;
import com.entities.HIS_CaseWorker;
import com.entities.HIS_Credential;
import com.entities.UnlockACC;
import com.repositories.HIS_Repository;
import com.services.HIS_Service;

@Controller
public class CS_Controller {
	private Logger log = LoggerFactory.getLogger("CS_Controller");
	@Autowired
	private HIS_Service hisServ;
	@Autowired
	private HIS_Repository hisrepo;

	@GetMapping(value = { "/", "login" })
	public String loginForm(Model m, HIS_Credential hc) {
		m.addAttribute("hisCredentials", hc);
		return "Login";
	}

	@PostMapping(value = "/loginHandler")
	public String loginFormHandler(@ModelAttribute("hisCredentials") HIS_Credential hisCredentials, Model m) {
		System.out.println(hisCredentials);
		HIS_CaseWorker his = null;
		// String chkMsg=null;
		Optional<HIS_CaseWorker> byMailAndPass = hisServ.getByMailAndPass(hisCredentials.getEMail(),
				hisCredentials.getPassword());
		if (byMailAndPass.isPresent()) {
			his = byMailAndPass.get();
			System.out.println(his);
			if (his.getAccStatus().equalsIgnoreCase("unlocked")) {
				if (his.getSftDlt().equalsIgnoreCase("n")) {
					if (his.getRole().equalsIgnoreCase("Admin")) {
						return "AdminDashBoard";
					}
					if (his.getRole().equalsIgnoreCase("caseworker")) {
						return "CaseWorkerDashBoard";
					}

				} else {
					m.addAttribute("credRslt", "Account is In-Active");
					return "redirect:/Login";
				}
			} else {
				m.addAttribute("credRslt", "Account is Locked");
				return "redirect:/Login";
			}

		} else {
			m.addAttribute("credRslt", "Invalid Credentials");
			return "redirect:/Login";
		}
		return "redirect:/Login";
	}

	@GetMapping(value = "/create")
	public String createCaseWorker(Model m, HIS_CaseWorker hisCaseWorker) {
		m.addAttribute("hisCaseWorker", hisCaseWorker);
		return "createpage";
	}

	@PostMapping(value = "/createHandler")
	public String caseWorkerHandler(@ModelAttribute("hisCaseWorker") HIS_CaseWorker hisCaseWorker, Model m) {
		try {
			HIS_CaseWorker his_CaseWorker = hisServ.createCaseWorker(hisCaseWorker);
			m.addAttribute("successMsg", "Account created for " + his_CaseWorker.getRole() + " successful");
			// hisServ.emailSender(createdCaseWorker.getEMail(), HIS_Constants.MAIL_SUBJECT,
			// HIS_Constants.MAIL_TXT_FILE);
		} catch (Exception e) {
			log.error("error occured during saving the record");
		}
		return "createpage";
	}

//	@GetMapping(value = "/unlockform")
//	public String unlockAccountForm(Model m, UnlockACC unLokAcc
//			/*@ModelAttribute("hisCaseWorker") HIS_CaseWorker hisCaseWorker*/) {
//
//		//m.addAttribute("unLokAcc", unLokAcc);
//		//m.addAttribute("email", hisCaseWorker.getEMail());
//		return "unlockpage";
//	}

	@PutMapping(value = "/unlock")
	/* @RequestParam("email") String email */
	public @ResponseBody String updatingPassAndAccStatus(@RequestBody UnlockACC unLock) {
		// System.out.println(email);
		hisServ.updatePassAndAccSts(HIS_Constants.UNLCK_TXT, unLock);
		return "record updated";
	}

	@GetMapping(value = "/getform")
	public String getAllUsersForm() {
		return "GetAllByRole";
	}

	@GetMapping(value = "/activate/{email}")
	public @ResponseBody String activateHIS(@PathVariable String email) {
		hisServ.activateHISEmp(email);
		return "record Activated";
	}

	@GetMapping(value = "/sftdlt/{email}")
	public @ResponseBody String softDelete(@PathVariable String email) {
		hisServ.softdeleteHISEmp(email);
		return "record De-Activated";
	}
	@GetMapping(value="/viewallform")
	public String viewAllForm() {
		return "dropdown";
	}

	@GetMapping("/byRole/{role}")
	public String getUsersByRole(@PathVariable String role,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size, Model m) {
		// m.addAttribute("byRoleList", hisServ.getUsersByRole(role));
//		PageRequest of = PageRequest.of(page, size);
//		Page<HIS_CaseWorker> usersByRole = hisServ.getUsersByRole(role, of);
//		List<HIS_CaseWorker> content = usersByRole.getContent();
//		System.out.println(content);
		
		List<HIS_CaseWorker> findAll = hisrepo.findAll();
//		content.stream().map(entity -> {
//			HIS_CaseWorker his=new HIS_CaseWorker();
//			BeanUtils.copyProperties(entity, his);
//			return his;
//		}).collect(Collectors.toList());
		//return new ResponseEntity<List<HIS_CaseWorker>>(content, HttpStatus.OK);
		m.addAttribute("role", findAll);
		return "GetAllByRole";
	}

	@GetMapping(value = "/emailvalidate")
	public @ResponseBody String emailValidate(@RequestParam(name = "email") String email) {
		return hisServ.emailValidator(email);

	}
}
