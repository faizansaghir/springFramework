package com.faizan.day7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangle implements Shape {
	@Autowired
	@Qualifier("firstPoint")
	private Point pointA;
	@Autowired
	@Qualifier("secondPoint")
	private Point pointB;
	@Autowired
	@Qualifier("thirdPoint")
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
