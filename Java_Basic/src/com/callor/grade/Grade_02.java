package com.callor.grade;

import java.util.Random;

public class Grade_02 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] math = new int[10];
		int sum = 0;
		float avg = 0;
		
		for (int i = 0; i<kor.length; i++) {
			kor[i] = rnd.nextInt(50)+51;
			eng[i] = rnd.nextInt(50)+51;
			math[i] = rnd.nextInt(50)+51;
			sum = kor[i]+eng[i]+math[i];
			avg = (float)sum/3;
			System.out.printf("%d\t%d\t%d\t%d\t%.2f\n",kor[i],eng[i],math[i],sum,avg);
			
		}
		
		
	}

}
