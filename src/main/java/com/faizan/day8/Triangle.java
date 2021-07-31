package com.faizan.day8;

import javax.annotation.Resource;

public class Triangle implements Shape {
	
	@Resource(name="point1")
	private Point pointA;
	
	@Resource(name="point2")
	private Point pointB;
	
	@Resource(name="point3")
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public String getMessage() {
		StringBuilder ret=new StringBuilder("");
		ret.append("Trianlge With Points\t\t");
		ret.append(pointA+"\t\t");
		ret.append(pointB+"\t\t");
		ret.append(pointC);
		return ret.toString();
	}

}
