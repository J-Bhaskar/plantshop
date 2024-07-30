package com.Spring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;


@Entity
@Table(name="product")
public class Product 
{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="prnm")
	private String prnm;
	
	@Column(name="price")
	private int price;
	
	@Column(name="qty")
	private int qty;
	
	
	@Column(name="pic")
	private byte[] pic;
	
	@Column(name="descr")
	private String desc;
	
	
	
	

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ct_catid")
	private Category CT;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrnm() {
		return prnm;
	}

	public void setPrnm(String prnm) {
		this.prnm = prnm;
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


	

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	

	public Category getCT() {
		return CT;
	}

	public void setCT(Category cT) {
		CT = cT;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	
	

	
}
