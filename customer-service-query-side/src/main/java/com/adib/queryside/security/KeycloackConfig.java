package com.adib.queryside.security;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloackConfig {
    @Bean
    KeycloakSpringBootConfigResolver keycloakSpringBootConfigResolver()
    {
        return new KeycloakSpringBootConfigResolver();
    }

}
