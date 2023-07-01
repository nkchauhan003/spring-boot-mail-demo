package com.cb.controller;

import com.cb.dto.EmailData;
import com.cb.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public String sendEmail(@RequestBody EmailData emailData) {
        emailService.sendEmail(emailData.to(), emailData.subject(), emailData.text());
        return "Done !!!";
    }
}
