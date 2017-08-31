package com.devopsbuddy2.utils;
import com.devopsbuddy2.backend.persistence.domain.backend.User;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by tedonema on 30/03/2016.
 */
public class UsersUtils {

    /**
     * Non instantiable.
     */
    private UsersUtils() {
        throw new AssertionError("Non instantiable");
    }

    public static User createBasicUser() {

        User user = new User();
        user.setUsername("basicUser");
        user.setPassword("secret");
        user.setEmail("sheryldreyer2@gmail.com");
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