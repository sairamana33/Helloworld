package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
@RestController
class HelloController {

    private int counter = 0;

    @GetMapping("/hello")
    public String helloWorld() {
        counter++;
        return "Hi-Hello-world-" + counter;
    }
}			   