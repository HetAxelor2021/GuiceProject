package com.GuiceProject1.requests;

import javax.inject.Inject;

import com.GuiceProject1.services.DrawShape;

public class SquareRequestSubClass extends SquareRequest{
	@Inject
	public SquareRequestSubClass (DrawShape d) {
//		super(d);
	}
	@Override 
	public void makeRequest() {
		System.out.println("delegating call to draw method");
		d.draw();
	}
}