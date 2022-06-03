package com.example.demo.user;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class UserMutationResolver implements GraphQLMutationResolver  {
    public User addUser(String id, String name, int age) {
      return User.builder().id(id).name(name).age(age).build();
    }

    public User addUserWithObject(UserInput user) {
      return new User(user.getId(), user.getName(), user.getAge(), user.getAddress());
    }

}////~
