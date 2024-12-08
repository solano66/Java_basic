package com.ispan.ex2;

public class Rabbit {

	public static void main(String[] args) {
		int rabbit = 1;
		
		while(!(rabbit % 3 == 1 && rabbit % 5 == 3 && rabbit % 7 == 2)) {
			rabbit++;
		}
		System.out.println(rabbit);
	}

}
