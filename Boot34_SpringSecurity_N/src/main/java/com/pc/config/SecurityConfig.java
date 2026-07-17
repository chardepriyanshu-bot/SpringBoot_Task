package com.pc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails customer = User.builder()
                .username("raja")
                .password("{noop}rani")
                .roles("CUSTOMER")
                .build();

        UserDetails manager = User.builder()
                .username("ramesh")
                .password("{noop}hyd")
                .roles("MANAGER")
                .build();

        return new InMemoryUserDetailsManager(customer, manager);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .authorizeHttpRequests(auth -> auth
                    //.requestMatchers("/").permitAll()
                    .requestMatchers("/offers").authenticated()
                    .requestMatchers("/balance").hasAnyRole("CUSTOMER", "MANAGER")
                    .requestMatchers("/loanApprove").hasRole("MANAGER")
                    .anyRequest().authenticated()
            )
            .httpBasic(Customizer.withDefaults())
            .exceptionHandling(ex ->
                    ex.accessDeniedPage("/denied"));

        return http.build();
    }
}