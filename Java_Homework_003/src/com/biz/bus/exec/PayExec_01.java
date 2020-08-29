package com.biz.bus.exec;

import com.biz.bus.service.BusPaySerivceImplV1;
import com.biz.bus.service.BusPayService;

public class PayExec_01 {
	public static void main(String[] args) {
		
		BusPayService bPayService = new BusPaySerivceImplV1();

		System.out.println("==================================================");
		System.out.println("광주광역시 버스요금 시스템 V1");
		System.out.println("==================================================");
		
		while(!bPayService.userInput());
		bPayService.payCalc();
		bPayService.printOuput();
		
	}

}
