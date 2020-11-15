/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * @author wb-phoonwaic553932
 * @version $Id: EmailServiceImpl.java, v 0.1 2020-11-11 22:38 wb-phoonwaic553932 Exp $$
 */
public class EmailServiceImpl {

    @Autowired
    private JavaMailSender emailSender;

    public void a (){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@baeldung.com");
//        message.setTo(to);
//        message.setSubject(subject);
//        message.setText(text);
        emailSender.send(message);
    }
}
