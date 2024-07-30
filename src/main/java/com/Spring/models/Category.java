package com.Spring.models;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="category")
public class Category 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int catid;
	
	@Column(name="catnm")
	private String catnm;
	


	//mappedBy is replaced by targetEntity
	
	@OneToMany(targetEntity = Product.class)	
	private Set<Product> LP;

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public String getCatnm() {
		return catnm;
	}

	public void setCatnm(String catnm) {
		this.catnm = catnm;
	}

	
}
