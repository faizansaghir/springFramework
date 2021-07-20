package com.faizan.day5;

import java.util.List;

import org.springframework.beans.factory.BeanNameAware;

public class TrianglePointList implements BeanNameAware {
	private List<Point> points;
	private String beanName;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public String toString() {
		StringBuilder ret=new StringBuilder("");
		ret.append("Bean Name : "+beanName+"\n");
		for(Point point : points) {
			ret.append("Point : " + point + "\n");
		}
		return ret.toString();
	}

	public void setBeanName(String name) {
		this.beanName=name;	
	}
}
