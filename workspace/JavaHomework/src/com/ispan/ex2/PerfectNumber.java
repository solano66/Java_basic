package com.ispan.ex2;

public class PerfectNumber {

	public static void main(String[] args) {
		String perfectNum = "100內的完美數有";
		
		for(int i = 1; i <= 100; i++) {
			int factorSum = 0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					factorSum += j;
				}
			}
			if(i == factorSum) {
				perfectNum = perfectNum + i + "、";
			}
		}
		System.out.println(perfectNum.substring(0, perfectNum.length() - 1) + "。");
	}

}
