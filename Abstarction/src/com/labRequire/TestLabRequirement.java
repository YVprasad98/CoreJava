package com.labRequire;

public class TestLabRequirement {
	public static void main(String[] args) {
		Microscope ms = new Microscope("Nikon","E200",2021,1000);

		System.out.println("Microscope Details:");
		System.out.println("Manfacture :" + ms.getManufacturer());
		System.out.println("Model :" + ms.getModel());
		System.out.println("Year :" + ms.getYear());
		System.out.println("Magnification :" + ms.getMagnification());
		System.out.println();
		
		Centrifuge c = new Centrifuge("EPPEDORF", "5424R", 2020, 15000);
		System.out.println("Centifuge Details:");
		System.out.println("Manufacturer :"+c.getManufacturer());
		System.out.println("Model :"+c.getModel());
		System.out.println("Year :"+c.getYear());
		System.out.println("Max RPM :"+c.getMaxRPM());
		c.performMaintanance();
	}

}
