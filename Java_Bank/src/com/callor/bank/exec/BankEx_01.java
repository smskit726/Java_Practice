package com.callor.bank.exec;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.callor.bank.model.BankVO;

public class BankEx_01 {
	public static void main(String[] args) {
		
		BankVO[] bankVO = new BankVO[5];
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
		Date day = new Date();	
		
		for(int i=0; i<bankVO.length; i++) {
			bankVO[i] = new BankVO();
			bankVO[i].setNum("00"+(i+1));
			bankVO[i].setDate(format.format(day));
		}
		
		bankVO[0].setInput(5000);
		bankVO[2].setInput(5000);
		
		bankVO[1].setOutput(1000);
		bankVO[3].setOutput(1000);
		bankVO[4].setOutput(1000);
		
	}

}
