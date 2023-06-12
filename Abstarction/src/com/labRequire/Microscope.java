package com.labRequire;
public class Microscope extends LabRequirement {
	private int magnification;
	static int MIN_MAGNIFICATION = 1;

	public Microscope(String manufacturer, String model, int year, int mag) {
		super(manufacturer, model, year);
		magnification = mag;
	}

	public Microscope() {
	}

	public int getMagnification() {
		if (magnification < MIN_MAGNIFICATION) {
			System.out.println("Please enter valid magnification");
		}
		return magnification;
	}

	public void setMagnification(int magnification1) {
		magnification = magnification1;
	}

	@Override
	public void performMaintanance() {
		System.out.println("Microscope maintenance: Clean the lenses and check the light source");
	}

}
