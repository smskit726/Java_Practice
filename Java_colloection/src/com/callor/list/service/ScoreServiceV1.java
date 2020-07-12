package com.callor.list.service;

import java.util.List;

import com.callor.list.model.ScoreVO;

public class ScoreServiceV1 {
	
	public void scoreList(List<ScoreVO> scoreList) {
		
		System.out.println("================================================");
		System.out.println("성적일람표");
		System.out.println("================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		
		for(int i = 0; i<scoreList.size(); i++) {
			ScoreVO scoreVO = scoreList.get(i);
			System.out.print(scoreVO.getNum()+"\t");
			System.out.print(scoreVO.getKor()+"\t");
			System.out.print(scoreVO.getEng()+"\t");
			System.out.print(scoreVO.getMath()+"\t");
			System.out.print(scoreVO.getSum()+"\t");
			System.out.print(scoreVO.getAvg()+"\n");
		}
		System.out.println("================================================");
	}

}
