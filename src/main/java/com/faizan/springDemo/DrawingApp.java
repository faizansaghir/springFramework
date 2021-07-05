package com.faizan.springDemo;

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
        Triangle tri=(Triangle) factory.getBean("triangle");
        System.out.println(tri);
    }
}
