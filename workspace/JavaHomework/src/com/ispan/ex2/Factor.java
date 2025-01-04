package com.ispan.ex2;

public class Factor {

	public static void main(String[] args) {
		int num = 36;
		String factor = num + "的因數為";
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				factor = factor + i + "、";
			}
		}
		System.out.println(factor.substring(0, factor.length() - 1) + "。");
	}

}
