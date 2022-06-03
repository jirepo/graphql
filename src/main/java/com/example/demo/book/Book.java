package com.example.demo.book;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Book {
  private String title;
  private Author author; 
  public Book() {
  }
  
  public Book(String title, Author author) {
    this.title = title;
    this.author = author;
  }
}
