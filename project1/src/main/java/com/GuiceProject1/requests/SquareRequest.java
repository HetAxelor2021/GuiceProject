package com.GuiceProject1.requests;

import javax.inject.Inject;

import com.GuiceProject1.services.DrawShape;
//import com.google.inject.Inject;

public class SquareRequest {
	DrawShape d;
	
	@Inject
	public SquareRequest(DrawShape d){
		this.d = d;
		
	}
	public void makeRequest() {
		d.draw();
	}
	public DrawShape getDrawShape() {
		return d;
	}
	
}
