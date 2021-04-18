package com.example.springboot;

public class City {

	private final Integer id;
	private final String name;
	private final String province;


	public City(Integer id, String name, String province) {
		this.id = id;
		this.name = name;
		this.province = province;
	}


	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getProvince() {
		return province;
	}

}