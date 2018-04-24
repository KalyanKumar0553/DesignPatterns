package com.src.creational;

public class Phone {
	private String name;
	private int version;
	private String os;
	private Phone() {}
	public String getName() {
		return this.name;
	}
	public String getOs() {
		return this.os;
	}
	public int getVersion() {
		return this.version;
	}
	public class PhoneBuilder {
		private String name;
		private int version;
		private String os;
		public PhoneBuilder() {
			
		}
		public PhoneBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public PhoneBuilder setVersion(int version) {
			this.version = version;
			return this;
		}
		public PhoneBuilder setOs(String os) {
			this.os = os;
			return this;
		}
		public Phone build() {
			Phone result = new Phone();
			result.name = this.name;
			result.version = this.version;
			result.os = this.os;
			return result;
		}
	}
}
