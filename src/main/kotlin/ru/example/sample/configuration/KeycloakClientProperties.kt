package ru.example.sample.configuration

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("keycloak-client")
class KeycloakClientProperties(var isEnabled: Boolean = false)
