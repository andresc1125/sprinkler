package com.awa.structure.adapters;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Rectangle;

public class Circle2 extends Circle implements IShape{

	@Override
	public boolean collidesWithCircle(Circle circle) {
		// TODO Auto-generated method stub
		return this.overlaps(circle);
	}

	@Override
	public boolean collidesWithRectangle(Rectangle rectangle) {
		// TODO Auto-generated method stubfloat distanceX;
		float distanceX;
		float distanceY;
		float cornerDistance;
		
		distanceX = Math.abs(this.x - rectangle.x - (rectangle.width/2));
		distanceY = Math.abs(this.y - rectangle.y - (rectangle.height/2));
		cornerDistance = (float) (Math.pow(distanceX - (rectangle.width/2), 2) + Math.pow(distanceY - (rectangle.height), 2));
		
		if(distanceX <= (rectangle.width/2)){
			return true;
		}
		if(distanceY <= (rectangle.height/2)){
			return true;
		}
				
		return cornerDistance <= Math.pow(this.radius, 2);
	}

	@Override
	public boolean collidesWithPolygon(Polygon polygon) {
		// TODO Auto-generated method stub
		return false;
	}

}
