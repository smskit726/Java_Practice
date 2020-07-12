package com.callor.score.service;

import com.callor.score.model.ScoreVO;

public class ScoreServiceV1 {
	
	private int sum;
	private float avg;
	private int subNum;
	
	
	
	public ScoreServiceV1() {
		sum = 0;
		avg = 0;
		subNum = 3;
	}

	public void scoreList(ScoreVO scoreVO) {
		
		sum = scoreVO.getIntKor() + scoreVO.getIntEng() + scoreVO.getIntMath();
		avg = (float)sum/subNum;

		System.out.print(scoreVO.getName()+"\t");
		System.out.print(scoreVO.getIntKor()+"\t");
		System.out.print(scoreVO.getIntEng()+"\t");
		System.out.print(scoreVO.getIntMath()+"\t");
		System.out.print(sum+"\t");
		System.out.printf("%.2f\n",avg);
	}

}
