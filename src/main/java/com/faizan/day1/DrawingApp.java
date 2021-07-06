package com.faizan.day1;

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
		//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("day1Config.xml")); //XML file to be in root of project and not inside src folder
    	ApplicationContext factory = new ClassPathXmlApplicationContext("day1Config.xml");
        Triangle setterTri=(Triangle) factory.getBean("settterTriangle");
        System.out.println(setterTri);
        Triangle constructorTri=(Triangle) factory.getBean("constructorTriangle");
        System.out.println(constructorTri);
    }
}
