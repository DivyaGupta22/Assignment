package com.divya.oops;

public abstract class AbstractShapes {
int noOfSides;
double area;
double perimeter;

public AbstractShapes(){
	System.out.println("this is a shape object");
}

public  abstract void calculateArea ();

public abstract void calculatPerimeter();

public abstract void setSides();
	





}
