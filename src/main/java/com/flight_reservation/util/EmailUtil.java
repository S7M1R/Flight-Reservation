package com.flight_reservation.util;

import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class EmailUtil {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendItinerary(String toAddress, String filePath) {
        System.out.println(filePath);
        MimeMessage message = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper messageHelper = new MimeMessageHelper(message,true);
            messageHelper.setTo(toAddress);
            messageHelper.setSubject("Itinerary Of Flight");
            messageHelper.setText("Please find the attached");
            messageHelper.addAttachment("Itinerary", new File(filePath) );
            javaMailSender.send(message);
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
