package com.eduzenedutech.model;

public class Mobile {
private String brand;
private String model;
private OS os;
private Charger charger;
public Mobile(String brand,String model) {
	this.model=model;
	this.brand=brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand,String model) {
	this.brand = brand;
}
public Charger getCharger() {
	return charger;
}
public void setCharger(Charger charger) {
	this.charger = charger;
}
public OS getOs() {
	return os;
}

public void setOs(OS os) {
	this.os=os;
}
}
