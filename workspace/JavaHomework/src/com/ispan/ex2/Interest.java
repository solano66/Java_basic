package com.ispan.ex2;

public class Interest {

	public static void main(String[] args) {
		int time = 0;
		double moneyA = 100000;
		double moneyB = 100000;
		while(moneyA >= moneyB) {
			moneyA += 100000*0.1;
			moneyB *= 1.05;
			time++;
		}
		System.out.println(time + "年後，錢精持有" + moneyA + "元，郝細算持有" + moneyB + "元。");
		
	}

}
