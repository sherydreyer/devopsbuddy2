package com.devopsbuddy2;

import com.devopsbuddy2.backend.persistence.domain.backend.Role;
import com.devopsbuddy2.backend.persistence.domain.backend.User;
import com.devopsbuddy2.backend.persistence.domain.backend.UserRole;
import com.devopsbuddy2.backend.service.UserService;
import com.devopsbuddy2.enums.PlansEnum;
import com.devopsbuddy2.enums.RolesEnum;
import com.devopsbuddy2.utils.UserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Devopsbuddy2Application implements CommandLineRunner {

/** The Application Logger */
private static final Logger LOG = LoggerFactory.getLogger(Devopsbuddy2Application.class);

@Autowired
	private UserService userService;

	public static void main(String[] args) {

		SpringApplication.run(Devopsbuddy2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		String username = "proUser";
		String email = "proUser@devopsbuddy.com";

		User user = UserUtils.createBasicUser(username, email);
		Set<UserRole> userRoles = new HashSet<>();
		LOG.debug("creating user with username{}", user.getUsername());
		userRoles.add(new UserRole(user, new Role(RolesEnum.PRO)));
		LOG.info("User{}created", user.getUsername());
		userService.createUser(user, PlansEnum.PRO, userRoles);


	}
}
