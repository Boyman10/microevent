package net.rhm.microuser.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Testing config retrieval from external Git repo.
 */
@Component
@ConfigurationProperties("test-config")
@RefreshScope
public class AppPropertiesConfiguration {

    // testted string
    private String str;



}
