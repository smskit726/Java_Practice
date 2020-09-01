package com.biz.book.service;

import java.util.List;
import java.util.Scanner;

import com.biz.book.domain.BookVO;

public class BookServiceImplV1 implements BookService {

	Scanner scan;
	BookVO bookVO;
	List<BookVO> bookList;

	private BookServiceImplV1() {
		
	}
	
	public BookServiceImplV1(Scanner scan, List<BookVO> bookList) {
		this.scan = scan;
		this.bookList = bookList;
	}

	@Override
	public boolean inputBName() {
		bookVO = new BookVO();
		String bName = "";

		while (true) {
			System.out.print("도서명을 입력하세요 (종료 : END) : ");
			bName = scan.nextLine();

			if (bName.equals("END")) {
				System.out.println("입력을 종료합니다 :)");
				return false;
			} else if (bName.isEmpty()) {
				System.out.println("도서명은 필수 입력사항입니다. 다시입력해주세요 :(");
				continue;
			}
			break;
		}
		bookVO.setBName(bName);
		return true;
	}

	@Override
	public boolean inputBCode() {
		String bCode = "";
		int intBCode = 0;
		
		while(true) {
			
			System.out.print("도서코드를 입력하세요 (종료 : END) : ");
			bCode = scan.nextLine();
			LineService.lineGen("-", 50);

			if (bCode.equals("END")) {
				System.out.println("입력을 종료합니다 :)");
				return false;
			} else if (bCode.length() > 5) {
				System.out.println("도서코드는 5자리 이내 숫자만입력가능합니다 :(");
				continue;
			}
			
			try {
				intBCode = Integer.valueOf(bCode);
				bCode = String.format("%05d", intBCode);
			} catch (NumberFormatException e) {
				System.out.println("도서코드는 숫자로만 입력가능합니다 :(");
				continue;
			}
			break;			
		}
		bookVO.setBCode(bCode);
		bookList.add(bookVO);
		return true;
	}

	@Override
	public void printBookInfo() {
		LineService.lineGen("▦", 50);
		
		for(BookVO vo : bookList) {
			System.out.println("도 서 명 : " + vo.getBName());
			System.out.println("도서코드 : " + vo.getBCode());
			LineService.lineGen("-", 50);
		}
		
	}

}
