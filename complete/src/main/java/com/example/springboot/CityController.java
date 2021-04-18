package com.example.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;

@RestController
public class CityController {
	City city1 = new City(1,"Vigo","Pontevedra");
	City city2 = new City(2,"Pontevedra","Pontevedra");
	City city3 = new City(3,"Santiago","A Coruna");
	City city4 = new City(4,"Ourense","Ourense");
	City city5 = new City(5,"Redondela","Pontevedra");



	@GetMapping("/cities")
	public ArrayList<City> prueba() {
		ArrayList<City> cities = new ArrayList<>();
		cities.add(city1);
		cities.add(city2);
		cities.add(city3);
		cities.add(city4);
		cities.add(city5);
	return cities;
	}