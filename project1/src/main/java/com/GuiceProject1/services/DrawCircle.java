package com.GuiceProject1.services;

//import com.GuiceProject1.constants.CIRCLE;
import static com.GuiceProject1.constants.Constants.CIRCLE;

import javax.inject.Inject;

import com.GuiceProject1.annotation.EdgeValue;
import com.GuiceProject1.annotations.ColorValue;
import com.GuiceProject1.requests.CircleColorValue;
import com.GuiceProject1.requests.Radius;

public class DrawCircle implements DrawShape {
	
	private String color;
	private Integer radius;
//	
//	
	@Inject
	public DrawCircle( @CircleColorValue String color, @Radius Integer radius) {
		super();
		this.color = color;
		this.radius = radius;
	}

	@Override 
	public void draw() {
		System.out.println("drawing circle of color:  "+color+" and radius: "+ radius);
	}
	@Override
	public String getShapeName() {
		return CIRCLE;
	}
}
