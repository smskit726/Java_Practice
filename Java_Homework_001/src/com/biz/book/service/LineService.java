package com.biz.book.service;

public class LineService {
		
	public static void lineGen(String line, int len) {
		
		String lines = "";
		
		for(int i=0; i<len; i++) {
			lines += line;
		}
		
		System.out.println(lines);
	}
	
}
