/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-12-05 19:54:49
 * @modify date 2020-12-05 19:54:49
 * @desc [description]
 */
package com.gagan.mongodemo.repository;

import com.gagan.mongodemo.models.Blog;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface BlogRepository  extends ReactiveMongoRepository<Blog, String> {
  Flux<Blog> findByAuthor(String author);

  Flux<Blog> findByAuthorAndDeleteIsFalse(String titleKeyword);

  Mono<Blog> findByTitle(String title);

  Mono<Blog> findByIdAndDeleteIsFalse(String id);

}
