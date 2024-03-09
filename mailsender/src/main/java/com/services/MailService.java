package com.services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class MailService {
	@Autowired
	private JavaMailSender mailsender;

	public void emailService(String to, String subject, String template) throws Exception {

		MimeMessage mimeMessage = mailsender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

		helper.setTo(to);
		helper.setSubject(subject);
		String htmlContent = readHtmlContent(template);
		helper.setText(htmlContent, true);
		mailsender.send(mimeMessage);
	}

	private String readHtmlContent(String templatePath) throws IOException {
		ClassPathResource resource = new ClassPathResource(templatePath);
		byte[] fileBytes = resource.getInputStream().readAllBytes();
		return new String(fileBytes, StandardCharsets.UTF_8);
	}
}
