package com.awa.structure;

import com.awa.structure.adapters.IShape;

public interface IMoldableEntity extends IEntity{

	public IShape getShape();
	public void setShape(IShape shape);
}
