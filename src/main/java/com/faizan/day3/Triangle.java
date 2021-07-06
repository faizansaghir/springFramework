package com.faizan.day3;

import org.springframework.beans.factory.BeanNameAware;


public class Triangle implements BeanNameAware {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private String beanName;
	
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
	
	public String toString() {
		return ("Bean Name : "+beanName+"\nPoint : "+pointA+"\nPoint : "+pointB+"\nPoint : "+pointC+"\n");
	}
	public void setBeanName(String name) {
		this.beanName=name;
		
	}
}
