package com.refactorizando.example.configurationproperties.validator;

import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;


@Slf4j
@RequiredArgsConstructor
@Configuration
public class PrinterValidatorProperties {

  private final ValidatorProperties validatorProperties;


  @PostConstruct
  public void init() {

    log.info("============Properties ================");
    log.info("Host {} ", validatorProperties.getHost());
    log.info("Port {} ", validatorProperties.getPort());
  }
}
