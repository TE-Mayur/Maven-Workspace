package com.te.carapplication.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "admin")
@Data
public class AdminInfo implements Serializable{
	
	public AdminInfo() {}
	
	@Id
	@Column
	private String username;
	
	@Column
	private String password;

}
