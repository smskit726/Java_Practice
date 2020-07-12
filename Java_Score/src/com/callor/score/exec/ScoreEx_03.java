package com.callor.score.exec;

import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreServiceV2;

public class ScoreEx_03 {
	public static void main(String[] args) {
		
		ScoreServiceV2 sService = new ScoreServiceV2();
		Random rnd = new Random();
		ScoreVO[] scoreVO = new ScoreVO[10];
		
		for(int i = 0; i<scoreVO.length; i++) {
			scoreVO[i] = new ScoreVO();
			scoreVO[i].setName((i+1)+"");
			scoreVO[i].setIntKor(rnd.nextInt(50)+51);
			scoreVO[i].setIntEng(rnd.nextInt(50)+51);
			scoreVO[i].setIntMath(rnd.nextInt(50)+51);
			scoreVO[i].setIntMusic(rnd.nextInt(50)+51);
			sService.setScoreList(scoreVO);
		}
		
		sService.scoreSum();
		sService.scoreAvg();
		sService.scoreList();
		
	}

}
