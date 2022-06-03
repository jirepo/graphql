package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class PostMutationResolver implements GraphQLMutationResolver {

  public Post addPost(String id, String title, String category, String authorId) {
    return Post.builder().id(id).title(title).category(category).authorId(authorId).build();
  }

  public List<Post> addPostWithInput(Post post) {

    System.out.println(post.getTitle());

    List<Post> list = new ArrayList<Post>() {
      {
        add(Post.builder().id("1").title("Post 1").category("Category 1").authorId("1").build());
        add(Post.builder().id("2").title("Post 2").category("Category 2").authorId("2").build());
        add(Post.builder().id("3").title("Post 3").category("Category 3").authorId("3").build());
        add(Post.builder().id("4").title("Post 4").category("Category 4").authorId("4").build());
        add(Post.builder().id("5").title("Post 5").category("Category 5").authorId("5").build());
      }
    };
    return list;
  }
}
