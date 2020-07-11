package com.callor.array;

import java.util.Random;

public class Array_02 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] num = new int[10];
		int cnt = 0;
		int sum = 0;
		int index=0;
		for(index=0; index<10; index++) {
			
			num[index] = rnd.nextInt(99)+1;
			
			if(num[index]%2==0) {
				cnt++;
				sum+=num[index];
				System.out.printf("다.바.) [%d] %d\n",index,num[index]);
			}
		}
		System.out.println();
		System.out.println("라.) 짝수 개수 : "+ cnt);
		System.out.println("마.) 짝수 합 : "+ sum);
		
		for(index=0; index<10; index++) {
			if(num[index]%2==0) {
				break;
			}
		}
		System.out.println("사.) 최초 짝수 Index : "+index);		
		
	}

}
