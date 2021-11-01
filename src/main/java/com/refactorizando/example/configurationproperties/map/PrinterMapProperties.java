package com.refactorizando.example.configurationproperties.map;

import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class PrinterMapProperties {

  private final ConfigProperties configProperties;

  @PostConstruct
  public void init() {

    log.info("============Properties ================");

    configProperties.getClients().forEach((k,v)-> {
      log.info("Host {} ", v.getHost());
      log.info("Port {} ", v.getPort());
    });

  }
}
