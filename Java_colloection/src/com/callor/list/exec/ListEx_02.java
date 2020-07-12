package com.callor.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_02 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i =0; i<100; i++) {
			intList.add(rnd.nextInt(100)+1);
		}
		
		for(int i =0; i<intList.size(); i++) {
			
			if(intList.get(i)==55) {
				System.out.printf("[%d] %d\n", i , intList.get(i));
			}
		}
		
		for(int i = 0; i<intList.size(); i++) {
			if(intList.get(i)==30) {
				System.out.printf("[%d] %d\n",i,intList.get(i));
				break;
			}
		}
		
		
	}
}
