package com.refactorizando.example.configurationproperties.immutable;

import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;


@Slf4j
@RequiredArgsConstructor
@Configuration
public class PrinterImmutableProperties {

  private final ImmutableProperties immutableProperties;


  @PostConstruct
  public void init() {

    log.info("============Properties ================");
    log.info("Host {} ", immutableProperties.getHost());

  }
}
