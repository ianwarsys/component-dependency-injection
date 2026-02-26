package com.devianavila.order_calculation;

import com.devianavila.order_calculation.entities.Order;
import com.devianavila.order_calculation.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class OrderCalculationApplication implements CommandLineRunner {

    @Autowired
    OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(OrderCalculationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Order order1 = new Order(1034, 150.00, 20.0);
        Order order2 = new Order(2282, 800.00, 10.0);
        Order order3 = new Order(1309, 95.90, 0.0);

        System.out.printf("Pedido código %d \nValor total: R$ %.2f\n", order1.getCode(), orderService.total(order1));
        System.out.printf("\nPedido código %d \nValor total: R$ %.2f\n", order2.getCode(), orderService.total(order2));
        System.out.printf("\nPedido código %d \nValor total: R$ %.2f\n", order3.getCode(), orderService.total(order3));

    }
}
