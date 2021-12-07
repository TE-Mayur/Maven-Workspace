package com.te.console.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employees")
@Data
public class EmployeesInfo implements Serializable {

	public EmployeesInfo() {
	}

	@Column(name = "ename")
	private String name;

	@Id
	@Column(name = "empno")
	private Integer id;

	@Column(name = "job")
	private String desgination;

	@Column
	private Date hiredate;

	@Column
	private Double salary;

	@Column
	private String password;

}
