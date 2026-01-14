package com.sb.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person 
{
	@Id
	private int pid;
	private String pname;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AadharCard aadhar;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int pid, String pname, AadharCard aadhar) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.aadhar = aadhar;
	}

	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public AadharCard getAadhar() {
		return aadhar;
	}

	public void setAadhar(AadharCard aadhar) {
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", aadhar=" + aadhar + "]";
	}
	
	
	
	
}
