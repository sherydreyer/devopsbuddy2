package com.devopsbuddy2.test.unit;

/**
 * Created by Sheryl Dreyer on 2017/09/03.
 */

import com.devopsbuddy2.backend.persistence.domain.backend.User;
import com.devopsbuddy2.utils.UserUtils;
import com.devopsbuddy2.web.controllers.ForgotMyPasswordController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

import java.util.UUID;


public class UserUtilsUnitTest {

    private MockHttpServletRequest mockHttpServletRequest;


    @Before
    public void init() {
        mockHttpServletRequest = new MockHttpServletRequest();

    }

    @Test
    public void testPasswordResetEmailUrlConstruction() throws Exception {

        mockHttpServletRequest.setServerPort(8080); //Default is 80

        String token = UUID.randomUUID().toString();
        long userId = 123456;

        String expectedUrl = "http://localhost:8080" +
                ForgotMyPasswordController.CHANGE_PASSWORD_PATH + "?id=" + userId + "&token=" + token;

        String actualUrl = UserUtils.createPasswordResetUrl(mockHttpServletRequest, userId, token);

        Assert.assertEquals(expectedUrl, actualUrl);

    }


}
