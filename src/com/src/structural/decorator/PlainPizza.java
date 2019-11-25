package com.src.structural.decorator;

public class PlainPizza implements Pizza {

	private int cost;

	private String desc;

	public PlainPizza() {
		this.cost = 10;
		this.desc = "Basic Pizza with cheese ";
	}

	@Override
	public int getCost() {
		return this.cost;
	}

	@Override
	public String description() {
		return this.desc;
	}

}
