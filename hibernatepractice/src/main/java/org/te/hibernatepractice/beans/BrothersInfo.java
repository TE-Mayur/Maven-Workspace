package org.te.hibernatepractice.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "employees_Info")
@Entity
public class BrothersInfo implements Serializable{
	
	
	public BrothersInfo() {}

	@Id
	@Column(name = "emp_id")
	private Integer id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column
	private String mail;
	
	@Column(name = "pwd")
	private String password;
	
	@Column
	private Date dob;
	
	@Column
	private Long mobile;
}
