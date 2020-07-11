package com.callor.array;

import java.util.Random;

public class Array_05 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] num = new int[100];
		int cnt = 0;
		int sum = 0;
		int i,j,k;
		
		
		for(i=0; i<num.length; i++) {
			num[i]= rnd.nextInt(99)+1;
		}
		
		
		for(j = 0; j<num.length; j++) {
			for(k=2; k<num[j]; k++) {
				if(num[j]%k==0) {
					break;
				}
			}
			
			if(num[j]==k) {
				cnt++;
				sum += num[j];
				System.out.printf("다.바.) [%d] %d\n",j,num[j]);
			}		
		}
		
		System.out.println();
		System.out.println("라.) 소수 개수 : " + cnt);
		System.out.println("마.) 소수 합 : " + sum);
		System.out.println();
		
		for(j=0; j<num.length; j++) {
			for(k=2; k<num[j]; k++) {
				if(num[j]%k==0) {
					break;
				}
			}
			
			if(num[j]==k) {
				System.out.println("사.) 최초 소수 Index : " + j);
				break;
			}
		}
		
		
	}
}
