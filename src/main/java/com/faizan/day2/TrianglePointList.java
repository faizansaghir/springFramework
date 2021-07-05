package com.faizan.day2;

import java.util.List;

public class TrianglePointList {
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public String toString() {
		StringBuilder ret=new StringBuilder("");
		ret.append("TRIANGLE\n");
		for(Point point : points) {
			ret.append("Point : " + point + "\n");
		}
		return ret.toString();
	}
}
