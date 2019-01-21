package com.src.creational.immutable;

import java.util.ArrayList;

final class Immutable {
	private final String name;
	private final int id;
	private final ArrayList address;
	public Immutable(int id,String name,ArrayList address) {
		this.id =id;
		this.name =name;
		this.address = new ArrayList(address);
	}
	public String getName() {
		return new String(name);
	}
	public int getId() {
		return id;
	}
	public ArrayList getAddress() {
		return new ArrayList(address);
	}
}
