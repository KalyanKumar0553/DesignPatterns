package com.src.creational.factory;


interface OS {
	void display();
}

class Android implements OS {
	@Override
	public void display() {
		System.out.println("I made with Android");
	}
}

class Microsoft implements OS {
	@Override
	public void display() {
		System.out.println("I made with Microsoft");
	}
}


class IOS implements OS {
	@Override
	public void display() {
		System.out.println("I made with IOS");
	}
}

class MobileFactory {
	public static OS getMobileOS(String mobile) {
		switch(mobile) {
			case "Samsung" : 
				return new Android();
			case "Nokia" : 
				return new Microsoft();
			case "Apple" : 
				return new IOS();
			default:
				return new Android();
		}
	}
}
