package com.ispan.ex4;

import java.util.Scanner;

public class MyCalendar {
	
	public static int findWeek(int year, int month) {
//		https://zh.wikipedia.org/zh-tw/%E8%94%A1%E5%8B%92%E5%85%AC%E5%BC%8F
//		蔡勒公式參考以上網址
		int d = 1;
		int w;
		
		if(month == 1) {
			month = 13;
			year = year - 1;
		}
		if(month == 2) {
			month = 14;
			year = year - 1;
		}
		
		int c = year / 100;
		int y = year % 100;
		
		w = (y + y/4 + c/4 - 2*c + (26*(month+1)/10) + d - 1) % 7;
		w = (w % 7 + 7) % 7;
		
		return w;
	}
	
	public static boolean leapYear(int year) {
		boolean leapYear = false;
		
		if(year%400 == 0) {
			leapYear = true;
		}
		else if (year%100 == 0) {
			leapYear = false;
		}
		else if (year%4 == 0) {
			leapYear = true;
		}
		else{
			leapYear = false;
		}
		
		return leapYear;
	}

	public static void main(String[] args) {
		
		int[] days = {31, 28, 31, 30 , 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println("請輸入西元年份");
		Scanner s = new Scanner((System.in));
		int year = s.nextInt();
		System.out.println("請輸入月份");
		int month = s.nextInt();
		
		leapYear(year);
		findWeek(year, month);
		boolean leapYear = leapYear(year);
		int w = findWeek(year, month);
		
		if(leapYear) {
			days[1] = 29;
		}
		int count = w;
		String gap = " ".repeat(w * 4);
		
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		System.out.print(gap);
		
		for(int i = 1; i < days[month - 1] + 1; i++) {
			System.out.printf("%3d ", i);
			count++;
			if(count % 7 == 0) {
				System.out.println();
			}
		}
		

		
		
		
		
		

	}

}
