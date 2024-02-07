package com.spring.keycloakpkceapp.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		return http.cors(Customizer.withDefaults())
		.csrf(csrf->csrf.ignoringRequestMatchers("/api/home/**"))
		.authorizeHttpRequests(reqs->
		reqs.anyRequest().authenticated())
		.sessionManagement(session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
		.oauth2ResourceServer(server->server.jwt(Customizer.withDefaults()))
		.build();
	} 

}
