package com.GuiceProject1.requests;

import javax.inject.Inject;
import javax.inject.Named;

import com.GuiceProject1.services.DrawShape;
//import com.google.inject.Inject;

public class SquareRequest {
//	@Inject
	DrawShape d;
	
	@Inject
	public SquareRequest(@Square DrawShape d){
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
