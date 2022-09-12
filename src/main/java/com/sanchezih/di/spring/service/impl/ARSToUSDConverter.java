package com.sanchezih.di.spring.service.impl;

import org.springframework.stereotype.Component;

import com.sanchezih.di.spring.service.Converter;

@Component
public class ARSToUSDConverter implements Converter {

	private final double RATE = 138.53;

	@Override
	public Double convert(Double cantidad) {
		return cantidad * RATE;
	}
}
