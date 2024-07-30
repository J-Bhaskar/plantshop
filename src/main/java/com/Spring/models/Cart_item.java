package com.Spring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cart_item")
public class Cart_item 
{
	
	@Id
	private int id;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cart_id")
	private Cart CR;
	
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="product_id")
	private Product PR;
	
	
	@Column(name="qty")
	private int qty;

	public Cart getCR() {
		return CR;
	}

	public void setCR(Cart cR) {
		CR = cR;
	}

	public Product getPR() {
		return PR;
	}

	public void setPR(Product pR) {
		PR = pR;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
