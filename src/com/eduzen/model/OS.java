package com.eduzenedutech.model;

public class OS {
	public OS(String name, double version) {
		super();
		this.name = name;
		this.version = version;
	}
	String name;
	double version;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
