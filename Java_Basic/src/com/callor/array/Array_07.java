package com.callor.array;

import java.util.Random;

public class Array_07 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] num = new int[100];
		int cnt = 0;
		
		System.out.println("------------------------------------");
		for(int i= 0; i<num.length; i++) {
			num[i] = rnd.nextInt(100)+1;
			System.out.print(num[i]+"\t");
			cnt++;
			if(cnt%5==0) {
				System.out.println();
			}
		}
		System.out.println("------------------------------------");
		
	}

}
