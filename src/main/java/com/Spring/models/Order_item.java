package com.Spring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="order_item")
public class Order_item 
{
	@Id
	private int id;
			
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="order_id")
	private Orders OR;
	

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="product_id")
	private Product PR;
	
	@Column(name="price")
	private int price;

	
	@Column(name="qty")
	private int qty;


	public Orders getOR() {
		return OR;
	}


	public void setOR(Orders oR) {
		OR = oR;
	}


	public Product getPR() {
		return PR;
	}


	public void setPR(Product pR) {
		PR = pR;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
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
