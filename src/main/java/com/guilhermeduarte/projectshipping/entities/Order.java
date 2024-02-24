package com.guilhermeduarte.projectshipping.entities;

public class Order {
	private String code;
	
	private double basic;
	
	private double discount;
	
	public Order() {
	}

	public Order(String code, double basic, double discount) {
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
