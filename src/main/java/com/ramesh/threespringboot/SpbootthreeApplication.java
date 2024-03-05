package com.ramesh.threespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpbootthreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbootthreeApplication.class, args);
	}

 @GetMapping("/hello")
  public String hello(){
    return "Hello";
  }	
}
