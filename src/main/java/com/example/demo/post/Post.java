package com.example.demo.post;

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
  public Post() {
  }
  public Post(String id, String title, String category, String authorId) {
    this.id = id;
    this.title = title;
    this.category = category;
    this.authorId = authorId;
  }
}