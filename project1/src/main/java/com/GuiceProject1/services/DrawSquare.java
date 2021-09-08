package com.GuiceProject1.services;

import javax.inject.Inject;

import com.GuiceProject1.annotation.EdgeValue;
import com.GuiceProject1.annotations.ColorValue;
import com.GuiceProject1.requests.EdgeSize;
import com.GuiceProject1.requests.SquareColorValue;

public class DrawSquare implements DrawShape {
	
	private String color;
	private Integer edge;
	Thread t = new Thread(() -> System.out.println("Drawing Square of color : "+color+" and edge : "+edge));
	
	
	
	@Inject
	public DrawSquare( @SquareColorValue String color,@EdgeSize Integer edge) {
		super();
		this.color = color;
		this.edge = edge;
	}

	@Override 
	public void draw() {
		t.start();
//		System.out.println("drawing square: color :"+color+" edge :  "+edge);
	}
}
