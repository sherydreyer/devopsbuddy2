package com.devopsbuddy2.config;

import com.devopsbuddy2.backend.service.EmailService;
import com.devopsbuddy2.backend.service.SmtpEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Sheryl Dreyer on 2017/08/27.
 */
@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/.devopsbuddy2/application-prod.properties")
public class ProductionConfig {
    @Bean
    public EmailService emailService() {
        return new SmtpEmailService();
    }
}