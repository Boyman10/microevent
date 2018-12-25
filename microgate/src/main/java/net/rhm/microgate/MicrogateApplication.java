package net.rhm.microgate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * See https://www.baeldung.com/spring-security-oauth2-enable-resource-server-vs-enable-oauth2-sso
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableOAuth2Sso
public class MicrogateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrogateApplication.class, args);
    }

}

