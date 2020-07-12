package com.callor.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.list.model.ScoreVO;
import com.callor.list.service.ScoreServiceV1;

public class ScoreEx_01 {
	public static void main(String[] args) {
		ScoreServiceV1 sService = new ScoreServiceV1();
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		Random rnd = new Random();
		int stdNum = 20;
		int subNum = 3;
		int sum = 0;
		int avg = 0;
		
		for(int i = 0; i<stdNum; i++ ) {
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setNum((i+1)+"");
			scoreVO.setKor(rnd.nextInt(50)+51);
			scoreVO.setEng(rnd.nextInt(50)+51);
			scoreVO.setMath(rnd.nextInt(50)+51);
			
			sum  = scoreVO.getKor() + scoreVO.getEng() + scoreVO.getMath();
			avg = sum/subNum;
			
			scoreVO.setSum(sum);
			scoreVO.setAvg(avg);
			
			scoreList.add(scoreVO);
		}
		
		System.out.println("=======================================================");
		System.out.println("성적일람표");
		System.out.println("=======================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------");
		for(ScoreVO scoreVO : scoreList) {
			System.out.print(scoreVO.getNum()+"\t");
			System.out.print(scoreVO.getKor()+"\t");
			System.out.print(scoreVO.getEng()+"\t");
			System.out.print(scoreVO.getMath()+"\t");
			System.out.print(scoreVO.getSum()+"\t");
			System.out.print(scoreVO.getAvg()+"\n");
		}
		System.out.println("=======================================================");
		
	}
}
