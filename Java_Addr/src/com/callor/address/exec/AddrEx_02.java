package com.callor.address.exec;

import com.callor.address.model.AddressVO;

public class AddrEx_02 {
	public static void main(String[] args) {
		AddressVO[] addrList = new AddressVO[5];
		
		addrList[0] = new AddressVO();
		addrList[0].setName("홍길동");
		addrList[0].setTel("010-1111-1111");
		addrList[0].setAddr("광주광역시");
		addrList[0].setIntAge(23);
		
		addrList[1] = new AddressVO();
		addrList[1].setName("이몽룡");
		addrList[1].setTel("010-2222-2222");
		addrList[1].setAddr("대구광역시");
		addrList[1].setIntAge(24);

		addrList[2] = new AddressVO();
		addrList[2].setName("성춘향");
		addrList[2].setTel("010-3333-3333");
		addrList[2].setAddr("대전광역시");
		addrList[2].setIntAge(28);

		addrList[3] = new AddressVO();
		addrList[3].setName("황진이");
		addrList[3].setTel("010-3333-3333");
		addrList[3].setAddr("울산광역시");
		addrList[3].setIntAge(24);

		addrList[4] = new AddressVO();
		addrList[4].setName("임꺽정");
		addrList[4].setTel("010-3333-3333");
		addrList[4].setAddr("부산광역시");
		addrList[4].setIntAge(28);
		
		System.out.println("========================================================");
		System.out.println("주소록");
		System.out.println("========================================================");
		System.out.println("이름\t전화번호\t주소\t\t나이");
		System.out.println("--------------------------------------------------------");

		for(int i=0; i<addrList.length; i++) {
			System.out.print(addrList[i].getName() +"\t");
			System.out.print(addrList[i].getTel() +"\t");
			System.out.print(addrList[i].getAddr() +"\t");
			System.out.print(addrList[i].getIntAge() +"\n");
		}
		System.out.println("========================================================");

	}

}
