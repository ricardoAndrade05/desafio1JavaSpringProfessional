package com.devsuperior.injecaodependencia.entities;

public class Order {

	private Integer code;
	private Double basic;
	private Double discount;
	
	public Order(Integer code, Double basic, Double discount) {
		super();
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}

	public Integer getCode() {
		return code;
	}

	public Double getBasic() {
		return basic;
	}

	public Double getDiscount() {
		return discount;
	}

}
