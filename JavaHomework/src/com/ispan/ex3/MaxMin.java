package com.ispan.ex3;

public class MaxMin {

	public static void main(String[] args) {
		int[] x = {7, 3, 1, 10, 9, 2, 6, 8, 4, 5};
		int min = x[0];
		int max = x[0];
		
		for (int i = 0; i < x.length; i++) {
		    if (x[i] < min) {
		        min = x[i];
		    }
		}
		for (int i = 0; i < x.length; i++) {
		    if (x[i] > max) {
		        max = x[i];
		    }
		}
		
		System.out.println("min = " + min + "，max = " + max);
	}

}
