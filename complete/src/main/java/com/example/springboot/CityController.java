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

	Country country1 = new Country(1,"España","Madrid");
	Country country2 = new Country(2,"Francia","Paris");
	Country country3 = new Country(3,"Portugal","Lisboa");
	Country country4 = new Country(4,"Alemania","Berlin");
	Country country5 = new Country(5,"Andorra","Andorra la Vieja");



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
	
	@GetMapping("/cities/{id}")
	public City hola(@PathVariable Integer id){

		ArrayList<City> cities = new ArrayList<>();
		cities.add(city1);
		cities.add(city2);
		cities.add(city3);
		cities.add(city4);
		cities.add(city5);
		return cities.get(id-1);
	}

	@GetMapping("/countries")
	public ArrayList<Country> CountryList() {
		ArrayList<Country> countries = new ArrayList<>();
		countries.add(country1);
		countries.add(country2);
		countries.add(country3);
		countries.add(country4);
		countries.add(country5);
	return countries;
	}

	@GetMapping("/countries/{id}")
	public Country CountryId(@PathVariable Integer id) {
		
		ArrayList<Country> countries = new ArrayList<>();
		countries.add(country1);
		countries.add(country2);
		countries.add(country3);
		countries.add(country4);
		countries.add(country5);
	return countries.get(id-1);
	}
}