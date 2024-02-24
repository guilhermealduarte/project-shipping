package com.guilhermeduarte.projectshipping.services;

import org.springframework.stereotype.Service;

import com.guilhermeduarte.projectshipping.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
			
		double valueBasic = order.getBasic() - ((order.getDiscount() / 100) * order.getBasic());
		
		double valueShipping = 0;
		
		if(valueBasic < 100.00) {
			valueShipping = 20.00;
		}
		else if((valueBasic > 100.00) && (valueBasic <= 200.00)) {
			valueShipping = 12.00;
		}
		
		return valueShipping; 
	}
}
