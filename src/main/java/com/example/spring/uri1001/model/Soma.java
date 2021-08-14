package com.example.spring.uri1001.model;

public class Soma {
	private double a;
	private double b;


	public Soma(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getR() {
		return   a + b;
	}


}
