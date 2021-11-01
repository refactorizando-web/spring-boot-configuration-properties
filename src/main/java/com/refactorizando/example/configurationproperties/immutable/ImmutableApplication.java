package com.refactorizando.example.configurationproperties.immutable;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
@Slf4j
public class ImmutableApplication {

  public static void main(String[] args) {
    SpringApplication.run(ImmutableApplication.class, args);
  }

}
