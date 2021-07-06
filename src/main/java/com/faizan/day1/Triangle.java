package com.faizan.day1;

public class Triangle {
	private String type;
	private int height;
	public Triangle() {
		this.type="";
		this.height=0;
	}
	public Triangle(String type,int height) {
		this.type=type;
		this.height=height;
	}
	public Triangle(String type) {
		this.type=type;
	}
	public Triangle(int height) {
		this.height=height;
	}
	public String getType() {
		return type;
	}
	public int getHeight() {
		return height;
	}
	public String toString() {
		return (getType()+" triangle Drawn From Object Provided By Spring Application Context of height "+getHeight());
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
