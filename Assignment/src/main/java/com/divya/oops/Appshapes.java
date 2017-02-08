package com.divya.oops;

public class Appshapes {

	public static void main(String[] args) {
		Circleshape cs=new Circleshape(5);
		cs.calculateArea();
		cs.calculatPerimeter();
		
		SquareShape ss=new SquareShape(4);
		ss.calculateArea();
		
		RectangleShape rs=new RectangleShape(4,5);
		rs.calculateArea();
		rs.calculatPerimeter();
		
		//Method overloading
		rs.perimeter(4);
		rs.perimeter(4,6);
		rs.perimeter(2,3,4);
	}

}
