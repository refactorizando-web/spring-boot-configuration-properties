package com.refactorizando.example.configurationproperties.map;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
@Slf4j
public class MapApplication {

  public static void main(String[] args) {
    SpringApplication.run(MapApplication.class, args);
  }

}
