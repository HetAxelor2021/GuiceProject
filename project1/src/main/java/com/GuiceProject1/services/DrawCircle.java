package com.GuiceProject1.services;

import javax.inject.Inject;

import com.GuiceProject1.annotation.EdgeValue;
import com.GuiceProject1.annotations.ColorValue;

public class DrawCircle implements DrawShape {
	
//	private String color;
//	private Integer edge;
//	
//	
//	@Inject
//	public DrawCircle(@ColorValue String color,@EdgeValue Integer edge) {
//		super();
//		this.color = color;
//		this.edge = edge;
//	}

	@Override 
	public void draw() {
		System.out.println("drawing circle ");
	}
}
