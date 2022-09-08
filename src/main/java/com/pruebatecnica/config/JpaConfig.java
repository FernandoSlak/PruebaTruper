package com.pruebatecnica.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.pruebatecnica.*")
public class JpaConfig {

}
