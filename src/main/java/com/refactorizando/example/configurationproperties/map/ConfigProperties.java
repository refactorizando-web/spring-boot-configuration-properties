package com.refactorizando.example.configurationproperties.map;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "configuration")
@Getter
@Setter
public class ConfigProperties {

  private Map<String, ClientProperties> clients;


}
