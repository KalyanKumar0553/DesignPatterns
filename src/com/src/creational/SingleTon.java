package com.src.creational;

public class SingleTon implements Cloneable {
	private static SingleTon instance;
	private SingleTon() throws InstantiationException {
		if(instance != null)
			throw new InstantiationException();
	}
	public static SingleTon getInstance() throws InstantiationException {
		if(instance==null) {
			synchronized(SingleTon.class) {
				if(instance == null) {
					instance = new SingleTon();
				}
			}
		}
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}
}
