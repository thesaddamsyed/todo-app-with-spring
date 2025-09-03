package com.embarkx.todo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class TodoApplicationTests {
	private final RestTemplate restTemplate;

    TodoApplicationTests (RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

	@Test
	void contextLoads() {
	}

	@Test
	void shouldreturntherequestedvalue() {
		

	}

}
