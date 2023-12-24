package com.springboot.elk.practicalelk.service.impl;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.springboot.elk.practicalelk.entity.Car;
import com.springboot.elk.practicalelk.service.CarService;

@Service
public class RandomCarService implements CarService{

	@Override
	public Car generateCar() {
	    var brand = BRANDS.get(ThreadLocalRandom.current().nextInt(BRANDS.size()));
	    var color = COLORS.get(ThreadLocalRandom.current().nextInt(COLORS.size()));
	    var type = TYPES.get(ThreadLocalRandom.current().nextInt(TYPES.size()));
	    
	    return new Car(brand, color, type);
	}
	
}
