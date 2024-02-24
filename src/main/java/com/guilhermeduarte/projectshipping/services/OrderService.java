package com.guilhermeduarte.projectshipping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilhermeduarte.projectshipping.entities.Order;

@Service
public class OrderService {
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {		
		double valueTotal = order.getBasic() - ((order.getDiscount() / 100) * order.getBasic()) + shippingService.shipment(order);
		
		return valueTotal;
	}
}
