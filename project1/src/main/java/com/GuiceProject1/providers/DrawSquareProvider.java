package com.GuiceProject1.providers;



import javax.inject.Inject;

import com.GuiceProject1.requests.EdgeSize;
import com.GuiceProject1.requests.SquareColorValue;
import com.GuiceProject1.services.DrawSquare;
import com.google.inject.Provider;
//import com.google.inject.Provider;

public class DrawSquareProvider implements Provider<DrawSquare>{
	
	
	private String color;
	private Integer edge;
	
	@Inject
	public DrawSquareProvider(@SquareColorValue String color, @EdgeSize Integer edge) {
		this.color = color;
		this.edge = edge;
	}
	
	@Override
	public DrawSquare get() {
		DrawSquare d = new DrawSquare(color, edge);
		return d;
		
	}
	
}
