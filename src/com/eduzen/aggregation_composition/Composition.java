package com.eduzen.aggregation_composition;

import java.util.ArrayList;
import java.util.List;

import com.eduzenedutech.model.Charger;
import com.eduzenedutech.model.Computer;
import com.eduzenedutech.model.Mobile;
import com.eduzenedutech.model.OS;

public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Computer computer=createComputer();    
		computer.setOs(new OS("Mint",12.0));
		System.out.println(computer);	
		computer=null;
		System.out.println(computer);	

	}
	private static Computer createComputer()
	{
		ArrayList< OS>list=new ArrayList<OS>();
		list.add(new OS("Windows",11.0));
		Computer computer=new Computer("HP", "V 30",list);
		return computer;
	
	}

}
