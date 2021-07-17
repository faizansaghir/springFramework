package com.faizan.day4;

public class Point {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		return ("("+x+","+y+")");
	}
	public void initA() {
		System.out.println("Bean PointA initialized");		
	}
	public void initB() {
		System.out.println("Bean PointB initialized");		
	}
	public void initC() {
		System.out.println("Bean PointC initialized");		
	}
	public void destroyA() {
		System.out.println("Bean PointA destroyed");		
	}
	public void destroyB() {
		System.out.println("Bean PointB destroyed");		
	}
	public void destroyC() {
		System.out.println("Bean PointC destroyed");		
	}
	public void initMethod() {
		System.out.println("A Point Bean has been initialized");
	}
	public void destroyMethod() {
		System.out.println("A Point Bean has been Destroyed");
	}
}
