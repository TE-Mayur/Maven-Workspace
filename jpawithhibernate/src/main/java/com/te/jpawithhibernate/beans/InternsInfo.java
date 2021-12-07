package com.te.jpawithhibernate.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder.In;

import lombok.Data;

@Entity
@Table(name = "interns")
@Data
public class InternsInfo implements Serializable {

	public InternsInfo() {}
	
	@Column
	private String name;

	@Id
	@Column
	private Integer id;

	@Column(name = "dob")
	private Date dateOfBirth;

	@Column(name = "role")
	private String designation;

	@Column
	private String gender;

	@Column
	private Double salary;
	
	@Column
	private Long mobile;

	@Column(name = "deptid")
	private Integer deptId;

	@Column(name = "email_id")
	private String emailId;

}
