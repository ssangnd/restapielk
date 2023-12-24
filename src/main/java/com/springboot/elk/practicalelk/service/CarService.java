package com.springboot.elk.practicalelk.service;

import java.util.List;

import com.springboot.elk.practicalelk.entity.Car;

public interface CarService {

	  List<String> BRANDS = List.of("Toyota", "Honda", "Ford", "Hyundai", "BMW");
	  List<String> COLORS = List.of("Red", "Black", "White", "Silver", "Blue");
	  List<String> TYPES = List.of("Sedan", "SUV", "MPV", "Hatchback", "Convertible");
//	  List<String> ADDITIONAL_FEATURES = List.of("GPS", "Alarm", "Sunroof", "Media player", "Leather seats");
//	  List<String> FUELS = List.of("Gas", "Electric", "Hybrid");
//	  List<String> TIRE_MANUFACTURERS = List.of("Goodyear", "Bridgestone", "Dunlop");
	  
	  Car generateCar();

	}
