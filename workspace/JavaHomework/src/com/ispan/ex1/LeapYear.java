package com.ispan.ex1;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2000;
		if(year%400 == 0) {
			System.out.println(year + "是閏年");
		}
		else if (year%100 == 0) {
			System.out.println(year + "不是閏年");
		}
		else if (year%4 == 0) {
			System.out.println(year + "是閏年");
		}
		else{
			System.out.println(year + "不是閏年");
		}
	}

}
