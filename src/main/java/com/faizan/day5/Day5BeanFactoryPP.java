package com.faizan.day5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class Day5BeanFactoryPP implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Post process metod called for bean factory");
	}

}
