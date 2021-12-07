package com.te.carapplication.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name ="car_Details")
@Data
public class CarDetails implements Serializable{
	
	public CarDetails() {}

	@Id
	@Column
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String company;
	
	@Column
	private String fuelType;
	
	@Column
	private String powerSteering;
	
	@Column
	private String breakSystem;
	
	@Column
	private Double showroomPrice;
	
	@Column
	private Double onRoadPrice;
	
	@Column
	private String imageUrl;
	 
	@Column
	private Double milage;
	
	@Column
	private Integer seatingCapacity;
	
	@Column
	private Integer engineCapacity;
	
	@Column
	private String gearType;
	
}
