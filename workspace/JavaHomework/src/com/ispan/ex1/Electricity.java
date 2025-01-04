package com.ispan.ex1;

public class Electricity {

	public static void main(String[] args) {
		boolean business = true;
		int electricity = 500;
		double fee_b1 = 1.63, fee_b2 = 2.1, fee_b3 = 2.89, fee_b4 = 3.94, fee_b5 = 4.6, fee_b6 = 5.03, fee_1 = 2.12, fee_2 = 2.91, fee_3 = 3.44, fee_4 = 5.05;
		double electricity_fee;
		
		if(business) {
			if(electricity <= 120) {
				electricity_fee = electricity * fee_b1;
				System.out.println("電費為" + (int)electricity_fee);
			}
			else if (electricity >= 121 && electricity <= 330) {
				electricity_fee = 120 * fee_b1 + (electricity - 120) * fee_b2;
				System.out.println("電費為" + (int)electricity_fee);
			}
			else if (electricity >= 331 && electricity <= 500) {
				electricity_fee = 120 * fee_b1 + 210 * fee_b2 + (electricity - 330) * fee_b3;
				System.out.println("電費為" + (int)electricity_fee);
			}
			else if (electricity >= 501 && electricity <= 700) {
				electricity_fee = 120 * fee_b1 + 210 * fee_b2  + 170 * fee_b3 + (electricity - 500) * fee_b4;
				System.out.println("電費為" + (int)electricity_fee);
			}
			else if (electricity >= 701 && electricity <= 1000) {
				electricity_fee = 120 * fee_b1 + 210 * fee_b2  + 170 * fee_b3 + 200 * fee_b4 + (electricity - 700) * fee_b5;
				System.out.println("電費為" + (int)electricity_fee);
			}
			else {
				electricity_fee = 120 * fee_b1 + 210 * fee_b2  + 170 * fee_b3 + 200 * fee_b4 + 300 * fee_b5 + (electricity - 1000) * fee_b6;
				System.out.println("電費為" + (int)electricity_fee);
			}
		}
		
		else {
			if(electricity <= 330) {
				electricity_fee = electricity * fee_1;
				System.out.println("電費為" + (int)electricity_fee);
			}
			else if (electricity >= 331 && electricity <= 700) {
				electricity_fee = 330 * fee_1 + (electricity - 330) * fee_2;
				System.out.println("電費為" + (int)electricity_fee);
			}
			else if (electricity >= 701 && electricity <= 1500) {
				electricity_fee = 330 * fee_1 + 370 * fee_2 + (electricity - 700) * fee_3;
				System.out.println("電費為" + (int)electricity_fee);
			}
			else {
				electricity_fee = 330 * fee_1 + 370 * fee_2  + 800 * fee_b3 + (electricity - 1500) * fee_4;
				System.out.println("電費為" + (int)electricity_fee);
			}
		}
		
		
		
	}
	

}
