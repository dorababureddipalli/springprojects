package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entities.HIS_Plans;
import com.services.HIS_Plan_Services;

@Controller
public class HIS_Plan_Controller {
	
	@Autowired
	private HIS_Plan_Services hpService;
	
//	@PostMapping(value="/createPlan")
//	public ResponseEntity<HIS_Plans> createPlan(@RequestBody HIS_Plans hPlans) {
//		//HIS_Plans createPlan = hpService.createPlan(hPlans);
//		return new ResponseEntity<HIS_Plans>(hpService.createPlan(hPlans), HttpStatus.CREATED);
//	}
	@GetMapping(value="/showForm")
	public String loadCreateForm(Model m) {
		m.addAttribute("createPlan", new HIS_Plans());
		return "createplanform";
	}
	@PostMapping(value="/createPlan")
	public String createPlan(@ModelAttribute("hplans") HIS_Plans hplans) {
		hpService.createPlan(hplans);
		return "redirect:/showForm";
	}
	
	@GetMapping(value="/viewplans")
	public ResponseEntity<List<HIS_Plans>> viewPlans() {
		PageRequest of = PageRequest.of(1, 3);
		Page<HIS_Plans> viewPlans = hpService.viewPlans(of);
		List<HIS_Plans> content = viewPlans.getContent();
		return new ResponseEntity<List<HIS_Plans>>(content, HttpStatus.OK);
	}
	
	
	@PutMapping(value="/updateplan")
	public void updatePlan(@RequestBody HIS_Plans hPlans) {
		hpService.updatePlan(hPlans);

	}
	@DeleteMapping(value="/deleteplan/{planName}")
	public @ResponseBody String  deletePlan(@PathVariable String planName) {
		hpService.deletePlan(planName);
		return "Record Deleted Successfully...";
		
	}
	
	
}
