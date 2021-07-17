package com.faizan.day4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class DrawingApp 
{
    public static void main( String[] args ){
    	AbstractApplicationContext factory = new ClassPathXmlApplicationContext("day4Config.xml");
    	factory.registerShutdownHook(); 
    	Triangle tri=(Triangle) factory.getBean("innerBeanTriangle");
        System.out.println(tri);
        TrianglePointList triangle=(TrianglePointList) factory.getBean("refTriangleList");
        System.out.println(tri);
        factory.close();
    }
}
