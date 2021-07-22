package com.faizan.day6;


public class Circle implements Shape{
	Point centre;

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public String getMessage() {
		String ret="Circle with centre\t\t"+centre;
		return ret;
	}
}
