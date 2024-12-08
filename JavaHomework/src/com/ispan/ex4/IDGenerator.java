package com.ispan.ex4;

import java.util.Arrays;
import java.util.Scanner;

public class IDGenerator {

	public static void main(String[] args) {
		String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		int[] codes = {10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33};
		String[] region = {"台北市", "台中市", "基隆市", "台南市", "高雄市", "新北市", "宜蘭縣", "桃園市", "嘉義市", "新竹縣", "苗栗縣", "台中縣", "南投縣", "彰化縣", "新竹市", "雲林縣", "嘉義縣", "台南縣", "高雄縣", "屏東縣", "花蓮縣", "台東縣", "金門縣", "澎湖縣", "陽明山", "連江縣"};
		int index = 0;
		int count = 0;
		int[] IDNumber = new int[9];
		String ID = "";
		int checkCode = 0;
		
		System.out.println("請輸入出生地");
		Scanner s = new Scanner((System.in));
		String birthRegion = s.next();
		System.out.println("請輸入性別");
		String gender = s.next();
		
		for(int i = 0; i < region.length; i++) {
			if(birthRegion.equals(region[i])) {
				index = i;
				break;
			}
		}
		int genderNumber = (gender.equals("男")) ? 1 : 2;
		IDNumber[0] = genderNumber;
		for(int i = 1; i < IDNumber.length - 1; i++) {
			IDNumber[i] = (int)(Math.random()*10);
		}
		for(int i = 0; i < IDNumber.length - 1; i++) {
			checkCode +=  IDNumber[i] * (IDNumber.length - i - 1);
		}
		checkCode = checkCode + codes[index] / 10 + codes[index] % 10 * 9;
		checkCode = 10 - (checkCode % 10);
		if(checkCode == 10) {
			checkCode = 0;
		}
		IDNumber[IDNumber.length - 1] = checkCode;
		ID = ID + letters[index];
		for(int i = 0; i < IDNumber.length; i++) {
			ID = ID + IDNumber[i];
		}

		System.out.println(ID);
		
		
		
	}

}
