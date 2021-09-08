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

public class AppModule1 extends AbstractModule {
	
	@Override
	protected void configure() {
		//solution3
		install(new AppModule2());
		bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class);
//		bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);
//		Multibinder<DrawShape> drawShapeBinder = Multibinder.newSetBinder(binder(),DrawShape.class);
//		drawShapeBinder.addBinding().to(DrawSquare.class);
//		drawShapeBinder.addBinding().to(DrawCircle.class);
//		
//		
//		
////		bind(DrawShape.class).annotatedWith(Square.class).toProvider(DrawSquareProvider.class).in(Scopes.SINGLETON);
////		bind(DrawShape.class).annotatedWith(Circle.class).toProvider(DrawCircleProvider.class).in(Scopes.SINGLETON);
//		bind(String.class).annotatedWith(SquareColorValue.class).toInstance("red");
//		bind(Integer.class).annotatedWith(EdgeSize.class).toInstance(150);
////		bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Red");
////		
////		bind(Integer.class).annotatedWith(SquareEdgeSize.class).toInstance(60);
//		bind(String.class).annotatedWith(CircleColorValue.class).toInstance("Black");
//		
//		bind(Integer.class).annotatedWith(Radius.class).toInstance(10);
//		
////		bind(DrawShape.class).annotatedWith(Names.named("Square")).to(DrawSquare.class).in(Scopes.SINGLETON);
//		bind(SquareRequest.class).to(SquareRequestSubClass.class);
//		bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
//		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
//		bind(Integer.class).toInstance(40);
//		bind(SquareRequest.class).in(Scopes.SINGLETON);
//		bind(DrawShape.class).annotatedWith(Names.named("Circle")).to(DrawCircle.class).in(Scopes.SINGLETON);
	}	
//	@Provides
//	@Singleton
//	@Square
//	DrawShape providesDrawSquare(@SquareColorValue String color, @SquareEdgeSize Integer edge) {
//		DrawShape d = new DrawSquare(color, edge);
//		return d;
//	}
	
//	@Provides
//	@Singleton
//	@Circle
//	DrawShape providesDrawCircle(@CircleColorValue String color, @Radius Integer radius) {
//		DrawShape d = new DrawCircle(color,radius);
//		return d;
//	}
//	
	
}
