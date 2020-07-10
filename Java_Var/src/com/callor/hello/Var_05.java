package com.callor.hello;

import java.util.Random;

public class Var_05 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(99)+1;
		int num2 = rnd.nextInt(99)+1;
		
		int plus = num1 + num2;
		int minus = num1 - num2;
		int times = num1 * num2;
		int div = num1/num2;
		
		if(plus%2==0) {
			System.out.printf("%d + %d = %d (짝수)\n",num1,num2,plus);
		}else {
			System.out.printf("%d + %d = %d (홀수)\n",num1,num2,plus);
		}
		
		if(minus%2==0) {
			System.out.printf("%d - %d = %d (짝수)\n",num1,num2,minus);
		}else {
			System.out.printf("%d - %d = %d (홀수)\n",num1,num2,minus);
		}
		
		if(times%2==0) {
			System.out.printf("%d * %d = %d (짝수)\n",num1,num2,times);
		}else {
			System.out.printf("%d * %d = %d (홀수)\n",num1,num2,times);
		}
		
		if(div%2==0) {
			System.out.printf("%d / %d = %d (짝수)\n",num1,num2,div);
		}else {
			System.out.printf("%d / %d = %d (홀수)\n",num1,num2,div);
		}
		
		
	}

}
