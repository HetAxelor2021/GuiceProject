package com.GuiceProject1.module;

import com.GuiceProject1.annotation.EdgeValue;
import com.GuiceProject1.annotations.ColorValue;
import com.GuiceProject1.requests.SquareRequest;
import com.GuiceProject1.requests.SquareRequestSubClass;
import com.GuiceProject1.services.DrawShape;
import com.GuiceProject1.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class AppModule extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);;
//		bind(SquareRequest.class).to(SquareRequestSubClass.class);
		bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
//		bind(Integer.class).toInstance(40);
		bind(SquareRequest.class).in(Scopes.SINGLETON);
	}	
}