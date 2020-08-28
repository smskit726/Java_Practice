package com.biz.pay.service;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PayServiceImplV1 implements PayService{
	
	protected int intTotal;
	protected int[] paper;
	protected int[] paperNum;
	
	public PayServiceImplV1() {
		// 사용자가 입력한 금액
		intTotal = 0;
		
		// 금액권 종류 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 50원, 10원
		paper = new int[] {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		// 지폐 매수가 담길 배열
		paperNum = new int[paper.length];
	}
	
	@Override	
	public boolean userInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요 : ");
		
		String strTotal = scan.nextLine();
		
		try {
			intTotal = Integer.valueOf(strTotal);
			
			if(intTotal <= 10) {
				System.out.println("----------------------------------");
				System.out.println("금액은 10원 이상 입력가능합니다 :(");
				System.out.println("다시 입력해주세요");
				System.out.println("----------------------------------");
				return false;
			}
			
		} catch (Exception e) {
			System.out.println("----------------------------------");
			System.out.println("금액은 숫자로만 입력 가능합니다 :(");
			System.out.println("다시 입력해주세요");
			System.out.println("----------------------------------");
			return false;
		}
		
		return true;
	}
	
	@Override
	public void paperCalc() {
		
		// 지페매수가 담길 변수
		int paperNum = 0;
		
		// 지폐매수 계산을 위한 임시 변수
		int temp = intTotal;
		
		for(int i = 0; i<paper.length; i++) {
			paperNum = temp/paper[i];
			temp -= paperNum * paper[i];
			this.paperNum[i] = paperNum;
		}
	}

	@Override
	public void printOutput() {

		DecimalFormat df = new DecimalFormat("#,##0");
		System.out.printf("금액확인 : %s 원\n", df.format(intTotal));
		System.out.println("----------------------------------");
		for(int i=0; i<paperNum.length; i++) {
			System.out.printf("%d원권 : %d 매\n", paper[i], paperNum[i]);
		}
		System.out.println("==================================");
	}
	


}
