package com.example.demo.user;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;


@Component
public class UserQuery implements GraphQLQueryResolver {
  public User getUser(String id) {
    return User.builder().id(id).name("John Doe").age(30).build();
  }
 

}///~

