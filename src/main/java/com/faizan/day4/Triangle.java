package com.faizan.day4;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Triangle implements BeanNameAware,InitializingBean,DisposableBean {
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
		return ("Point : "+pointA+"\nPoint : "+pointB+"\nPoint : "+pointC+"\n");
	}
	public void setBeanName(String name) {
		this.beanName=name;
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean "+beanName+" has been initialized");		
	}
	public void destroy() throws Exception {
		System.out.println("Bean "+beanName+" has been destroyed");	
	}
	
}
