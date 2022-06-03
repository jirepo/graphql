package com.example.demo;



import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
@Builder
public class PostInput {
  private String id;
  private String title;
  private String category;
  private String authorId;
  private PostInput() {
  }
  private PostInput(String id, String title, String category, String authorId) {
    this.id = id;
    this.title = title;
    this.category = category;
    this.authorId = authorId;
  }
}
