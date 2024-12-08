package com.ispan.ex2;

public class Stars {

	public static void main(String[] args) {
		String star1 = "";
		String star2 = "";
		String star3 = "";
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				star1 = star1 + "*";
			}
			System.out.println(star1);
			star1 = "";
		}
		
		System.out.println("==========================================");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				star2 = star2 + "*";
			}
			System.out.println(star2);
			star2 = "";
		}
		
		System.out.println("==========================================");
		

	}

}
