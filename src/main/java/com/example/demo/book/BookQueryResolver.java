package com.example.demo.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class BookQueryResolver implements GraphQLQueryResolver {

  /**
   * Book 목록을 반환한다. 
   * @return List<Book>
   */
  public List<Book> getBooks() {
    List<Book> list = new ArrayList<Book>() {
      {
        add(Book.builder().title("자바의 정석1").author(new Author("홍길동",null)).build());
        add(Book.builder().title("자바의 정석2").author(new Author("홍길동",null)).build());
        add(Book.builder().title("자바의 정석3").author(new Author("홍길동",null)).build());
        add(Book.builder().title("자바의 정석4").author(new Author("홍길동",null)).build());
      }
    };
    return list;
  }


  public List<Author> getAuthors() {
    List<Author> list = new ArrayList<Author>() {
      {
        add(Author.builder().name("홍길동").build());
        add(Author.builder().name("임꺽정").build());
        add(Author.builder().name("유관순").build());
        add(Author.builder().name("안중근").build());
      }
    };
    return list;
  }
  public List<Author> getAuthorsByObject(Author author) {
    
    System.out.println(author.getName());

    List<Author> list = new ArrayList<Author>() {
      {
        add(Author.builder().name("홍길동").build());
        add(Author.builder().name("임꺽정").build());
        add(Author.builder().name("유관순").build());
        add(Author.builder().name("안중근").build());
      }
    };
    return list;
  }
  
}///~
