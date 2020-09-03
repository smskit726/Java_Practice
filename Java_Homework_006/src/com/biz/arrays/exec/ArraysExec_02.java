package com.biz.arrays.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArraysExec_02 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();

		// intList에 1~100 사이의 정수를 저장 (list.size = 10)
		for (int i = 0; i < 10; i++) {
			intList.add(rnd.nextInt(100) + 1);
		}

		int size = intList.size();

		// intList에 담긴 정수를 console에 출력
		System.out.print("정렬 전 : ");
		for (int j = 0; j < size; j++) {
			System.out.printf("%d ", intList.get(j));
		}
		System.out.println();

		// intList[i] 의 값을 임시저장하기 위한 변수
		int temp = 0;

		// intList를 오름차순 정렬하는 알고리즘
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (intList.get(i) > intList.get(j)) {

					temp = intList.get(i);
					intList.set(i, intList.get(j));
					intList.set(j, temp);

				}
			}
		}

		// 정렬 후 console에 출력
		System.out.print("정렬 후 (오름차순) : ");
		for (int k = 0; k < size; k++) {
			System.out.printf("%d ", intList.get(k));
		}

		// intList를 내림차순 정렬하는 알고리즘
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (intList.get(i) < intList.get(j)) {
					temp = intList.get(i);
					intList.set(i, intList.get(j));
					intList.set(j, temp);
				}
			}
		}
		System.out.println();

		// 정렬 후 console에 출력
		System.out.print("정렬 후 (내림차순) : ");
		for (int k = 0; k < size; k++) {
			System.out.printf("%d ", intList.get(k));
		}
		System.out.println();

		// 오름차순 정렬 간단한 method!
		Collections.sort(intList);
		System.out.print("정렬 후 (오름차순) : ");
		for (int k = 0; k < size; k++) {
			System.out.printf("%d ", intList.get(k));
		}
		System.out.println();
		
		// 내림차순 정렬 간단한 method
		Collections.sort(intList, Collections.reverseOrder());
		System.out.print("정렬 후 (내림차순) : ");
		for (int k = 0; k < size; k++) {
			System.out.printf("%d ", intList.get(k));
		}
		System.out.println();
		
	}
}
