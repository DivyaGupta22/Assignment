package com.divya.oops;

public class SquareShape extends AbstractShapes {
	private double side;
	
	public SquareShape(int side){
		this.side=side;
	}

	@Override
	public void calculateArea() {
	 area=side*side;
	 System.out.println("Area of square is : "+area);
		
	}

	@Override
	public void calculatPerimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSides() {
		// TODO Auto-generated method stub
		
	}
	
}
