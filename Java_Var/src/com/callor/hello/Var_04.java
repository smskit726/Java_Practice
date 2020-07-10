package com.callor.hello;

import java.util.Random;

public class Var_04 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(99)+1;
		System.out.println(num);
		
		if(num%3==0 && num%5==0){
			System.out.println(num+" 은 3의 배수이면서 5의배수");
		}else if(num%3==0) {
			System.out.println(num +" 은 3의 배수");
		}else if(num%5 ==0) {
			System.out.println(num + " 은 5의 배수");
		}
	}

}
