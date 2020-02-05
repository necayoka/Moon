package com.neca.HibernateMoonProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Computer {

	@Id
	private int cid;
	private String name;
	private int size;
	
	@ManyToOne
	@JoinColumn(name = "merging_id", nullable = false)
	private Alien alien;
	
	public int getId() {
		return cid;
	}
	public void setId(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Alien getAlien() {
		return alien;
	}
	public void setAlien(Alien alien) {
		this.alien = alien;
	}
	
	public Computer() {
		super();
	}
	public Computer(int cid, String name, int size, Alien alien) {
		super();
		this.cid = cid;
		this.name = name;
		this.size = size;
		this.alien = alien;
	}
	
	@Override
	public String toString() {
		return "Computer [cid=" + cid + ", name=" + name + ", size=" + size + ", alien=" + alien + "]";
	}
	
}
