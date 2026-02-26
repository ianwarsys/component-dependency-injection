package com.devianavila.order_calculation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderCalculationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OrderCalculationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Command line test");
	}
}
