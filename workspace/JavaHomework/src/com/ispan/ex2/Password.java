package com.ispan.ex2;

public class Password {

	public static void main(String[] args) {
		boolean password = false;
		int num = 3;
		
		do{
			System.out.println("請輸入密碼");
			num++;
			if(password) {
				System.out.println("密碼輸入正確，歡迎使用本系統！");
			}
			if(num >= 3) {
				System.out.println("密碼輸入超過三次！");
				break;
			}
		}while(!password);

	}

}
