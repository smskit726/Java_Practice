package com.callor.hello;

import java.util.Random;

public class Var_11 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		float floatKor = rnd.nextInt(51)+50;
		float floatEng = rnd.nextInt(51)+50;
		float floatMath = rnd.nextInt(51)+50;
		
		float sum = floatKor + floatEng + floatMath;
		float Avg = sum/3;
		
		System.out.println(Avg);
		
	}

}
