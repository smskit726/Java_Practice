package com.biz.game.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.game.servcie.BowlingService;
import com.biz.game.servcie.BowlingServiceImplV1;

public class BowlingExec_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Integer[]> scoreList = new ArrayList<Integer[]>();
		
		BowlingService bService = new BowlingServiceImplV1(scan, scoreList);
		
		bService.scoreWrite();

	}
}
