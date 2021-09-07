package com.GuiceProject1.services;

import javax.inject.Inject;

import com.GuiceProject1.annotation.EdgeValue;
import com.GuiceProject1.annotations.ColorValue;

public class DrawSquare implements DrawShape {
	
	private String color;
	private Integer edge;
	
	
//	@Inject
	public DrawSquare( String color, Integer edge) {
		super();
		this.color = color;
		this.edge = edge;
	}

	@Override 
	public void draw() {
		System.out.println("drawing square: color :"+color+" edge :  "+edge);
	}
}
