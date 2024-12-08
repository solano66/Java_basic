package com.ispan.ex4;

import java.util.Arrays;

public class poker {

	public static void main(String[] args) {
		String[] poker = new String[52];
		String[] suits = {"黑桃", "紅心", "方塊", "梅花"};
		for(int i = 0; i < suits.length; i++) {
			for(int j = 0; j < 13; j++) {
				poker[13 * i + j] = suits[i] + (j + 1);
			}
		}
		String[][] player = new String[4][13];

		int[] veriferCode = new int[52];
		int count = 0;
		
		while(count < veriferCode.length) {
			int temp = (int)(Math.random()*52);
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
		
//		System.out.println(Arrays.toString(poker));
//		System.out.println(Arrays.toString(veriferCode));
		
		for(int i = 0; i < player.length; i++) {
			for(int j = 0; j < player[i].length; j++) {
				player[i][j] = poker[veriferCode[i * 13 + j]];
			}
		}
		System.out.println(Arrays.deepToString(player));

	}

}
