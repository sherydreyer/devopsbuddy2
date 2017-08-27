package com.devopsbuddy2.backend.service;

/**
 * Created by Sheryl Dreyer on 2017/08/27.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

/**
 * Mock implementation of an email service.
 *
 * Created by tedonema on 22/03/2016.
 */

public class MockEmailService extends AbstractEmailService {

    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    @Override
    public void sendGenericEmailMessage(SimpleMailMessage message) {
        LOG.debug("Simulating an email service...");
        LOG.info(message.toString());
        LOG.debug("Email sent.");
    }
}