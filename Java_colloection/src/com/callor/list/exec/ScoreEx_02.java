package com.callor.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.list.model.ScoreVO;
import com.callor.list.service.ScoreServiceV1;

public class ScoreEx_02 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		ScoreServiceV1 sService = new ScoreServiceV1();
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		int stdNum = 20;
		
		for(int i = 0; i<stdNum; i++) {
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setNum((i+1)+"");
			scoreVO.setKor(rnd.nextInt(50)+51);
			scoreVO.setEng(rnd.nextInt(50)+51);
			scoreVO.setMath(rnd.nextInt(50)+51);
			
			scoreVO.setSum(scoreVO.getKor()+scoreVO.getEng()+scoreVO.getMath());
			scoreVO.setAvg(scoreVO.getSum()/3);
			
			scoreList.add(scoreVO);
		}
		
		sService.scoreList(scoreList);
		
	}
}
