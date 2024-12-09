package com.ispan.ex2;

public class Rope {

	public static void main(String[] args) {
		int roop = 3000;
		int day = 0;
		
		while(roop > 5) {
			roop = roop / 2;
			day++;
		}
		System.out.println(day);

	}

}
