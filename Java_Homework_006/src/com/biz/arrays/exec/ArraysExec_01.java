package com.biz.arrays.exec;

// 정수형 배열의 정렬
public class ArraysExec_01 {
	public static void main(String[] args) {
		int[] intArr = new int[] {10,9,20,6,7,30,22,78};
		
		int len = intArr.length;
		int temp = 0;
		
		// 정수형 배열을 오름차순으로 정렬하는 알고리즘
		for(int i =0; i<len-1; i++) {
			
			for(int j = i+1; j<len; j++) {
				if(intArr[i] > intArr[j]) {
					temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		
		// 확인
		for(int i = 0; i<len; i++) {
			System.out.println(intArr[i]);
		}
	}
	
}
