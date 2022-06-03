package com.example.demo.post;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class GraphqlConfiguration {

  @Bean
  public PostQueryResolver query() {
      return new PostQueryResolver();
  }
  
}///~
