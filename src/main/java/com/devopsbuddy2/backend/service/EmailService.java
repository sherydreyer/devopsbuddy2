package com.devopsbuddy2.backend.service;

/**
 * Created by Sheryl Dreyer on 2017/08/27.
 */
import com.devopsbuddy2.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

/**
 * Contract for email service.
 * Created by tedonema on 22/03/2016.
 */
@Service
public interface EmailService {

    /**
     * Sends an email with the content in the Feedback Pojo.
     * @param feedbackPojo The feedback Pojo
     */
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo);

    /**
     * Sends an email with the content of the Simple Mail Message object.
     * @param message The object containing the email content
     */
    public void sendGenericEmailMessage(SimpleMailMessage message);
}