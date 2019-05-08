package com.spring.jpa.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
@Column annotation corresponds to the fields in the table
@Id annotation refers to the primary key
@GeneratedValue annotation specifies that the value will be automatically specified for that field
@Entity annotation defines that a class can be mapped to a table
@Table annotation defines the name of the table in the Database
*/

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USER_ID")
	private int id;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "AGE", nullable = false)
	private int age;

	@Column(name = "DESIGNATION", nullable = false)
	private String designation;
	
	@Column(name = "PREFFERED_LANGUAGE", nullable = false)
	private String prefferedLanguage;
	
	@Column(name = "CITY", nullable = false)
	private String city;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPrefferedLanguage() {
		return prefferedLanguage;
	}

	public void setPrefferedLanguage(String prefferedLanguage) {
		this.prefferedLanguage = prefferedLanguage;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
