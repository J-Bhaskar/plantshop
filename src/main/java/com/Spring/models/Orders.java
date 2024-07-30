package com.Spring.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Orders 
{

	@Id
	private int id;
	
	@Column(name="address")
	private String address;
	
	@Column(name="price")
	private int price;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ordstatus")
	private Order_status OS;
	

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	private Users UR;

	

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Order_status getOS() {
		return OS;
	}


	public void setOS(Order_status oS) {
		OS = oS;
	}


	public Users getUR() {
		return UR;
	}


	public void setUR(Users uR) {
		UR = uR;
	}

	
}
