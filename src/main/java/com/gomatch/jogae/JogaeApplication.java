package com.gomatch.jogae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class JogaeApplication extends SpringBootServletInitializer {

    public static void main(final String[] args) {
        SpringApplication.run(JogaeApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
        return application.sources (JogaeApplication.class);
    }

}
