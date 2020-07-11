package com.callor.array;

import java.util.Random;

public class Array_09 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] num = new int[100];
		int sum = 0;
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
		
		System.out.println("============================================");
		for(int i = 0; i<num.length; i++) {
			num[i] = rnd.nextInt(100)+1;
			sum += num[i];
			sum6 += num[i];
			
			System.out.print(num[i]+"\t");

			if(i%5 == 0) {
				sum1 += num[i];
			}
			
			if(i%5 == 1) {
				sum2 += num[i];
			}
			
			if(i%5 == 2) {
				sum3 += num[i];
			}
			
			if(i%5 ==3) {
				sum4 += num[i];
			}
			
			if(i%5 == 4) {
				sum5 += num[i];
			}
			
			if((i+1)%5==0) {
				System.out.println(sum);
				sum=0;
			}
			
		}
		System.out.println("--------------------------------------------");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n",sum1,sum2,sum3,sum4,sum5,sum6);
		System.out.println("============================================");
	}

}
