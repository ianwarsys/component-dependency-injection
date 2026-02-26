package com.devianavila.order_calculation;

import com.devianavila.order_calculation.entities.Order;
import com.devianavila.order_calculation.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class OrderCalculationApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderCalculationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			double basic, discount;
			int code;
			code = sc.nextInt();
			basic = sc.nextDouble();
			discount = sc.nextDouble();

			Order order = new Order(code, basic, discount);

			double total = orderService.total(order);

			System.out.printf("Pedido código %d \nValor total: R$ %.2f", order.getCode(), total);
		}
	}
}
