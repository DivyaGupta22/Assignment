package com.divya.oops;

public class RectangleShape extends AbstractShapes{
	private double length;
	private double width;
	
 public RectangleShape(double l,double w){
	 length=l;
	 width=w;
	 
 }
	@Override
	public void calculateArea() {
		area=length*width;
		System.out.println("Area of rectangle is: "+area);
		
	}

	@Override
	public void calculatPerimeter() {
		perimeter=2*(length+width);
		System.out.println("Perimeter of rectangle :"+perimeter);
		
	}

	@Override
	public void setSides() {
		// TODO Auto-generated method stub
	}
	
	//Method overloading
	public void perimeter(double x){
		perimeter=4*x;
		System.out.println("Perimeter of square :"+perimeter);
	}
	public void perimeter(double x,double y){
		perimeter=2*(x+y);
		System.out.println("Perimeter of rectangle :"+perimeter);
	}
	
	public void perimeter(double x,double y,double z){
		perimeter=x+y+z;
		System.out.println("Perimeter of triangle :"+perimeter);
	}

}
