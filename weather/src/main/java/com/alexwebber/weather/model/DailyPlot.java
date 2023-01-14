package com.alexwebber.weather.model;

public class DailyPlot {

	public String label;
	public double y_high;
	public double y_low;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double gety_high() {
		return y_high;
	}

	public void sety_high(double y_high) {
		this.y_high = y_high;
	}

	public double gety_low() {
		return y_low;
	}

	public void sety_low(double y_low) {
		this.y_low = y_low;
	}

	public DailyPlot(String label, double y_high, double y_low) {
		super();
		this.label = label;
		this.y_high = y_high;
		this.y_low = y_low;
	}

}
