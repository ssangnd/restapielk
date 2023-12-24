package com.springboot.elk.practicalelk.service.impl;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.springboot.elk.practicalelk.entity.Car;
import com.springboot.elk.practicalelk.service.CarService;
import com.springboot.elk.practicalelk.util.RandomDateUtil;

@Service
public class RandomCarService implements CarService{

	@Override
	public Car generateCar() {
	    var brand = BRANDS.get(ThreadLocalRandom.current().nextInt(BRANDS.size()));
	    var color = COLORS.get(ThreadLocalRandom.current().nextInt(COLORS.size()));
	    var type = TYPES.get(ThreadLocalRandom.current().nextInt(TYPES.size()));
	    
	    var available = ThreadLocalRandom.current().nextBoolean();
	    var price = ThreadLocalRandom.current().nextInt(5000, 12001);
	    var firstReleaseDate = RandomDateUtil.generateRandomLocalDate();
	    
	    var car = new Car(brand, color, type);
	    car.setAvailable(available);
	    car.setPrice(price);
	    car.setFirstReleaseDate(firstReleaseDate);
	    
//	    return new Car(brand, color, type);
	    return car;
	    
	}
	
}
