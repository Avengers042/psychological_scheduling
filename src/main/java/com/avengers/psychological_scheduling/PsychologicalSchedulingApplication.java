package com.avengers.psychological_scheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PsychologicalSchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsychologicalSchedulingApplication.class, args);
	}
}
