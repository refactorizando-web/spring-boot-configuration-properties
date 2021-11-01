package com.refactorizando.example.configurationproperties.validator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
@Slf4j
public class ValidatorApplication {

  public static void main(String[] args) {
    SpringApplication.run(ValidatorApplication.class, args);
  }

}
