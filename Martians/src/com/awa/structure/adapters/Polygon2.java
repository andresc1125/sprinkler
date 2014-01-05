package com.awa.structure.adapters;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Rectangle;

public class Polygon2 extends Polygon implements IShape {

	@Override
	public boolean collidesWithCircle(Circle circle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean collidesWithRectangle(Rectangle rectangle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean collidesWithPolygon(Polygon polygon) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
