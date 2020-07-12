package com.callor.address.service;

import com.callor.address.model.AddressVO;

public class AddrServiceV1 {
	
	public void addrList(AddressVO addrVO) {
		
		System.out.print(addrVO.getName()+"\t");
		System.out.print(addrVO.getTel()+"\t");
		System.out.print(addrVO.getAddr()+"\t");
		System.out.print(addrVO.getIntAge()+"\n");
		
	}

}
