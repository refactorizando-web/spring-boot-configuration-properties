package com.refactorizando.example.configurationproperties.properties;

import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class PrinterProperties {

  private final ConfigProperties configProperties;


  @PostConstruct
  public void init() {

    log.info("============Properties ================");

    log.info("Host {} ", configProperties.getHost());

    log.info("Port {} ", configProperties.getPort());
  }
}
