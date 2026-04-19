package com.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class JavaDevopsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaDevopsAppApplication.class, args);
	}

}


@RestController
class HelloController {

    @GetMapping("/")
    public String home() {
        return "Java DevOps App Running successfully🚀";
    }
}