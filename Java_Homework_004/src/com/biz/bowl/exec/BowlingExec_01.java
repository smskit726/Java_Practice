package com.biz.bowl.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.bowl.service.BowlingService;
import com.biz.bowl.service.BowlingServiceImplV1;
import com.biz.bowl.service.LineService;

public class BowlingExec_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> scoreList = new ArrayList<Integer>();
		
		BowlingService bService = new BowlingServiceImplV1(scan, scoreList);
		
		LineService.lineGen("■", 120);
		System.out.println("Bowling Service V1");
		LineService.lineGen("-", 120);
		bService.scoreInput();
		bService.calcScore();
		bService.printScore();
	}
}
