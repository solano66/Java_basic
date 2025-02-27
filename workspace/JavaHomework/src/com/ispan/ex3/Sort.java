package com.ispan.ex3;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] bubbleSort = {7, 3, 1, 10, 9, 2, 6, 8, 4, 5};
		int[] selectionSort = {7, 3, 1, 10, 9, 2, 6, 8, 4, 5};
		int[] insertionSort = {7, 3, 1, 10, 9, 2, 6, 8, 4, 5};
		
		for (int i = 0; i < bubbleSort.length - 1; i++) {
			for(int j = 0; j < bubbleSort.length - 1 - i; j++) {
				if(bubbleSort[j] > bubbleSort[j + 1]) {
					int temp = bubbleSort[j];
					bubbleSort[j] = bubbleSort[j + 1];
					bubbleSort[j + 1] = temp;
				}
			}
		}
			
		System.out.println("bubbleSort = " + Arrays.toString(bubbleSort));
		System.out.println("=======================================================");

		for (int i = 0; i < selectionSort.length; i++) {
			int min = i;
			int temp = selectionSort[i];
			for(int j = i + 1; j < selectionSort.length; j++) {
				if(selectionSort[j] < selectionSort[min]) {
					min = j;
				}
			}
			selectionSort[i] = selectionSort[min];
			selectionSort[min] = temp;
		}
		System.out.println("selectionSort = " + Arrays.toString(selectionSort));
		System.out.println("=======================================================");

		for (int i = 1; i < insertionSort.length; i++) {
			int temp = insertionSort[i];
			int j = 0;
			while (j < i && insertionSort[i] > insertionSort[j]) {
				j++;
			}
			while(j < i) {
				insertionSort[i] = insertionSort[i - 1];
				i--;
			}
			insertionSort[j] = temp;
		}
		
		System.out.println("insertionSort = " + Arrays.toString(insertionSort));
	}

}
