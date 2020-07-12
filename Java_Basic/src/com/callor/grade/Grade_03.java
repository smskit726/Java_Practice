package com.callor.grade;

import java.util.Random;

public class Grade_03 {
	public static void main(String[] args) {

		Random rnd = new Random();

		String[] subject = { "kor", "eng", "math", "music", "art" };
		int stdNum = 20;

		int[] kor = new int[stdNum];
		int[] eng = new int[stdNum];
		int[] math = new int[stdNum];
		int[] music = new int[stdNum];
		int[] art = new int[stdNum];

		int sum = 0;
		float avg = 0;

		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int musicSum = 0;
		int artSum = 0;

		System.out.println("===============================================================");
		System.out.println("\t\t\t성적일람표");
		System.out.println("===============================================================");
		System.out.println("과목\t국어\t영어\t수학\t음악\t미술\t총점\t평균\t");
		System.out.println("---------------------------------------------------------------");

		for (int i = 0; i < stdNum; i++) {

			kor[i] = rnd.nextInt(50) + 51;
			eng[i] = rnd.nextInt(50) + 51;
			math[i] = rnd.nextInt(50) + 51;
			music[i] = rnd.nextInt(50) + 51;
			art[i] = rnd.nextInt(50) + 51;
		}

		for (int i = 0; i < stdNum; i++) {

			sum = kor[i] + eng[i] + math[i] + music[i] + art[i];
			avg = (float) sum / subject.length;

			korSum += kor[i];
			engSum += eng[i];
			mathSum += math[i];
			musicSum += music[i];
			artSum += art[i];

			System.out.printf("\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n", kor[i], eng[i], math[i], music[i], art[i], sum, avg);
		}

		System.out.println("---------------------------------------------------------------");
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%d\n", korSum, engSum, mathSum, musicSum, artSum);
		System.out.printf("평균\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", (float) korSum / stdNum, (float) engSum / stdNum,
				(float) mathSum / stdNum, (float) musicSum / stdNum, (float) artSum / stdNum);
		System.out.println("===============================================================");
		
	}

}
