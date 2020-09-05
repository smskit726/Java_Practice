package com.biz.pay.service;

public class PayServiceImplV2 extends PayServiceImplV1{

	private int total;
	private int maxPaper;
	
	public PayServiceImplV2(int total, int maxPaper) {
		this.total = total;
		this.maxPaper = maxPaper;
	}
	
	@Override
	public void paperCalc() {
		int sw = 1;
		while(total > 0) {
			int mCount = total / maxPaper;
			System.out.printf("%d원 권\t%d매\n", maxPaper, mCount);
			total -= mCount * maxPaper;
			
			if(sw >0) {
				maxPaper /= 5;
			} else {
				maxPaper /= 2;
			}
			
			sw *=-1;
		}
	}
	
	
}
