package br.com.poc.uaa.authserver.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class SecurityUtility {

    private static final String SALT = "qXRMxsLj8NHZt1jz98WFsHxECmIrjRprziZnEnNmblNTBQ8JSEN42oZUe8RoZzo";

    @Bean
    public static BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
    }

}
