package com.biz.bus.service;

import java.util.Scanner;

public class BusPaySerivceImplV1 implements BusPayService {

	protected int intAge;	// 사용자가 입력한 나이가 할당될 변수
	protected int pay;		// 입력한 나이에 따른 금액이 할당될 변수
	
	@Override
	public boolean userInput() {
		Scanner scan = new Scanner(System.in);
		String strAge = "";
		intAge = 0;
		
		System.out.print("나이를 입력하세요 : ");
		strAge = scan.nextLine();
		System.out.println("--------------------------------------------------");

		try {
			intAge = Integer.valueOf(strAge);
			
			if(strAge.contains("-")) {
				System.out.println("음수는 입력하실 수 없어요! 다시입력해주세요 :(");
				System.out.println("--------------------------------------------------");

				return false;
			}
		} catch (NumberFormatException e) {
			System.out.println("나이는 숫자만 입력가능합니다! 다시입력해주세요 :(");
			System.out.println("--------------------------------------------------");
			return false;

		}
		
		return true;
	}

	@Override
	public void payCalc() {
		
		pay = 1500;	// 일반요금은 1500원
		
		if(intAge <= 6 || intAge >= 65) {
			pay = 0;
		} else if (intAge <= 12) {
			pay = 800;
		} else if (intAge <= 18 ) {
			pay = 1200;
		}
	}

	@Override
	public void printOuput() {
		
		System.out.printf("입력하신 나이에 해당하는 요금은 %d원 입니다\n", pay);
		System.out.println("이용해주셔서 감사합니다 :)");
		System.out.println("==================================================");

	}

}
