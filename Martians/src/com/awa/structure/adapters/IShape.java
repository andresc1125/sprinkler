package com.awa.structure.adapters;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Rectangle;

public interface IShape  {

	public boolean collidesWithCircle(Circle circle);
	public boolean collidesWithRectangle(Rectangle rectangle);
	public boolean collidesWithPolygon(Polygon polygon);
}
