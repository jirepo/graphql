package com.example.demo;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;


@Component
public class PostMutationResolver implements GraphQLMutationResolver  {
    public Post addPost(String id, String title, String category, String authorId) {
      return Post.builder().id(id).title(title).category(category).authorId(authorId).build();
    }
}
