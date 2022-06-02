package com.example.demo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
@Builder
public class Post {
  private String id;
  private String title;
  private String category;
  private String authorId;
}