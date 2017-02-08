package com.divya.loops;

public class ArmstrongNumber {
	public void getArmstrong(int num){
		int temp=num;
		int noOfDigits= String.valueOf(num).length();
		int sum=0; 
		while(temp>0){
			int a=temp%10;
			int arm =1;
			for(int i =0;i<noOfDigits;i++){
				arm = arm*a;
			}
			sum=sum+arm;
			temp=temp/10;
		}
		if (sum==num){
			System.out.println(num+" is Armstrong number");
		}else {
			System.out.println(num+" is not a Armstrong number");
		}
	}

	public static void main(String[] args) {
		ArmstrongNumber ob = new ArmstrongNumber();
		ob.getArmstrong(523);

	}

}
