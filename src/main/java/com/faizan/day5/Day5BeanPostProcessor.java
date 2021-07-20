package com.faizan.day5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Day5BeanPostProcessor implements BeanPostProcessor{
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean post processor after initialization method called for bean "+beanName);
		return bean;
	}
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean post processor before initialization method called for bean "+beanName);
		return bean;
	}
}
