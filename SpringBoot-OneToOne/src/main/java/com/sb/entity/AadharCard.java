package com.sb.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AadharCard 
{
	@Id
	private int id;
	
	private String adnum;
	
	@Temporal(TemporalType.DATE)
	@JsonIgnore
	private Date regDate;

	public AadharCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AadharCard(int id, String aadharNumber, Date registerDate) {
		super();
		this.id = id;
		this.adnum = aadharNumber;
		this.regDate = registerDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdnum() {
		return adnum;
	}

	public void setAdnum(String adnum) {
		this.adnum = adnum;
	}



	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "AadharCard [id=" + id + ", adnum=" + adnum + ", regDate=" + regDate + "]";
	}
	
}
