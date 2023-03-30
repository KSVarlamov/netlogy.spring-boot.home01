package ru.netology.task01.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;


public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}