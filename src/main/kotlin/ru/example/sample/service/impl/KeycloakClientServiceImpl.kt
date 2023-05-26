package ru.example.sample.service.impl

import org.apache.commons.logging.LogFactory
import org.springframework.stereotype.Service
import ru.example.sample.service.KeycloakClientService

@Service
class KeycloakClientServiceImpl : KeycloakClientService {

    companion object {
        private val log = LogFactory.getLog(KeycloakClientServiceImpl::class.java)
    }

    override fun createUser() {
        log.debug("Try to create user")
    }

}
