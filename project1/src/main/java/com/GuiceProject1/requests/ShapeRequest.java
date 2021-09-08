package com.GuiceProject1.requests;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import com.GuiceProject1.services.DrawShape;
import com.GuiceProject1.services.DrawSquare;
//import com.google.inject.Inject;
import com.google.inject.Provider;

public class ShapeRequest {
//	@Inject
//	Provider<DrawSquare> squareProvider;
//	DrawShape d;
	Map<String,DrawShape> shapeNameVSDrawShape;
	
	
	@Inject
	public ShapeRequest(Set<DrawShape> set) {
//		this.d = d;
		shapeNameVSDrawShape = new HashMap<String,DrawShape>();
		for(DrawShape d : set) {
			shapeNameVSDrawShape.put(d.getShapeName(),d);
		}
	}
	
//	@Inject
//	public SquareRequest(Provider<DrawSquare> squareProvider){
//		this.squareProvider = squareProvider;
//		
//	} 
	public void makeRequest(String shapeName) {
		DrawShape d = shapeNameVSDrawShape.get(shapeName);
		
		d.draw();
		
//		DrawSquare d1 = squareProvider.get();
//		d1.draw();
//		DrawSquare d2 = squareProvider.get();
//		d2.draw();
//		d.draw();
//		d.draw();
	}
//	public DrawShape getDrawShape() {
//		
//		return d;
//	}
//	@Inject
//	public void setDrawShape(DrawShape d) {
//		this.d = d;
//	}
	
}
