package com.secureapi.projectone.admin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppSecureConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // Enforce HTTPS instead of HTTP
                .requiresChannel(channel ->
                        channel.anyRequest().requiresSecure()
                )
                // allows spring form to be used
                .formLogin(Customizer.withDefaults());
                // Authorization section dealing with admin privelge
//                .authorizeHttpRequests(authz -> authz
//                        .requestMatchers("/admin/**").hasRole("ADMIN")
//                        .anyRequest().authenticated()
//                );

        return http.build();
    }
}
