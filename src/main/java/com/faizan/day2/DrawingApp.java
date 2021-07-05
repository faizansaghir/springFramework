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
        // Triangle tri=new Triangle();
		//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("springConfig.xml"));
    	ApplicationContext factory = new ClassPathXmlApplicationContext("springConfig.xml");
        Triangle tri=(Triangle) factory.getBean("triangle2");
        System.out.println(tri);
        TrianglePointList triangle=(TrianglePointList) factory.getBean("triangle3");
        System.out.println(triangle);
        Triangle triangle2=(Triangle) factory.getBean("triangle4");
        System.out.println(triangle2);
        Triangle triangle3=(Triangle) factory.getBean("autoWiredTriangle");
        System.out.println(triangle3);
    }
}
