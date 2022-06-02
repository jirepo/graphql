package com.example.demo.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {
  String id; 
  String name; 
  int age; 
}


