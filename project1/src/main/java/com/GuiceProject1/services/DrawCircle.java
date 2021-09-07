package com.GuiceProject1.services;

import javax.inject.Inject;

import com.GuiceProject1.annotation.EdgeValue;
import com.GuiceProject1.annotations.ColorValue;

public class DrawCircle implements DrawShape {
	
	private String color;
	private Integer radius;
//	
//	
//	@Inject
	public DrawCircle( String color, Integer radius) {
		super();
		this.color = color;
		this.radius = radius;
	}

	@Override 
	public void draw() {
		System.out.println("drawing circle of color:  "+color+" and radius: "+ radius);
	}
}
