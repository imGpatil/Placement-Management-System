package com.tns.entities;

import java.io.Serializable;
import java.util.*;
import java.time.*;
import javax.persistence.*;

@Entity  // This annotation used to define class as a entity class.
@Table(name= "placement")  // This annotation specifies table name in database

public class Placement implements Serializable {
	
	private static final long serialVersionUID= 1L;
	
	//Defining private instance variable
	
	// With Id annotation we are indicating that this is a primary key field
	@Id
	// Column annotation we are indicating the actual name of column of relational world
	@Column(name= "id")
	private long id;
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "college")
	private String college;
	
	@Column(name= "date")
	private String LocalDate;
	
	@Column(name= "qualification")
	private String qualification;
	
	@Column(name= "year")
	private int year;

	// Defining getter and setter methods to read and write private instance variable
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

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getLocalDate() {
		return LocalDate;
	}

	public void setLocalDate(String localDate) {
		this.LocalDate = localDate;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}