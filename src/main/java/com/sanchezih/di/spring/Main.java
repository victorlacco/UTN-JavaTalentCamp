package com.sanchezih.di.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sanchezih.di.spring.configuration.Config;
import com.sanchezih.di.spring.service.Converter;

public class Main {

	public static void main(String[] args) {

		double cantidad = 100;
		String toGBP = "ARSToGBPConverter";
		String toUSD = "ARSToUSDConverter";
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(Config.class);
		context.refresh();
		
		Converter c = (Converter) context.getBean(toGBP);
		System.out.println("To GBP = " + c.convert(cantidad));
		c = (Converter) context.getBean(toUSD);
		System.out.println("To USD = " + c.convert(cantidad));
	}
}
