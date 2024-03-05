package com.ramesh.threespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpbootthreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbootthreeApplication.class, args);
    System.out.println("Application started successfully");
	}

 @GetMapping("/hello")
  public String hello(){
    return "Hello";
  }	
}
