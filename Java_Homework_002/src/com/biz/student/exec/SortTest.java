package com.biz.student.exec;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		
		String[] arr = new String[] {"0001","0003","0002","0005","0004"};
		Arrays.sort(arr);
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int intArr = Integer.valueOf(arr[3]);
		
		System.out.println(intArr);
	}
}
