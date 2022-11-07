package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventTable")
public class Events {
	
	private String name;
	private String address;
	@Id
	private String mobileno;
	private String emailid;
	private String gender;
	private String event;
	
	public Events(){
		
	}
	
	
	
	public Events(String name, String address, String mobileno, String emailid, String gender, String event) {
		super();
		this.name = name;
		this.address = address;
		this.mobileno = mobileno;
		this.emailid = emailid;
		this.gender = gender;
		this.event = event;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	
	
	

}
