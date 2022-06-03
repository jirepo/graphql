package com.example.demo.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Address {
  String city;
  public Address() {
  }
  public Address(String city) {
    this.city = city;
  }
  
}
