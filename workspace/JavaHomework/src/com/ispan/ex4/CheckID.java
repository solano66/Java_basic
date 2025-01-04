package com.ispan.ex4;

public class CheckID {

	public static boolean isID(String inputID){
		char checkLetter;
		String id = inputID.toUpperCase();
		
//		檢查是否有十個字元
		if(id.length() != 10) {
//			lengthIsTen = false;
			return false;
		}
//		檢查第一個字元是否為英文字母
		checkLetter = id.charAt(0);
		if(checkLetter < 'A' || checkLetter > 'Z') {
			return false;
		}
//		檢查第二個字元是否為1或2數字
		checkLetter = id.charAt(1);
		if(!(checkLetter == '1' || checkLetter == '2')) {
			return false;
		}
//		檢查第三個至第十個字元是否為數字
		for(int i = 2; i < 10; i++) {
			checkLetter = id.charAt(i);
			if(!Character.isDigit(checkLetter)) {
				return false;
			}
		}
//		檢查最後一個檢查碼是否正確
		char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int[] codes = {10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33};
		int index = 0;
		int checkCode = 0;
		
		for(int i = 0; i < letters.length; i++) {
			if(id.charAt(0) == letters[i]) {
				index = i;
				break;
			}
		}
		for(int i = 1; i < 9; i++) {
			checkCode += Character.getNumericValue(id.charAt(i)) * (9 - i);
		}
		checkCode = checkCode + codes[index] / 10 + codes[index] % 10 * 9;
		checkCode = 10 - (checkCode % 10);
		if(checkCode == 10) {
			checkCode = 0;
		}
		if(Character.getNumericValue(id.charAt(9)) != checkCode) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isID("E147515001"));
	}

}
