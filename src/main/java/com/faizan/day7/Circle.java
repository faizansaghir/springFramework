package com.faizan.day7;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle implements Shape{
	Point centre;

	public Point getCentre() {
		return centre;
	}
	@Autowired
	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public String getMessage() {
		String ret="Circle with centre\t\t"+centre;
		return ret;
	}
}
