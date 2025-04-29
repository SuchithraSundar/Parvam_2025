package com.springSecurityDemo.springSecurityDemo.configaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfigaration {
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user1 = User.withUsername("sinchana")
		.password(passwordEncoder().encode("sinchana@123"))
		.roles("ADMIN")
		.build();
		UserDetails user2 = User.withUsername("moksh")
				.password(passwordEncoder().encode("moksh@123"))
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user1, user2);
	}
	

}
