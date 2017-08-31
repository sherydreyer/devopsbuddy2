package com.devopsbuddy2.test.integration;

import com.devopsbuddy2.backend.persistence.domain.backend.Role;
import com.devopsbuddy2.backend.persistence.domain.backend.User;
import com.devopsbuddy2.backend.persistence.domain.backend.UserRole;

import com.devopsbuddy2.backend.service.UserService;
import com.devopsbuddy2.enums.PlansEnum;
import com.devopsbuddy2.enums.RolesEnum;
import com.devopsbuddy2.utils.UsersUtils;
import com.devopsbuddy2.Devopsbuddy2Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by tedonema on 30/03/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Devopsbuddy2Application.class)
public class UserServiceIntegrationTest {


     @Autowired
     private UserService userService;

    @Test
     public void testCreateNewUser() throws Exception {

         Set<UserRole> userRoles = new HashSet<>();
         User basicUser = UsersUtils.createBasicUser();
         userRoles.add(new UserRole(basicUser, new Role(RolesEnum.BASIC)));

         User user = userService.createUser(basicUser, PlansEnum.BASIC, userRoles);
         Assert.assertNotNull(user);
         Assert.assertNotNull(user.getId());

     }
 }



