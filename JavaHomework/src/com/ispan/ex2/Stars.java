package com.ispan.ex2;

public class Stars {

	public static void main(String[] args) {
		String star1 = "";
		String star2 = "";
		String star3 = "";
		int rowNum = 5;
		
		for(int i = 1; i <= rowNum; i++) {
			for(int j = 1; j <= i; j++) {
				star1 = star1 + "*";
			}
			System.out.println(star1);
			star1 = "";
		}
		
		System.out.println("==========================================");
		
		for(int i = 1; i <= rowNum; i++) {
			for(int j = 1; j < i; j++) {
				star2 = star2 + " ";
			}
			for(int k = rowNum; k >= i; k--) {
				star2 = star2 + "*";
			}
			System.out.println(star2);
			star2 = "";
		}
		
		System.out.println("==========================================");
		
		for(int i = 1; i <= rowNum; i++) {
			for(int j = rowNum; j > i; j--) {
				star3 = star3 + " ";
			}
			for(int k = 1; k <= i*2 -1; k++) {
				star3 = star3 + "*";
			}
			System.out.println(star3);
			star3 = "";
		}
		
		
	}

}
