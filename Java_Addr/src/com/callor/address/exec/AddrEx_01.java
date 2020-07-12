package com.callor.address.exec;

import com.callor.address.model.AddressVO;

public class AddrEx_01 {
	public static void main(String[] args) {
		
		AddressVO address1 = new AddressVO();
		AddressVO address2 = new AddressVO();
		AddressVO address3 = new AddressVO();
		int addrSize = 3;
		
		address1.setName("홍길동");
		address1.setTel("010-1111-1111");
		address1.setAddr("광주광역시");
		address1.setIntAge(23);

		address2.setName("이몽룡");
		address2.setTel("010-2222-2222");
		address2.setAddr("대구광역시");
		address2.setIntAge(24);

		address3.setName("성춘향");
		address3.setTel("010-3333-3333");
		address3.setAddr("대전광역시");
		address3.setIntAge(28);
		
		System.out.println("=================================================");
		System.out.println("address1");
		System.out.println("이름 : " + address1.getName());
		System.out.println("이름 : " + address1.getTel());
		System.out.println("이름 : " + address1.getAddr());
		System.out.println("이름 : " + address1.getIntAge());
		System.out.println("=================================================");
		
		System.out.println("address2");
		System.out.println("이름 : " + address2.getName());
		System.out.println("이름 : " + address2.getTel());
		System.out.println("이름 : " + address2.getAddr());
		System.out.println("이름 : " + address2.getIntAge());
		System.out.println("=================================================");
		
		System.out.println("address3");
		System.out.println("이름 : " + address3.getName());
		System.out.println("이름 : " + address3.getTel());
		System.out.println("이름 : " + address3.getAddr());
		System.out.println("이름 : " + address3.getIntAge());
		
		System.out.println("=================================================");

		
	}

}
