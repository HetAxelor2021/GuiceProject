package com.GuiceProject1.requests;

import javax.inject.Inject;
import javax.inject.Named;

import com.GuiceProject1.services.DrawShape;
import com.GuiceProject1.services.DrawSquare;
//import com.google.inject.Inject;
import com.google.inject.Provider;

public class SquareRequest {
//	@Inject
	Provider<DrawSquare> squareProvider;
	DrawShape d;
	
	@Inject
	public SquareRequest(DrawShape d) {
		this.d = d;
	}
	
//	@Inject
//	public SquareRequest(Provider<DrawSquare> squareProvider){
//		this.squareProvider = squareProvider;
//		
//	} 
	public void makeRequest() {
		
		d.draw();
		
//		DrawSquare d1 = squareProvider.get();
//		d1.draw();
//		DrawSquare d2 = squareProvider.get();
//		d2.draw();
//		d.draw();
//		d.draw();
	}
	public DrawShape getDrawShape() {
		return d;
	}
//	@Inject
//	public void setDrawShape(DrawShape d) {
//		this.d = d;
//	}
	
}
