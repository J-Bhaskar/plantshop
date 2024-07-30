package com.Spring.models;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cart")
public class Cart 
{	
	@Id
	private int id;
		
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	private Users UR;
	
	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getUR() {
		return UR;
	}

	public void setUR(Users uR) {
		UR = uR;
	}	

}
