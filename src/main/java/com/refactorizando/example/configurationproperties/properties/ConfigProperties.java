package com.refactorizando.example.configurationproperties.properties;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "configuration.clients.product")
@Getter
@Setter
public class ConfigProperties {

  private String host;

  private int port;
}
