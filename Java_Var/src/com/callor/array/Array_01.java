package com.callor.array;

import java.util.Random;

public class Array_01 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] num = new int[10];
		int sum = 0;
		
		for(int i=0; i<10; i++) {
			num[i] = rnd.nextInt(99)+1;
			sum += num[i];
		}
		
		System.out.println(sum);
		
		
		
	}

}
