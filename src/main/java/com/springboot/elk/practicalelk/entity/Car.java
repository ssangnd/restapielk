package com.springboot.elk.practicalelk.entity;

import java.time.LocalDate;
import java.util.List;

public class Car {
	private String brand;
	private String color;
	private String type;
	private int price;
	private boolean available;
	private LocalDate firstReleaseDate;
	 private List<String> additionalFeatures;
	 
	 private Engine engine;
	 private List<Tire> tires;
	 
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<Tire> getTires() {
		return tires;
	}

	public void setTires(List<Tire> tires) {
		this.tires = tires;
	}

	public int getPrice() {
		return price;
	}

	public List<String> getAdditionalFeatures() {
		return additionalFeatures;
	}

	public void setAdditionalFeatures(List<String> additionalFeatures) {
		this.additionalFeatures = additionalFeatures;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public LocalDate getFirstReleaseDate() {
		return firstReleaseDate;
	}

	public void setFirstReleaseDate(LocalDate firstReleaseDate) {
		this.firstReleaseDate = firstReleaseDate;
	}

	public Car() {
		
	}
	
	 public Car(String brand, String color, String type) {
		    super();
		    this.brand = brand;
		    this.color = color;
		    this.type = type;
		  }
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public String getType() {
		return type;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", type=" + type + ", price=" + price + ", available="
				+ available + ", firstReleaseDate=" + firstReleaseDate + ", additionalFeatures=" + additionalFeatures
				+ ", engine=" + engine + ", tires=" + tires + "]";
	}

//	@Override
//	public String toString() {
//		return "Car [brand=" + brand + ", color=" + color + ", type=" + type + ", price=" + price + ", available="
//				+ available + ", firstReleaseDate=" + firstReleaseDate + "]";
//	}
	
//	@Override
//	public String toString() {
//		return "Car [brand=" + brand + ", color=" + color + ", type=" + type + "]";
//	}
	
	
	
	
}
