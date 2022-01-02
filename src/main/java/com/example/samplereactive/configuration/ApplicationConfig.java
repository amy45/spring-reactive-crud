package com.example.samplereactive.configuration;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import static io.r2dbc.pool.PoolingConnectionFactoryProvider.MAX_SIZE;
import static io.r2dbc.spi.ConnectionFactoryOptions.*;

@Configuration
@EnableR2dbcRepositories
class ApplicationConfig extends AbstractR2dbcConfiguration {

  @Bean
  public ConnectionFactory connectionFactory() {
    return ConnectionFactories.get(ConnectionFactoryOptions.builder()
              .option(DRIVER, "pool")
              .option(PROTOCOL, "mysql")
              .option(HOST, "localhost")
              .option(USER, "root")
              .option(PASSWORD, "root1234")
              .option(DATABASE, "demo")
              .option(MAX_SIZE, 10)
              .build());
  }
}