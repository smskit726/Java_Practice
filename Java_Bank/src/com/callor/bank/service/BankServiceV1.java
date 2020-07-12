package com.callor.bank.service;

import com.callor.bank.model.BankVO;

public class BankServiceV1 {
	
	public void bankList(BankVO[] bankVO) {
		
		System.out.println("========================================================");
		System.out.println("입출금 거래 내역서");
		System.out.println("========================================================");
		System.out.println("계좌번호\t날짜\t\t입금\t출금\t잔액");
		
		int valance = 0;
		
		for(int i=0; i<bankVO.length; i++) {
			
			
			valance += bankVO[i].getInput();
			valance -= bankVO[i].getOutput();
			bankVO[i].setValance(valance);
			
			System.out.print(bankVO[i].getNum()+"\t\t");
			System.out.print(bankVO[i].getDate()+"\t");
			System.out.print(bankVO[i].getInput()+"\t");
			System.out.print(bankVO[i].getOutput()+"\t");
			System.out.println(valance);
			
		}
		System.out.println("========================================================");
		
		
	}
}
