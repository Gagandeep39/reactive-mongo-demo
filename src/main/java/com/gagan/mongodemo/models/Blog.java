/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-12-05 19:53:42
 * @modify date 2020-12-05 19:53:42
 * @desc [description]
 */
package com.gagan.mongodemo.models;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "blog")
public class Blog extends BaseEntity {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@TextIndexed
  private String title;

  private String content;

  @Indexed
  private String author;
}