package com.GuiceProject1.providers;



import javax.inject.Inject;

import com.GuiceProject1.requests.CircleColorValue;
import com.GuiceProject1.requests.EdgeSize;
import com.GuiceProject1.requests.Radius;
import com.GuiceProject1.requests.SquareColorValue;
import com.GuiceProject1.services.DrawCircle;
import com.GuiceProject1.services.DrawSquare;
import com.google.inject.Provider;
//import com.google.inject.Provider;

public class DrawCircleProvider implements Provider<DrawCircle>{
	
	
	private String color;
	private Integer radius;
	
	@Inject
	public DrawCircleProvider(@CircleColorValue String color, @Radius Integer radius) {
		this.color = color;
		this.radius = radius;
	}
	
	@Override
	public DrawCircle get() {
		DrawCircle d = new DrawCircle(color, radius);
		return d;
		
	}
	
}
