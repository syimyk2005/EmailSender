package com.example.EmailSender.controller;

import com.example.EmailSender.model.Mail;
import com.example.EmailSender.service.impl.EmailService;
import jakarta.mail.MessagingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailSenderController {

    private final EmailService emailService;

    public EmailSenderController(EmailService emailService) {
        this.emailService = emailService;
    }
    @PostMapping("/simpleEmail")
    public void sendSimpleEmail(@RequestBody Mail mail){
        emailService.sendSimpleEmail(mail);
    }

    @PostMapping("/HTMLEmail")
    public void sendHTMLEmail(@RequestBody Mail mail) throws MessagingException {
        emailService.sendHTMLEmail(mail);
        }

    @PostMapping("/EmailWithThymeleaf")
    public void sendEmailWithThymeleaf(@RequestBody Mail mail) throws MessagingException {
        emailService.sendEmailWithThymeleaf(mail);
    }

    @PostMapping("/EmailWithAttachment")
    public void sendEmailWithAttachment(@RequestBody Mail mail) throws MessagingException{
        emailService.sendEmailWithAttachment(mail);
    }

}

