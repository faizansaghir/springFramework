package com.faizan.day6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class DrawingApp 
{
    public static void main( String[] args ){
    	AbstractApplicationContext factory = new ClassPathXmlApplicationContext("day6Config.xml");
    	factory.registerShutdownHook(); 
        Shape shape1=(Shape) factory.getBean("triangle");
        System.out.println(shape1.getMessage());
        Shape shape2=(Shape) factory.getBean("circle");
        System.out.println(shape2.getMessage());
        factory.close();
    }
}
