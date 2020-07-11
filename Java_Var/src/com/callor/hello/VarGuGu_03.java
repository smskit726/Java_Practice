package com.callor.hello;

public class VarGuGu_03 {
	
	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 0;
		
		for(num1 = 2; num1<=5; num1++) {
			for(num2=1; num2<=9; num2++) {
				System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			}
			System.out.println();
		}
	}

}
