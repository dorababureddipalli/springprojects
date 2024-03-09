package com.services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.entities.HIS_CaseWorker;
import com.entities.UnlockACC;
import com.repositories.HIS_Repository;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class HIS_Service {
	@Autowired
	private HIS_Repository hisRepo;

	@Autowired
	private JavaMailSender mailSender;

	// Define the characters that can be used in the password
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	/**
	 * 
	 * @param caseWorker
	 * @return
	 */
	public HIS_CaseWorker createCaseWorker(HIS_CaseWorker caseWorker) {
		return hisRepo.save(caseWorker);
	}

	/**
	 * @param eMail
	 */
	public void softdeleteHISEmp(String eMail) {
		Optional<HIS_CaseWorker> byeMail = hisRepo.findByeMail(eMail);
		if (byeMail.isPresent()) {
			HIS_CaseWorker his_CaseWorker = byeMail.get();
			his_CaseWorker.setSftDlt("Y");
			hisRepo.save(his_CaseWorker);
		}
	}

	/**
	 * 
	 * @param eMail
	 */
	public void activateHISEmp(String eMail) {
		Optional<HIS_CaseWorker> byeMail = hisRepo.findByeMail(eMail);
		if (byeMail.isPresent()) {
			HIS_CaseWorker his_CaseWorker = byeMail.get();
			his_CaseWorker.setSftDlt("N");
			hisRepo.save(his_CaseWorker);
		}
	}

	/**
	 * 
	 * @param email
	 * @return
	 */
	public String emailValidator(String email) {
		Optional<HIS_CaseWorker> byeMail = hisRepo.findByeMail(email);

		if (byeMail.isPresent()) {
			// if(byeMail.get().getEMail()!=null)
			return "Duplicate";
		}

		else
			return "unique";
	}

	/**
	 * 
	 * @param to
	 * @param subject
	 * @param template
	 * @throws MessagingException
	 * @throws IOException
	 */
	public void emailSender(String to, String subject, String template) throws MessagingException, IOException {
		MimeMessage createMimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper mMh = new MimeMessageHelper(createMimeMessage, true);
		mMh.setTo(to);
		mMh.setSubject(subject);
		String htmlContent = readHtmlContent(template);
		mMh.setText("Temporary password " + generateTempPassword(), true);
		mMh.setText(htmlContent, true);
		mailSender.send(createMimeMessage);
	}

	/**
	 * 
	 * @param accStatus
	 * @param unLock
	 */
	public void updatePassAndAccSts(String accStatus, UnlockACC unLock) {
		// hisRepo.updatePasswordAndAccStatus(password, accStatus, email);
		Optional<HIS_CaseWorker> his = hisRepo.findByeMail(unLock.getEmail());
		if (his.isPresent()) {
			HIS_CaseWorker his_CaseWorker = his.get();
			his_CaseWorker.setAccStatus(accStatus);
			his_CaseWorker.setPassword(unLock.getPassword());
			his_CaseWorker.setSftDlt("N");
			hisRepo.save(his_CaseWorker);
		}

	}

	/**
	 * 
	 * @param templatePath
	 * @return
	 * @throws IOException
	 */
	private String readHtmlContent(String templatePath) throws IOException {
		ClassPathResource resource = new ClassPathResource(templatePath);
		byte[] fileBytes = resource.getInputStream().readAllBytes();
		return new String(fileBytes, StandardCharsets.UTF_8);
	}

	/**
	 * 
	 * @param role
	 * @param p
	 * @return
	 */
	public Page<HIS_CaseWorker> getUsersByRole(String role, Pageable p) {
		return hisRepo.findByRole(role, p);
	}

	/**
	 * 
	 * @return
	 */
	public String generateTempPassword() {
		// Set the password length
		int passwordLength = 6;

		// Use SecureRandom for better randomness
		SecureRandom random = new SecureRandom();

		// Create a StringBuilder to build the password
		StringBuilder passwordBuilder = new StringBuilder(passwordLength);

		// Generate random characters and append to the password
		for (int i = 0; i < passwordLength; i++) {
			int randomIndex = random.nextInt(CHARACTERS.length());
			char randomChar = CHARACTERS.charAt(randomIndex);
			passwordBuilder.append(randomChar);
		}

		// Convert StringBuilder to String and return the generated password
		return passwordBuilder.toString();
	}

	/**
	 * 
	 * @param email
	 * @return
	 */
	public boolean deleteHISEmploye(String email) {
		Optional<HIS_CaseWorker> findByEmail = hisRepo.findByeMail(email);
		if (findByEmail.isPresent()) {
			hisRepo.delete(findByEmail.get());
			return true;
		} else
			return false;
	}

	/**
	 * 
	 * @param mail
	 * @param pass
	 * @return
	 */
	public Optional<HIS_CaseWorker> getByMailAndPass(String mail, String pass) {
		return hisRepo.findByEmailAndPassword(mail, pass);
	}

}
