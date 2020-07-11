package com.callor.array;

import java.util.Random;

public class Array_08 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] num = new int[100];
		int sum = 0;
		
		System.out.println("----------------------------------------------");
		for(int i = 0; i<num.length; i++) {
			num[i] = rnd.nextInt(100)+1;
			sum += num[i];
			System.out.print(num[i]+ "\t");
			
			if((i+1)%5==0) {
				System.out.println(sum);
				sum=0;
			}
		}
		System.out.println("----------------------------------------------");
		
		
		
	}

}
