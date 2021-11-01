package com.refactorizando.example.configurationproperties.validator;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;


@ConfigurationProperties(prefix = "configuration.clients.product")
@Getter
@Setter
@Validated
public class ValidatorProperties {

  @NotEmpty
  private  String host;

  @Max(9000)
  @Min(8000)
  private  int port;

}
