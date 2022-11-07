package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atmTable")

public class Atmpin {
	
	@Id
	private Long oldpin;
	private Long newpin;
	private Long confirmpin;
	
	public Atmpin() {
		
	}
	
	
	public Long getOldpin() {
		return oldpin;
	}
	public void setOldpin(Long oldpin) {
		this.oldpin = oldpin;
	}
	public Long getNewpin() {
		return newpin;
	}
	public void setNewpin(Long newpin) {
		this.newpin = newpin;
	}
	public Long getConfirmpin() {
		return confirmpin;
	}
	public void setConfirmpin(Long confirmpin) {
		this.confirmpin = confirmpin;
	}
	
	
	
	
	
	
	

}
