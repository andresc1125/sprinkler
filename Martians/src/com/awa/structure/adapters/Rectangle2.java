package com.awa.structure.adapters;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Rectangle;

public class Rectangle2 extends Rectangle implements IShape {

	public Rectangle2(float x,float y, float width,  float height) {
		super(x, y, width, height);
	}

	@Override
	public boolean collidesWithCircle(Circle circle) {
		// TODO Auto-generated method stub
		float distanceX;
		float distanceY;
		float cornerDistance;
		
		distanceX = Math.abs(circle.x - this.x - (this.width/2));
		distanceY = Math.abs(circle.y - this.y - (this.height/2));
		cornerDistance = (float) (Math.pow(distanceX - (this.width/2), 2) + Math.pow(distanceY - (this.height), 2));
		
		if(distanceX <= (this.width/2)){
			return true;
		}
		if(distanceY <= (this.height/2)){
			return true;
		}
				
		return cornerDistance <= Math.pow(circle.radius, 2);
	}

	@Override
	public boolean collidesWithRectangle(Rectangle rectangle) {
		// TODO Auto-generated method stub
		return this.overlaps(rectangle);
	}

	@Override
	public boolean collidesWithPolygon(Polygon polygon) {
		// TODO Auto-generated method stub
		return false;
	}
}
