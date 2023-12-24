package com.springboot.elk.practicalelk.entity;

public class Tire {
	  private String manufacturer;	  
	  private int price;
	  private int size;
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Tire [manufacturer=" + manufacturer + ", price=" + price + ", size=" + size + "]";
	}
	public Tire() {}
	public Tire(String manufacturer, int price, int size) {
		super();
		this.manufacturer = manufacturer;
		this.price = price;
		this.size = size;
	}
	  
}
