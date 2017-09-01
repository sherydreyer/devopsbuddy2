package com.devopsbuddy2.utils;
import com.devopsbuddy2.backend.persistence.domain.backend.User;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by tedonema on 30/03/2016.
 */
public class UserUtils {

    /**
     * Creates a user with basic attributes set.
     * @param username The username.
     * @param email The email.
     * @return A User entity
     */
    private UserUtils() {
        throw new AssertionError("Non instantiable");
    }

    public static User createBasicUser(String username, String email) {

        User user = new User();
        user.setUsername(username);
        user.setPassword("secret");
        user.setEmail(email);
        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setPhoneNumber("123456789123");
        user.setCountry("GB");
        user.setEnabled(true);
        user.setDescription("A basic user");
        user.setProfileImageUrl("https://blabla.images.com/basicuser");
        return user;
    }
}