package com.GuiceProject1.requests;

import javax.inject.Inject;
import javax.inject.Named;

import com.GuiceProject1.services.DrawShape;
//import com.google.inject.Inject;
//import com.google.inject.name.Named;

public class CircleRequest {
//	@Inject
	DrawShape d;
	
	@Inject
	public CircleRequest( @Circle DrawShape d){
		this.d = d;
		
	} 
	public void makeRequest() {
		d.draw();
	}
	public DrawShape getDrawShape() {
		return d;
	}
//	@Inject
//	public void setDrawShape(DrawShape d) {
//		this.d = d;
//	}
	
}
