package com.eduzen.aggregation_composition;

import com.eduzenedutech.model.Charger;
import com.eduzenedutech.model.Mobile;
import com.eduzenedutech.model.OS;

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile=new Mobile("VIVO", "V 30 PRO");
		Charger charger=new Charger(67,"Portronics","C-Type");
		mobile.setCharger(charger);
		mobile=null;
		System.out.print(mobile);
		System.out.print(charger);
	}

}
