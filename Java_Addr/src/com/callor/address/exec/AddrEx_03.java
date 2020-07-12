package com.callor.address.exec;

import com.callor.address.model.AddressVO;
import com.callor.address.service.AddrServiceV1;

public class AddrEx_03 {
	public static void main(String[] args) {
		AddrServiceV1 addrService = new AddrServiceV1();
		
		AddressVO[] addrVO = new AddressVO[3];
		
		addrVO[0] = new AddressVO();
		addrVO[0].setName("홍길동");
		addrVO[0].setTel("010-1111-1111");
		addrVO[0].setAddr("광주광역시");
		addrVO[0].setIntAge(23);
		
		addrVO[1] = new AddressVO();
		addrVO[1].setName("이몽룡");
		addrVO[1].setTel("010-2222-2222");
		addrVO[1].setAddr("대구광역시");
		addrVO[1].setIntAge(24);

		addrVO[2] = new AddressVO();
		addrVO[2].setName("성춘향");
		addrVO[2].setTel("010-3333-3333");
		addrVO[2].setAddr("대전광역시");
		addrVO[2].setIntAge(28);
		
		System.out.println("========================================================");
		System.out.println("이름\t전화번호\t주소\t\t나이");
		System.out.println("--------------------------------------------------------");
		
		addrService.addrList(addrVO[0]);
		addrService.addrList(addrVO[1]);
		addrService.addrList(addrVO[2]);
		
		System.out.println("========================================================");
		
	}

}
