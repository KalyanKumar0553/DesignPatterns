package com.src.structural.decorator;

public class ToppingsPizza extends PizzaDecorator {

	public ToppingsPizza(Pizza pizza) {
		super(pizza);
	}

	@Override
	public int getCost() {
		return super.getCost() + 5;
	}

	@Override
	public String description() {
		return super.description() + ", Mexican Topping";
	}

}
