package com.pc.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.pc.entity.Employee;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmployeeService {

	@Autowired
	private JavaMailSender sender;
	@Value("${spring.mail.username}")
	private String fromMsg;
	
	public String sendMail(Employee emp) throws MessagingException {
		MimeMessage msg = sender.createMimeMessage();
		MimeMessageHelper m=new MimeMessageHelper(msg,true);
		m.setFrom(fromMsg);
		m.setTo(emp.getEmail());
		m.setSubject("Party Invitation");
		m.setSentDate(new Date());
		m.setText("""
				Hello Priyanshu,
				   You are invited in "Biggest Annual Day" of XYZ Company at Maharaja 
				   Celebration on date 21/12/2026.
				""");
		sender.send(msg);
		return "Mail Send";
		
	}
}
