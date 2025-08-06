package com.devsuperior.injecaodependencia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.injecaodependencia.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;

	public double total(Order order) {
		return (order.getBasic() - (order.getBasic() * (order.getDiscount() / 100))) + shippingService.shipment(order);
	}

}
