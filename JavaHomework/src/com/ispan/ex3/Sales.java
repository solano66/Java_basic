package com.ispan.ex3;

import java.util.Arrays;

public class Sales {
	static int[][] sale = {{33, 32, 56, 45, 33}, {77, 33, 68, 45, 23}, {43, 55, 43, 67, 65}};
	static int[] price = {12, 16, 10, 14, 15};
	static String[] sellers = {"Jean", "Tom", "Tina"};
	static String[] products = {"A", "B", "C", "D", "E"};
	
	public static int[] personalSaleTotal(){
		int[] pst = new int[sale.length];
		
		for(int i = 0; i < sale.length; i++) {
			for(int j = 0; j < price.length; j++) {
				pst[i] += sale[i][j] * price[j];
			}
		}
		return pst;
	}
	
	public static void bestSeller(int[] array){
		int bestMoney = 0;
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
		    if (array[i] > bestMoney) {
		    	bestMoney = array[i];
		    	index = i;
		    }
		}
		System.out.println("業績最佳者為" + sellers[index] + "，金額" + array[index] + "。");
	}
	
	public static int[] productTotal(){
		int[] pt = new int[price.length];
		
		for(int i = 0; i < price.length; i++) {
			for(int j = 0; j < sale.length; j++) {
				pt[i] += sale[j][i] * price[i];
			}
		}
		return pt;
	}
	
	public static void bestProduct(int[] array){
		int bestMoney = 0;
		int index = 0;
		
		for (int i = 0; i < array.length - 1; i++) {
		    if (array[i] > bestMoney) {
		    	bestMoney = array[i];
		    	index = i;
		    }
		}
		System.out.println("銷售總金額最高的是產品" + products[index] + "，金額" + array[index] + "。");
	}
	
	public static void main(String[] args) {		
		System.out.println(Arrays.toString(personalSaleTotal()));
		bestSeller(personalSaleTotal());
		System.out.println(Arrays.toString(productTotal()));
		bestProduct(productTotal());

	}

}
