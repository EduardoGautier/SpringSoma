package com.example.spring.uri1001;



import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc

class SpringSomaTest {
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void getR() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/soma/")
				.param("a","5").param("b", "9"))
				.andExpect(status().isOk())
				.andExpect(content().string("{\"a\":5.0,\"b\":9.0,\"r\":14.0}"));
	}
}