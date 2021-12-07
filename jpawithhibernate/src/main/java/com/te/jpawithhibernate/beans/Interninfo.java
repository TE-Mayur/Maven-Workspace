package com.te.jpawithhibernate.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="employees_name")
public class Interninfo implements Serializable{
	@Column
	private String empname;
	@Column
	@Id
	private Integer empid;
	@Column
	private Date dob;
	@Column
	private String password;
	@Column
	private Long mobile;
	@Column
	private String mail;
	

}
