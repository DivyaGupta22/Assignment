package com.divya.loops;

public class PingPong {
	public void getPingPong(int num){
		
		if (num%3==0 && num%5==0){
			System.out.println("Ping Pong");
			
		}else if (num%3==0){
			System.out.println("Ping");
		}else if (num%5==0){
			System.out.println("Pong");
		}else {
			System.out.println("Number is : "+num);
		}
			
	}

	public static void main (String[] args){
		PingPong ob = new PingPong();
		ob.getPingPong(30);
		
	}
}
