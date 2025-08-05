package com.eduzenedutech.model;

public class Charger {
	private int volt;
	private String brand;
	private String connectorType;
	public Charger(int volt, String brand, String connectorType) {
		this.volt = volt;
		this.brand = brand;
		this.connectorType = connectorType;
	}

	public int getVolt() {
		return volt;
	}
	public void setVolt(int volt) {
		this.volt = volt;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getConnectorType() {
		return connectorType;
	}
	public void setConnectorType(String connectorType) {
		this.connectorType = connectorType;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brand "+this.brand+" Volt "+this.volt;
	}


}
