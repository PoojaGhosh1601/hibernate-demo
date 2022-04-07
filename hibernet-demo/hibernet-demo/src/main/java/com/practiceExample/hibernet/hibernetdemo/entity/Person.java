package com.practiceExample.hibernet.hibernetdemo.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

public class Person {

	private int id;
	private String name;
	private String location;
	private Timestamp birthDate;

	public Person(int id, String name, String location, Timestamp localDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = localDate;
	}

	public Person() {

	}

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Timestamp getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Timestamp timestamp) {
		this.birthDate = timestamp;
	}

	@Override
	public String toString() {
		return "\n Person [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}

}
