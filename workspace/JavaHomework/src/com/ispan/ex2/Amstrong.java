package com.ispan.ex2;

public class Amstrong {

	public static void main(String[] args) {
		for(int i = 100; i < 1000; i++) {
			int a = i / 100;
			int b = i % 100 / 10;
			int c = i % 10;
			if(i == a*a*a + b*b*b + c*c*c) {
				System.out.println(i);
			}
		}

	}

}
