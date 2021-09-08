package com.GuiceProject1.module;

import com.GuiceProject1.annotation.EdgeValue;
import com.GuiceProject1.annotations.ColorValue;
//import com.GuiceProject1.providers.DrawCircleProvider;
//import com.GuiceProject1.providers.DrawSquareProvider;
import com.GuiceProject1.requests.Circle;
import com.GuiceProject1.requests.CircleColorValue;
import com.GuiceProject1.requests.EdgeSize;
import com.GuiceProject1.requests.Radius;
import com.GuiceProject1.requests.Square;
import com.GuiceProject1.requests.SquareColorValue;
import com.GuiceProject1.requests.SquareEdgeSize;
import com.GuiceProject1.requests.SquareRequest;
//import com.GuiceProject1.requests.SquareRequestSubClass;
import com.GuiceProject1.services.DrawCircle;
import com.GuiceProject1.services.DrawShape;
import com.GuiceProject1.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import com.google.inject.Singleton;
import com.google.inject.multibindings.Multibinder;
import com.google.inject.name.Names;

public class AppModule2 extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);
		
	}	
}
