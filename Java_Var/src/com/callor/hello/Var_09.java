package com.callor.hello;

public class Var_09 {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 2; i <= 100; i++) {
			int j;
			for (j = 2; j < i; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
