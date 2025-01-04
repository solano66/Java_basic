package com.ispan.ex4;

import java.util.Arrays;

public class Verifier {

	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
			System.out.println((int)(Math.random()*10));
		}
		
		int[] veriferCode = new int[4];
		int count = 0;
		
		while(count < veriferCode.length) {
			int temp = (int)(Math.random()*10);
			boolean duolicate = false;
			
			for(int i = 0; i < count; i++) {
				if(temp == veriferCode[i]) {
					duolicate = true;
					break;
				}
			}
			if(!duolicate) {
				veriferCode[count] = temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(veriferCode));
		
		String allLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		for(int i = 0; i < 6; i++) {
			System.out.println(allLetters.charAt((int)(Math.random()*allLetters.length())));
		}
	}

}
