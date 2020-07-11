package com.callor.array;

import java.util.Random;

public class Array_06 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] kor = new int[20];
		int[] eng = new int[20];
		int[] math = new int[20];
		int[] music = new int[20];
		
		int stdSum = 0;
		int stdAvg = 0;
		
		int korSum=0;
		int engSum=0;
		int mathSum=0;
		int musicSum=0;
		
		int korAvg = 0;
		
		System.out.println("===========================================================");
		System.out.println("\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("-----------------------------------------------------------");
		for(int i =0; i<kor.length; i++) {
			kor[i] = rnd.nextInt(51)+50;
			eng[i] = rnd.nextInt(51)+50;
			math[i] = rnd.nextInt(51)+50;
			music[i] = rnd.nextInt(51)+50;
			
			stdSum = kor[i] + eng[i] + math[i] + music[i];
			stdAvg = stdSum/4;
			
			korSum += kor[i];
			engSum += eng[i];
			mathSum += math[i];
			musicSum += music[i];
			
			System.out.printf("\t%d\t%d\t%d\t%d\t%d\t%d\n",kor[i],eng[i],math[i],music[i],stdSum,stdAvg);		 	
		}
		System.out.println("-----------------------------------------------------------");
		System.out.printf("총점\t%d\t%d\t%d\t%d\n",korSum,engSum,mathSum,musicSum);
		System.out.printf("평균\t%d\t%d\t%d\t%d\n",korSum/20,engSum/20,mathSum/20,musicSum/20);
		System.out.println("===========================================================");
	}
}
