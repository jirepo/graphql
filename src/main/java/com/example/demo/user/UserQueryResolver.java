package com.example.demo.user;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;


@Component
public class UserQueryResolver implements GraphQLQueryResolver {
  public User getUser(String id) {
    return  User.builder().id(id).name("John Doe").age(30).build();
  }
  public AllowedColor favoriteColor() {
    return AllowedColor.RED;
  }
  

  public String avatar(AllowedColor allowedColor) {
    return allowedColor.name();
  }

}///~

