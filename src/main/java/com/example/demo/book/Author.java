package com.example.demo.book;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Author {
  private String name;
  private List<Book> books; 
  public Author() {
  }
  public Author(String name, List<Book> books) {
    this.name = name;
    this.books = books;
  }
}