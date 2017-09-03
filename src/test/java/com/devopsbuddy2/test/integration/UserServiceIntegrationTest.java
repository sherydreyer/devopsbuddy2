package com.devopsbuddy2.test.integration;

import com.devopsbuddy2.backend.persistence.domain.backend.Role;
import com.devopsbuddy2.backend.persistence.domain.backend.User;
import com.devopsbuddy2.backend.persistence.domain.backend.UserRole;

import com.devopsbuddy2.backend.service.UserService;
import com.devopsbuddy2.enums.PlansEnum;
import com.devopsbuddy2.enums.RolesEnum;
import com.devopsbuddy2.utils.UserUtils;
import com.devopsbuddy2.Devopsbuddy2Application;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
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
public class UserServiceIntegrationTest extends AbstractServiceIntegrationTest {


    @Rule
    public TestName testName = new TestName();

    @Test
    public void testCreateNewUser() throws Exception {

        User user = createUser(testName);
        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getId());


    }
}



