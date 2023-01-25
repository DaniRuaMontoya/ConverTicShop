package com.convertic.ConverTicShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})

public class ConverTicShopApplication {
	@GetMapping("/tienda")
	public String tienda(){
		return "Hola";
	}


	public static void main(String[] args) {
		SpringApplication.run(ConverTicShopApplication.class, args);
	}

}
