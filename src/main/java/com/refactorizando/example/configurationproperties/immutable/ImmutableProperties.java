package com.refactorizando.example.configurationproperties.immutable;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "configuration.clients.product")
@ConstructorBinding
@RequiredArgsConstructor
@Getter
public class ImmutableProperties {

  private final String host;


  private final int port;
}
