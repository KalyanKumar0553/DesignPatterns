package com.src.structural.decorator;

public class MoazarellaPizza extends PizzaDecorator {

	public MoazarellaPizza(Pizza pizza) {
		super(pizza);
	}

	@Override
	public int getCost() {
		return super.getCost()+5;
	}

	@Override
	public String description() {
		return super.description()+" with Mozarella";
	}
	
}
