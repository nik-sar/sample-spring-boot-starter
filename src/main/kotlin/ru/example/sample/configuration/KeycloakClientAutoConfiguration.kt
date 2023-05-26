package ru.example.sample.configuration

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(value = ["ru.example"])
@EnableConfigurationProperties(value = [ KeycloakClientProperties::class ])
class KeycloakClientAutoConfiguration
