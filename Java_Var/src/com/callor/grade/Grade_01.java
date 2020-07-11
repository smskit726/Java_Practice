package com.callor.grade;

import java.util.Random;

public class Grade_01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int kor1 = rnd.nextInt(50)+51;
		int kor2 = rnd.nextInt(50)+51;
		int kor3 = rnd.nextInt(50)+51;
		int kor4 = rnd.nextInt(50)+51;
		int kor5 = rnd.nextInt(50)+51;
		int kor6 = rnd.nextInt(50)+51;
		int kor7 = rnd.nextInt(50)+51;
		int kor8 = rnd.nextInt(50)+51;
		int kor9 = rnd.nextInt(50)+51;
		int kor10 = rnd.nextInt(50)+51;
		
		int sum = kor1+kor2+kor3+kor4+kor5+kor6+kor7+kor8+kor9+kor10;
		int avg = sum/10;
		
		System.out.println(kor1);
		System.out.println(kor2);
		System.out.println(kor3);
		System.out.println(kor4);
		System.out.println(kor5);
		System.out.println(kor6);
		System.out.println(kor7);
		System.out.println(kor8);
		System.out.println(kor9);
		System.out.println(kor10);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		
		
		
		
	}

}
