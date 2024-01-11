package com.natureapi.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;


@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Date creation_date;
	@Enumerated(EnumType.STRING)
	private Categorie category;
	private Date appointDate;
	private long userId;
	
	
	
	public enum Categorie{
		NATUROPATHE,
		DIETETICIENNE
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getCreation_date() {
		return creation_date;
	}


	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}


	public Categorie getCategory() {
		return category;
	}


	public void setCategory(Categorie category) {
		this.category = category;
	}


	public Date getAppointDate() {
		return appointDate;
	}


	public void setAppointDate(Date appointDate) {
		this.appointDate = appointDate;
	}




	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}


	public Appointment() {
		super();
	}
	
	
	
	
}
