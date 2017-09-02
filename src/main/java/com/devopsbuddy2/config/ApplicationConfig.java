package com.devopsbuddy2.config;

/**
 * Created by Sheryl Dreyer on 2017/08/31.
 */


import org.springframework.boot.orm.jpa.EntityScan;

import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.devopsbuddy2.backend.persistence.repositories")
@EntityScan(basePackages = "com.devopsbuddy2.backend.persistence.domain.backend")
@EnableTransactionManagement
@PropertySource("file:///${user.home}/.devopsbuddy2/application-common.properties")
@PropertySource("file:///${user.home}/.devopsbuddy2/stripe.properties")
public class ApplicationConfig {

}