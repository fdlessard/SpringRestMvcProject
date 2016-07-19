package com.lessard;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Unit test for simple SpringMcvSampleController.
 */

public class HelloWorldControllerTest {

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
	}

	@Test
	public void testHello() throws Exception{

		mockMvc.perform(get("/hello")).andExpect(status().isOk())
				.andExpect(content().string("Hello World"));
			
		
//		mockMvc.perform(get("/hello")).andExpect(status().isOk())
//		.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
//		.andExpect(jsonPath("$.street").value("12345 Horton Ave"));		
		
		
	}
}
