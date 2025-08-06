package com.devsuperior.injecaodependencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.injecaodependencia.entities.Order;
import com.devsuperior.injecaodependencia.services.OrderService;

@SpringBootApplication
public class InjecaodependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(InjecaodependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order pedido1 = new Order(1034, 150.00, 20.0);
		Order pedido2 = new Order(2282, 800.00, 10.0);
		Order pedido3 = new Order(1309, 95.90, 0.0);
		List<Order> pedidos = List.of(pedido1,pedido2,pedido3);
		pedidos.forEach(pedido ->{
			System.out.println("Pedido código " + pedido.getCode());
			System.out.println("Valor total: R$" +orderService.total(pedido));
		});
	}

}
