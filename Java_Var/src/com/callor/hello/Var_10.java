package com.callor.hello;

import java.util.Random;

public class Var_10 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int intKor = rnd.nextInt(51)+50;
		int intEng = rnd.nextInt(51)+50;
		int intMath = rnd.nextInt(51)+50;
		
		int intSum = intKor+intEng+intMath;
		int intAvg = intSum/3;
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + intAvg);
		
	}

}
