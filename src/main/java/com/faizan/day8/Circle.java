package com.faizan.day8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
	@Resource
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
	
	@PostConstruct
	public void circleInit() {
		System.out.println("Circle is initialized");
	}
	
	@PreDestroy
	public void circleDestory() {
		System.out.println("Circle is destoryed");
	}
}
