package com.example.springboot;

public class Country {

	private final Integer id;
	private final String name;
	private final String capital;


	public Country(Integer id, String name, String capital) {
		this.id = id;
		this.name = name;
		this.capital = capital;
	}


	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

}