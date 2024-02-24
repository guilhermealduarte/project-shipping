package com.guilhermeduarte.projectshipping;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.guilhermeduarte.projectshipping.entities.Order;
import com.guilhermeduarte.projectshipping.services.OrderService;

@SpringBootApplication
public class ProjectShippingApplication implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ProjectShippingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Código do Pedido:");
		String code = sc.next();
		System.out.println("Valor do Pedido:");
		double basicValue = sc.nextDouble();
		System.out.println("Desconto do Pedido:");
		double discountValue = sc.nextDouble();
		
		Order order = new Order(code, basicValue, discountValue);
		System.out.println("Pedido código: " + code);
		System.out.println("Valor Total: " + orderService.total(order));
				
		sc.close();
		
	}
}
