package com.drawingapp.main;

import com.GuiceProject1.module.AppModule;
import com.GuiceProject1.requests.CircleRequest;
import com.GuiceProject1.requests.SquareRequest;
import com.GuiceProject1.services.DrawShape;
import com.GuiceProject1.services.DrawSquare;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {
	
	private static final String SQUARE_REQ = "SQUARE";
	private static final String CIRCLE_REQ = "CIRCLE";
	
	private static void sendRequest(String squareReq) {
		if(squareReq.equals(SQUARE_REQ)) {
//			DrawShape d = new DrawSquare();
//			DrawShape d = injector.getInstance(DrawShape.class);
//			SquareRequest  request = new SquareRequest(d);
			Injector injector = Guice.createInjector(new AppModule());
			System.out.println("hello");
			SquareRequest request = injector.getInstance(SquareRequest.class);
			request.makeRequest();
//			
//			SquareRequest request2 = injector.getInstance(SquareRequest.class);
//			request2.makeRequest();
//			
//			boolean areSquareRequestEqual = request == request2;
//			System.out.println("Were draw shapes equl: "+ areSquareRequestEqual);
			
//			boolean areDrawShapesEqual = request.getDrawShape() == request2.getDrawShape();
//			System.out.println("Were draw shapes equal : "+areDrawShapesEqual);
			
			
		}
		if(squareReq.equals(CIRCLE_REQ)) {
			Injector injector = Guice.createInjector(new AppModule());
			CircleRequest request = injector.getInstance(CircleRequest.class);
			request.makeRequest();
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("hii");
		sendRequest(SQUARE_REQ);
		sendRequest(CIRCLE_REQ);
	}
}
