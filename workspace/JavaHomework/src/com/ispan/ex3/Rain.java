package com.ispan.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Rain {
	
	public static double[][][] randomRain(){
		double[][][] rain = new double[5][4][3];
		
		for(int i = 0; i < rain.length; i++) {
			for(int j = 0; j < rain[i].length; j++) {
				for(int k = 0; k < rain[i][j].length; k++) {
					rain[i][j][k] = Math.random() * 150;
				}
			}
		}
		
		return rain;
	}
	
	public static void calculateAll(double[][][] rain) {
		double avgAll = 0;
		
		for(int i = 0; i < rain.length; i++) {
			for(int j = 0; j < rain[i].length; j++) {
				for(int k = 0; k < rain[i][j].length; k++) {
					avgAll += rain[i][j][k];
				}
			}
		}
		avgAll = avgAll / (rain.length * 12);
			
		System.out.println("總平均降雨量為:" + avgAll);
	}
	
	public static void calculateYear(double[][][] rain) {
		double[] allAvgYear = new double[rain.length];
		boolean checkScanner = false;
		int year = 0;
		Scanner s = new Scanner((System.in));
		
		while(checkScanner == false) {
			System.out.println("請輸入要計算的年份(1~5)");
			
			year = s.nextInt();
			checkScanner = (year >= 1 && year <= rain.length) ? true : false;
			if(checkScanner == false) {
				System.out.println("輸入錯誤");
			}
		}
		s.close();
		
		for(int i = 0; i < rain.length; i++) {
			for(int j = 0; j < rain[i].length; j++) {
				for(int k = 0; k < rain[i][j].length; k++) {
					allAvgYear[i] += rain[i][j][k];
				}
			}
			allAvgYear[i] = allAvgYear[i] / 12;
		}
		
		double avgYear = allAvgYear[year - 1];	
		System.out.println("第" + year + "年每月平均降雨量為:" + avgYear);
	}
	
	public static void calculateSeason(double[][][] rain) {
		double[][] allAvgSeason = new double[rain.length][4];
		boolean checkScanner = false;
		int season = 0;
		Scanner s = new Scanner((System.in));
		
		while(checkScanner == false) {
			System.out.println("請輸入要計算的季度(1~4)");
			season = s.nextInt();
			checkScanner = (season >= 1 && season <= 4) ? true : false;
			if(checkScanner == false) {
				System.out.println("輸入錯誤");
			}	
		}
		s.close();
		
		for(int i = 0; i < rain.length; i++) {
			for(int j = 0; j < rain[i].length; j++) {
				for(int k = 0; k < rain[i][j].length; k++) {
					allAvgSeason[i][j] += rain[i][j][k];
				}
			}
		}
		
		double avgSeason = 0;
		for(int i = 0; i < rain.length; i++) {
			avgSeason += allAvgSeason[i][season - 1];
		}
		avgSeason = avgSeason / rain.length;
		System.out.println("第" + season + "季平均降雨量為:" + avgSeason);
	}
	
	public static void calculateMonth(double[][][] rain) {
//		double[][] allAvgMonth = new double[rain.length][12];
		boolean checkScanner = false;
		int month = 0;
		Scanner s = new Scanner((System.in));
		
		while(checkScanner == false) {
			System.out.println("請輸入要計算的月份(1~12)");
			month = s.nextInt();
			checkScanner = (month >= 1 && month <= 12) ? true : false;
			if(checkScanner == false) {
				System.out.println("輸入錯誤");
			}	
		}
		s.close();
		
		double avgMonth = 0;
		for(int i = 0; i < rain.length; i++) {
			avgMonth += rain[i][(month - 1) / 3][(month - 1) % 3];
		}
		avgMonth = avgMonth / rain.length;
		System.out.println(month + "月平均降雨量為:" + avgMonth);
	}
	
	public static void main(String[] args) {
		
		double rain[][][] = randomRain();
		boolean checkScanner = false;
		Scanner s = new Scanner((System.in));
		
		A:while(checkScanner == false) {
			System.out.println("請輸入降雨量種類\nall:總平均降雨量\nyear:年度平均降雨量\nseason:季度平均降雨量\nmonth:月份平均降雨量");
			String option = s.next();
			switch(option) {
				case "all":
					checkScanner = true;
					calculateAll(rain);
					break;
				case "year":
					checkScanner = true;
					calculateYear(rain);
					break;
				case "season":
					checkScanner = true;
					calculateSeason(rain);
					break;
				case "month":
					checkScanner = true;
					calculateMonth(rain);
					break;
				default:
					System.out.println("輸入錯誤，請重新輸入");
					break A;
			}
		}
		s.close();

	}

}
