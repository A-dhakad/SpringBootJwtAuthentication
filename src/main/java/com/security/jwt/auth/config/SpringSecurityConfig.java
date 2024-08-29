package com.security.jwt.auth.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfig {

		@Bean
		public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		}
		
		@Bean
	    public UserDetailsService userDetailsService() {
	        // Building an in-memory user
	        UserDetails adminUser = User.builder()
	        							.username("admin")
	        							.password(passwordEncoder().encode("admin123"))
	        							.roles("ASE")
	        							.build();
	        
	        UserDetails regularUser = User.builder()
	        								.username("user")
	        								.password(passwordEncoder().encode("user123"))
		        							.roles("ASE")
		        							.build();

	        // InMemoryUserDetailsManager is a basic implementation that manages users in memory
	        return new InMemoryUserDetailsManager(adminUser, regularUser);
	       
	    }
		
		@Bean
		public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
			return configuration.getAuthenticationManager();
		}

}
