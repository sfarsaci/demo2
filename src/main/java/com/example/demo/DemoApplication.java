package com.example.demo;

import com.atlassian.obsvs.Initializer;
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.OpenTelemetry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @org.springframework.context.annotation.Configuration
    public static class Configuration {
        @PostConstruct
        public void initObsvs() {
            Initializer.init();
        }

        @Bean
        public OpenTelemetry otel() {
            return GlobalOpenTelemetry.get();
        }
    }
}
