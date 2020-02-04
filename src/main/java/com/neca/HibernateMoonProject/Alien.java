package com.neca.HibernateMoonProject;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Alien {

	@Id
	private int aid;
	private String aname;
	
	@OneToMany(mappedBy = "alien")
	private Collection<Computer> computers = new ArrayList<Computer>();
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Collection<Computer> getComputers() {
		return computers;
	}
	public void setComputers(Collection<Computer> computers) {
		this.computers = computers;
	}
	
}
