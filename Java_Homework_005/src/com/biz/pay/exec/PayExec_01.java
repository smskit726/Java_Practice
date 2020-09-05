package com.biz.pay.exec;

import com.biz.pay.service.PayService;
import com.biz.pay.service.PayServiceImplV2;

public class PayExec_01 {
	public static void main(String[] args) {
		
		PayService pService = new PayServiceImplV2(3785760, 50000);
		
		System.out.println("==================================");
		System.out.println("Pay Service V1");
		System.out.println("==================================");
		
		pService.paperCalc();
	}
}
