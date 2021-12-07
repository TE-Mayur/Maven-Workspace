package com.te.jpawithhibernate.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name =" movie_info")
@Data
public class MovieInfo {
	
	@Id
	@Column
	private Integer movieId;
	
	@Column
	private String name;
}
