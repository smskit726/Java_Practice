package com.callor.hello;

public class Var_12 {
	public static void main(String[] args) {
		
		int cnt = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2==0) {
				cnt++;
			}
		}
		
		System.out.println("1~100까지 짝수 개수 : " + cnt);
		
		cnt=0;
		
		for(int i = 2; i<=100; i++) {
			if(i%3==0) {
				cnt++;
			}
		}
		
		System.out.println("2~100까지 3의배수 개수 : " + cnt);
		
	}

}
