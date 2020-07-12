package com.callor.score.exec;

import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreServiceV1;

public class ScoreEx_02 {
	public static void main(String[] args) {

		ScoreServiceV1 sService = new ScoreServiceV1();
		Random rnd = new Random();

		int stdNum = 20;
		int[] sum = new int[stdNum];
		float[] avg = new float[stdNum];
		String[] subject = { "kor", "math", "eng" };

		ScoreVO[] scoreVO = new ScoreVO[stdNum];

		for (int i = 0; i < scoreVO.length; i++) {
			scoreVO[i] = new ScoreVO();
			scoreVO[i].setName((i + 1) + "");
			scoreVO[i].setIntKor(rnd.nextInt(50) + 51);
			scoreVO[i].setIntEng(rnd.nextInt(50) + 51);
			scoreVO[i].setIntMath(rnd.nextInt(50) + 51);

			sum[i] = scoreVO[i].getIntKor() + scoreVO[i].getIntEng() + scoreVO[i].getIntMath();
			avg[i] = (float) sum[i] / subject.length;
		}

		System.out.println("=========================================================");
		System.out.println("성적일람표");
		System.out.println("=========================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------------------");
		
		for(int i = 0; i<scoreVO.length; i++) {
			sService.scoreList(scoreVO[i]);
		}
		
		System.out.println("=========================================================");
	}

}
