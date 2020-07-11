package com.callor.array;

import java.util.Random;

public class Array_04 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] num = new int[20];
		int cnt = 0;
		int sum = 0;
		
		for(int i=0; i<num.length; i++) {
			num[i] = rnd.nextInt(50)+51;
			
			if(num[i]%3==0 || num[i]%5==0) {
				cnt++;
				sum += num[i];
				System.out.println("다.) " + num[i]);
			}
		}
		System.out.println();
		System.out.println("라.) 3또는 5의배수 개수 : " + cnt);
		System.out.println("마.) 3또는 5의배수 합 : " + sum);
		
		
	}

}
