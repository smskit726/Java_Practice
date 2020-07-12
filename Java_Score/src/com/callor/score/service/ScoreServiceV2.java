package com.callor.score.service;

import com.callor.score.model.ScoreVO;

public class ScoreServiceV2 {

	private ScoreVO[] scores;

	public void setScoreList(ScoreVO[] scoreVO) {
		this.scores = scoreVO;
	}

	public void scoreSum() {
		for (int i = 0; i < scores.length; i++) {
			ScoreVO scoreVO = scores[i];
			int scoreSum = scoreVO.getIntKor() + scoreVO.getIntEng() + scoreVO.getIntMath() + scoreVO.getIntMusic();
			scoreVO.setIntSum(scoreSum);
		}
	}

	public void scoreAvg() {
		for (int i = 0; i < scores.length; i++) {
			ScoreVO scoreVO = scores[i];
			scoreVO.setIntAvg(scoreVO.getIntSum() / 4);
		}
	}

	public void scoreList() {
		System.out.println("==============================================================");
		System.out.println("성적 리스트");
		System.out.println("==============================================================");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("--------------------------------------------------------------");
		for (int i = 0; i < scores.length; i++) {
			ScoreVO scoreVO = scores[i];

			System.out.print(scoreVO.getName() + "\t");
			System.out.print(scoreVO.getIntKor() + "\t");
			System.out.print(scoreVO.getIntEng() + "\t");
			System.out.print(scoreVO.getIntMath() + "\t");
			System.out.print(scoreVO.getIntMusic() + "\t");
			System.out.print(scoreVO.getIntSum() + "\t");
			System.out.printf("%d\n", scoreVO.getIntAvg());
		}

		System.out.println("--------------------------------------------------------------");

		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int musicSum = 0;

		for (int i = 0; i < scores.length; i++) {
			ScoreVO scoreVO = scores[i];
			korSum += scoreVO.getIntKor();
			engSum += scoreVO.getIntEng();
			mathSum += scoreVO.getIntMath();
			musicSum += scoreVO.getIntMusic();
		}

		System.out.printf("총점\t%d\t%d\t%d\t%d\n", korSum, engSum, mathSum, musicSum);
		System.out.printf("평균\t%d\t%d\t%d\t%d\n", korSum / scores.length, engSum / scores.length,
				mathSum / scores.length, musicSum / scores.length);
	}

}
