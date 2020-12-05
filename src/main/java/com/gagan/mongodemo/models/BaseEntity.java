/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-12-05 19:51:54
 * @modify date 2020-12-05 19:51:54
 * @desc [description]
 */
package com.gagan.mongodemo.models;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable { 
  /**
	 *
	 */
	private static final long serialVersionUID = 1L;

  @Id
  private String id;

  @CreatedBy
  private String createdBy;

  @CreatedDate
  private Date createdDate;

  @LastModifiedBy
  private String updatedBy;

  @LastModifiedDate
  private Date updatedDate;

  @Version
  private Long version;

  private Boolean delete = Boolean.FALSE;

}
