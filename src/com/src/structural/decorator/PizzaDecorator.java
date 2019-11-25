package com.src.structural.decorator;

abstract class PizzaDecorator implements Pizza {
	private Pizza pizza;

	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
		System.out.println(this);
	}

	@Override
	public int getCost() {
		return pizza.getCost();
	}

	@Override
	public String description() {
		return pizza.description();
	}
}
