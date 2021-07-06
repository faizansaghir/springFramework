package com.faizan.day3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class DrawingApp 
{
    public static void main( String[] args ){
    	ApplicationContext factory = new ClassPathXmlApplicationContext("day3Config.xml");
        Triangle tri=(Triangle) factory.getBean("innerBeanTriangle");
        System.out.println(tri);
        Triangle tri2=(Triangle) factory.getBean("inheritTriangleOverwrite");
        System.out.println(tri2);
        TrianglePointList tri3=(TrianglePointList) factory.getBean("inheritTriangleListMerge");
        System.out.println(tri3);
        TrianglePointList tri4=(TrianglePointList) factory.getBean("inheritTriangleListOverwrite");
        System.out.println(tri4);
    }
}
