package com.callor.hello;

public class Var_13 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 1; i<=100; i++) {
			cnt ++;
			System.out.print(i+"\t");
			if(cnt%5==0) {
				System.out.println();
			}
		}
	}

}
