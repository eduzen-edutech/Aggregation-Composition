package com.eduzenedutech.model;

import java.util.List;

public class Computer {
	String brand;
	String model;
	List<OS> osLst;
	public Computer(String brand, String model, List<OS> osLst) {
		this.brand = brand;
		this.model = model;
		this.osLst = osLst;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public List<OS> getOs() {
		return osLst;
	}
	public void setOs(OS os) {
		this.osLst.add(os);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brand: "+this.brand+" "+"OS-List "+this.osLst.toString()+" Model "+this.model;
	}

}
