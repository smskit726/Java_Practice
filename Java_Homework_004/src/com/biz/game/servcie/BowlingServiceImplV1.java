package com.biz.game.servcie;

import java.util.List;
import java.util.Scanner;

public class BowlingServiceImplV1 implements BowlingService{

	private Scanner scan;
	private List<Integer[]> scoreList;
	private Integer[] scoreArr;
	
	private BowlingServiceImplV1() {
	}
	
	public BowlingServiceImplV1(Scanner scan, List<Integer[]> scoreList) {
		this.scan = scan;
		this.scoreList = scoreList;
	}
	
	@Override
	public void scoreWrite() {
		
		for(int i=1; i<=10; i++) {
			while(this.firstBall(i)) {
				this.secondBall(i);
				break;
			}
			
			if(i==10) {
				this.thirdBall(i);
			}
			LineService.lineGen("-", 50);
		}
		
		
			
		
	}

	@Override
	public boolean firstBall(int frame) {
		
		if(frame==10) {
			scoreArr = new Integer[3];
		} else {
			scoreArr = new Integer[2];
		}
		
		String strScore = "";
		int intScore = 0;
		
		while(true) {
			System.out.printf("%d 프레임 1번째 투구 : ", frame);
			strScore = scan.nextLine();
			
			if(strScore.equalsIgnoreCase("x")) {
				scoreArr[0] = 10;
				scoreArr[1] = 0;
				return false;
			} else if(strScore.equals("-")) {
				strScore = "0";
			}
			
			try {
				intScore = Integer.valueOf(strScore);
				
				if(intScore<0 || intScore>10) {
					System.out.println("점수 입력이 잘못되었습니다. 다시 입력해주세요 :(");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("점수 입력이 잘못되었습니다. 다시 입력해주세요 :(");
				continue;
			}
			break;			
		}
		scoreArr[0] = intScore;
		return true;
	}

	@Override
	public void secondBall(int frame) {
		
		String strScore = "";
		int intScore = 0;
		
		while(true) {
			System.out.printf("%d 프레임 2번째 투구 : ", frame);
			strScore = scan.nextLine();
			
			if(strScore.equals("/")) {
				strScore = 10 - scoreArr[0] + "";
			} else if(strScore.equals("-")) {
				strScore = "0";
			}
			
			try {
				intScore = Integer.valueOf(strScore);
				
				if(intScore<0|| intScore>10) {
					System.out.println("점수 입력이 잘못되었습니다. 다시 입력해주세요 :(");
					continue;
				}else if(scoreArr[0] + intScore > 10) {
					System.out.println("점수 입력이 잘못되었습니다. 다시 입력해주세요 :(");
					continue;
				}
				
			} catch (NumberFormatException e) {
				System.out.println("점수 입력이 잘못되었습니다. 다시 입력해주세요 :(");
				continue;
			}
			
			break;
		}
		
		scoreArr[1] = intScore;
		
		if(frame!=10) {
			scoreList.add(scoreArr);
		}
		
	}

	@Override
	public void thirdBall(int frame) {
		
		int ckScore = scoreArr[0] + scoreArr[1];
		
		if(ckScore != 10) {
			scoreArr[2] = 0;
			scoreList.add(scoreArr);
			return;
		}
		
		String strScore = "";
		int intScore = 0;
		
		while(true) {
			System.out.printf("%d 프레임 3번째 투구 : ", frame);
			strScore = scan.nextLine();
			
			if(strScore.equalsIgnoreCase("x")) {
				strScore = "10";
			} else if(strScore.equals("-")) {
				strScore = "0";
			}
			
			try {
				intScore = Integer.valueOf(strScore);
				
				if(intScore<0|| intScore>10) {
					System.out.println("점수 입력이 잘못되었습니다. 다시 입력해주세요 :(");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("점수 입력이 잘못되었습니다. 다시 입력해주세요 :(");
				continue;
			}
			break;
		}
		
		scoreList.add(scoreArr);
	}

	@Override
	public void calcScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scoreBoard() {
		// TODO Auto-generated method stub
		
	}

}
