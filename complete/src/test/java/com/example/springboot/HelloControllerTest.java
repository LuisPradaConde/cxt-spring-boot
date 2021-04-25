package com.example.springboot;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getCountry1() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/countries/1").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json( "{'id': 1, 'name': 'España', 'capital': 'Madrid'} "  ));
	}
	@Test
	public void getCountry2() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/countries/2").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json( "{'id': 2, 'name': 'Francia', 'capital': 'Paris'} "  ));
	}
	@Test
	public void getCountry3() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/countries/3").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json( "{'id': 3, 'name': 'Portugal', 'capital': 'Lisboa'} "  ));
	}
	@Test
	public void getCountry4() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/countries/4").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json( "{'id': 4, 'name': 'Alemania', 'capital': 'Berlin'} "  ));
	}
	@Test
	public void getCountry5() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/countries/5").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json( "{'id': 5, 'name': 'Andorra', 'capital': 'Andorra la Vieja'} "  ));
	}
	@Test
	public void getCity1() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/cities/1").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json( "{'id': 1, 'name': 'Vigo', 'province': 'Pontevedra'} "  ));
	}
	@Test
	public void getCity2() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/cities/2").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json( "{'id': 2, 'name': 'Pontevedra', 'province': 'Pontevedra'} "  ));
	}
	@Test
	public void getCity3() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/cities/3").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json( "{'id': 3, 'name': 'Santiago', 'province': 'A Coruna'} "  ));
	}
	@Test
	public void getCity4() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/cities/4").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json( "{'id': 4, 'name': 'Ourense', 'province': 'Ourense'} "  ));
	}
	@Test
	public void getCity5() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/cities/5").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json( "{'id': 5, 'name': 'Redondela', 'province': 'Pontevedra'} "  ));
	}
	@Test
	public void getCities() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/cities").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json( "[{'id': 1, 'name': 'Vigo', 'province': 'Pontevedra'},{'id': 2, 'name': 'Pontevedra', 'province': 'Pontevedra'},{'id': 3, 'name': 'Santiago', 'province': 'A Coruna'},{'id': 4, 'name': 'Ourense', 'province': 'Ourense'},{'id': 5, 'name': 'Redondela', 'province': 'Pontevedra'}]"  ));
	}
	@Test
	public void getCountries() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/countries").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json( "[{'id': 1, 'name': 'España', 'capital': 'Madrid'},{'id': 2, 'name': 'Francia', 'capital': 'Paris'},{'id': 3, 'name': 'Portugal', 'capital': 'Lisboa'},{'id': 4, 'name': 'Alemania', 'capital': 'Berlin'},{'id': 5, 'name': 'Andorra', 'capital': 'Andorra la Vieja'}]"  ));
	}
}
