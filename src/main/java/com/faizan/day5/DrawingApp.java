package com.faizan.day5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class DrawingApp 
{
    public static void main( String[] args ){
    	AbstractApplicationContext factory = new ClassPathXmlApplicationContext("day5Config.xml");
    	factory.registerShutdownHook(); 
        TrianglePointList triangle=(TrianglePointList) factory.getBean("refTriangleList");
        System.out.println(triangle);
        factory.close();
    }
}
