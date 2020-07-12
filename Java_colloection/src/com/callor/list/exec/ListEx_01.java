package com.callor.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_01 {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0; i<100; i++) {
			intList.add(rnd.nextInt(100)+1);
		}
		
		int sum = 0;
		
		for(int i =0; i<intList.size(); i++) {
			sum += intList.get(i);
			
			if(intList.get(i)%2==0) {
				System.out.println(intList.get(i));
			}
		}
		
		System.out.println();
		System.out.println("합 : " + sum);
		
		
		
	}

}
