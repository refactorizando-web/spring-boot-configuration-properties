package com.refactorizando.example.configurationproperties.properties;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
@Slf4j
public class PropertiesApplication {

  public static void main(String[] args) {
    SpringApplication.run(PropertiesApplication.class, args);
  }

}
