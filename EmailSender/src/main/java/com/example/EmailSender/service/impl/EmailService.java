package com.example.EmailSender.service.impl;

import com.example.EmailSender.model.Mail;
import jakarta.mail.MessagingException;


public interface EmailService {
    void sendSimpleEmail(Mail mail);
    void sendHTMLEmail(Mail mail) throws MessagingException;
    void sendEmailWithThymeleaf(Mail mail) throws MessagingException;
    void sendEmailWithAttachment(Mail mail) throws MessagingException;
}

