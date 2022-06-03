package com.example.demo.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserInput {
  String id; 
  String name; 
  int age; 
  Address address; 
  public UserInput() {
  }
  public UserInput(String id, String name, int age, Address address) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.address = address; 
  }
}
