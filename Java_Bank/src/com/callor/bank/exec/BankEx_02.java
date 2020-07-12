package com.callor.bank.exec;

import com.callor.bank.model.BankVO;
import com.callor.bank.service.BankServiceV1;

public class BankEx_02 {
	public static void main(String[] args) {
		
		BankServiceV1 bService = new BankServiceV1();
		BankVO[] bankVO = new BankVO[5];
		
		for(int i =0; i<bankVO.length; i++) {
			bankVO[i] = new BankVO();
			bankVO[i].setNum("001");
			bankVO[i].setDate("2020-05-0" + (i+1));
		}
		
		bankVO[0].setInput(5000);
		bankVO[2].setInput(5000);
		
		bankVO[1].setOutput(1000);
		bankVO[3].setOutput(1000);
		bankVO[4].setOutput(1000);
		
		bService.bankList(bankVO);
		
	}

}
