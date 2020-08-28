package com.biz.pay.exec;

import com.biz.pay.service.PayService;
import com.biz.pay.service.PayServiceImplV1;

public class PayExec_01 {
	public static void main(String[] args) {
		
		PayService pService = new PayServiceImplV1();
		
		System.out.println("==================================");
		System.out.println("Pay Service V1");
		System.out.println("==================================");
		
		while(!pService.userInput());
		pService.paperCalc();
		pService.printOutput();
	}
}
