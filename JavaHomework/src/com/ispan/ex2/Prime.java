package com.ispan.ex2;

public class Prime {

	public static void main(String[] args) {
		int num = 100;
		String factor = "";
		
		for(int i = 2; i <= num; i++) {
			for(int j = 2; j < i ; j++) {
				if(i % j == 0) {
					break;
				}
				if(j == i - 1) {
					factor = factor + i + "、";	
				}
			}
			
		}
		System.out.println(factor.substring(0, factor.length() - 1) + "。");

	}

}
