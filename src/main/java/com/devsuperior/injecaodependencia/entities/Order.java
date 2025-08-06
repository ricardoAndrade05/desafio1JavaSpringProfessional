package com.devsuperior.injecaodependencia.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Order {

	private Integer code;
	private Double basic;
	private Double discount;
	
}
