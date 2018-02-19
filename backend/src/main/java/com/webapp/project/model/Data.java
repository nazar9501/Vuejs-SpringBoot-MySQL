package com.webapp.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Data {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="w1")
	private float w1;
	
	@Column(name="x")
	private float x;
	
	@Column(name="w2")
	private float w2;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getW1() {
		return w1;
	}
	
	public void setW1(float w1) {
		this.w1 = w1;
	}
	
	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public float getW2() {
		return w2;
	}
	
	public void setW2(float w2) {
		this.w2 = w2;
	}		

}
