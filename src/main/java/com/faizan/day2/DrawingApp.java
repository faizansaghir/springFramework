package com.faizan.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class DrawingApp 
{
    public static void main( String[] args ){
    	ApplicationContext factory = new ClassPathXmlApplicationContext("day2Config.xml");
        Triangle tri=(Triangle) factory.getBean("refTriangle");
        System.out.println("REFERENCE TRIANGLE");
        System.out.println("Before Change");
        System.out.println(tri);
        //Due to singleton design pattern
        tri.getPointA().setX(200);
        tri.getPointA().setY(200);
        //It will change bean value of zeroPoint hence listTriangle and innerBeanTriangle which uses zeroPoint bean will have values 200,200 and not 0,0
        
        //Due to prototype design pattern
        tri.getPointB().setX(100);
        tri.getPointB().setY(0);
        tri.getPointC().setX(0);
        tri.getPointC().setY(100);
        //It will not change bean value of point1 and point2 as new instance will be created hence listTriangle which uses these beans will have no effect
        System.out.println("After Change");
        System.out.println(tri);
        TrianglePointList triangle=(TrianglePointList) factory.getBean("listTriangle");
        System.out.println("LIST TRIANGLE");
        System.out.println(triangle);
        Triangle triangle2=(Triangle) factory.getBean("innerBeanTriangle");
        System.out.println("INNER BEAN TRIANGLE");
        System.out.println(triangle2);
        Triangle triangle3=(Triangle) factory.getBean("autoWiredTriangle");
        System.out.println("AUTOWIRED TRIANGLE");
        System.out.println(triangle3);
    }
}
