package com.excelr.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	private String carMfgName;
	private double carPrice;
	private String carModelName;
	private String colour;

	@Autowired
	@Qualifier("e1")
	private Engine eng1;
	
	@Autowired
	@Qualifier("g1")
	private Gear gea1;
	
	@Autowired
	private MusicSystem ms;

	public Car() {
	}

	public Car(String carMfgName, double carPrice, String carModelName, String colour, Engine e1, Gear g1) {
		this.carMfgName = carMfgName;
		this.carPrice = carPrice;
		this.carModelName = carModelName;
		this.colour = colour;
		this.eng1 = e1;
		this.gea1 = g1;
	}

	public String getCarMfgName() {
		return carMfgName;
	}

	public void setCarMfgName(String carMfgName) {
		this.carMfgName = carMfgName;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public String getCarModelName() {
		return carModelName;
	}

	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	

	public Engine getEng1() {
		return eng1;
	}

	public void setEng1(Engine eng1) {
		this.eng1 = eng1;
	}

	public Gear getGea1() {
		return gea1;
	}

	public void setGea1(Gear gea1) {
		this.gea1 = gea1;
	}

	
	

	@Override
	public String toString() {
		return "Car [carMfgName=" + carMfgName + ", carPrice=" + carPrice + ", carModelName=" + carModelName
				+ ", colour=" + colour + ", eng1=" + eng1 + ", gea1=" + gea1 + ", ms=" + ms + "]";
	}

	

	

}
