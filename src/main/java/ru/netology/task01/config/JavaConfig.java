package ru.netology.task01.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(
            value = "netology.profile.dev",
            havingValue = "true",
            matchIfMissing = false
    )
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(
            value = "netology.profile.dev",
            havingValue = "false",
            matchIfMissing = true
    )
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}