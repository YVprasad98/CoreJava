package com.labRequire;

public class Centrifuge extends LabRequirement{
	int maxRPM;
	static int MIN_RPM=500;
	
	public Centrifuge(String manufacturer, String model, int year,int maxRPM1) {
		super(manufacturer, model, year);
		maxRPM=maxRPM1;
	}
	public int getMaxRPM() {
		return maxRPM;
	}
	public void setMaxRPM(int maxRPM) {
		if(maxRPM>=MIN_RPM) {
			System.out.println("RPM is valid");
		}
	} 

    @Override
	public void performMaintanance() {
		System.out.println("Centrifuge maintenance: Check the rotor, clean the chamber, and lubricate the spindle");

	}
	
}
