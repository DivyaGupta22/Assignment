package com.divya.loops;

public class PrimeNumber {
	public void getPrime(int num){
		if(num==0||num==1){
			System.out.println(num +" is not a prime number ");
		}else{
		boolean isPrime =true;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				isPrime=false;
				break;
			}
		}
		if (isPrime==true){
			System.out.println(num +" is prime number ");
		}else {
			System.out.println(num +" is not a prime number ");
		}
		}
	}

	public static void main(String[] args) {
		PrimeNumber ob= new PrimeNumber();
		ob.getPrime(11);
	}

}
