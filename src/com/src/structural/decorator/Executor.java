package com.src.structural.decorator;

public class Executor {
	public static void main(String[] args) {
		Pizza pizza = new ToppingsPizza(new MoazarellaPizza(new PlainPizza()));
		System.out.println(pizza.getCost());
		System.out.println(pizza.description());
	}
}
