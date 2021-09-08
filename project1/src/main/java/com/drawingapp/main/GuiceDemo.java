package com.drawingapp.main;

import com.GuiceProject1.module.AppModule;
import com.GuiceProject1.requests.CircleRequest;
import com.GuiceProject1.requests.ShapeRequest;
import com.GuiceProject1.requests.SquareRequest;
import com.GuiceProject1.services.DrawShape;
import com.GuiceProject1.services.DrawSquare;
import com.google.inject.Guice;
import com.google.inject.Injector;
import static com.GuiceProject1.constants.Constants.CIRCLE;
import static com.GuiceProject1.constants.Constants.SQUARE;

public class GuiceDemo {
	
//	private static final String SQUARE_REQ = "SQUARE";
//	private static final String CIRCLE_REQ = "CIRCLE";
	
	private static void sendRequest(String squareReq) {
//		if(squareReq.equals(SQUARE)) {
//			DrawShape d = new DrawSquare();
//			DrawShape d = injector.getInstance(DrawShape.class);
//			SquareRequest  request = new SquareRequest(d);
			Injector injector = Guice.createInjector(new AppModule());
			System.out.println("hello");
			ShapeRequest request = injector.getInstance(ShapeRequest.class);
			request.makeRequest(SQUARE);
			request.makeRequest(CIRCLE);			
//			SquareRequest request2 = injector.getInstance(SquareRequest.class);
//			request2.makeRequest();
//			
//			boolean areSquareRequestEqual = request == request2;
//			System.out.println("Were draw shapes equl: "+ areSquareRequestEqual);
			
//			boolean areDrawShapesEqual = request.getDrawShape() == request2.getDrawShape();
//			System.out.println("Were draw shapes equal : "+areDrawShapesEqual);
			
			
//		}
//		if(squareReq.equals(CIRCLE)) {
//			Injector injector = Guice.createInjector(new AppModule());
//			CircleRequest request = injector.getInstance(CircleRequest.class);
//			request.makeRequest();
//		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("hii");
		sendRequest(SQUARE);
//		sendRequest(CIRCLE);
	}
}
