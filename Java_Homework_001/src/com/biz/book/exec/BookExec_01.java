package com.biz.book.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.book.domain.BookVO;
import com.biz.book.service.BookService;
import com.biz.book.service.BookServiceImplV1;
import com.biz.book.service.LineService;

public class BookExec_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<BookVO> bookList = new ArrayList<BookVO>();
		
		BookService bService = new BookServiceImplV1(scan, bookList);

		LineService.lineGen("▦", 50);
		System.out.println("BookService V1");
		LineService.lineGen("▦", 50);


		while(true) {
			if(!bService.inputBName()) {
				break;
			} else if(!bService.inputBCode()) {
				break;
			}
		}

		bService.printBookInfo();

	}
}
