package com.erich.apistarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class ApistarterApplication {


	@RequestMapping("/")
	String home() {
		return "index.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(ApistarterApplication.class, args);
	}
}
//asdfjslkadjf