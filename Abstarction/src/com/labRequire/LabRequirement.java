package com.labRequire;

public  abstract class LabRequirement {
	
	private String manufacturer;
	
	private String model;
	
	private int year;
	
	static final int MIN_YEAR = 1950;

	public LabRequirement() {
	}

	public LabRequirement(String manufacturer1, String model1, int year1) {
		manufacturer = manufacturer1;
		model = model1;
		year = year1;
	}

	public String getManufacturer() {
		if(manufacturer==null) {
			 return "please enter a manufacturer";
			}
		return manufacturer;
			}
			

	public void setManufacturer(String man) {

		manufacturer=man;
	}

	public String getModel() {
		if(model==null) {
		 return "please enter a modle";
		}
		return model;
		
		}

	public void setModel(String mod) {
		model = mod;
	}

	public int getYear() {
		if(year==0) {
			System.out.println("please enter a valid year");
			}
			return year;
			}

	public void setYear(int y) {
		year = y;
	}

	public static int getMinYear() {
		return MIN_YEAR;
	}

	abstract void performMaintanance();
	
}
	


