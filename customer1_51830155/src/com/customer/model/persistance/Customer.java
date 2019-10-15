package com.customer.model.persistance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="customer_table")
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	@NotEmpty(message="name cannot left blank")
	private String name;
	
	@NotEmpty(message="email cannot left blank")
	private String email;
	
	@NotEmpty(message="phoneNo cannot left blank")
	private String phoneNo;
	
	@NotEmpty(message="address cannot left blank")
	private String address;
	
	public Customer() {
		
	}
	public Customer(String name, String email, String phoneNo, String address) {
		
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}