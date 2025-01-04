package com.ispan.ex1;

public class Refund {

	public static void main(String[] args) {
		int needToPay = 5432;
		int payment = 8000;
		int refund = payment - needToPay;
		
		if(needToPay > payment) {
			System.out.println("金額不足");
		}
		else if(needToPay == payment) {
			System.out.println("不必找錢");
		}
		else {
			int count1000 = refund / 1000;
			int count500 = refund % 1000 / 500;
			int count100 = refund % 500 / 100;
			int count50 = refund % 100 / 50;
			int count10 = refund % 50 / 10;
			int count5 = refund % 10 / 5;
			int count1 = refund % 5;
			String change = "";
			if(count1000 != 0) {
				change = change + count1000 + "張1000元";
			}
			if(count500 != 0) {
				if(change != "") {
					change = change + "、";
				}
				change = change + count500 + "張500元";
			}
			if(count100 != 0) {
				if(change != "") {
					change = change + "、";
				}
				change = change + count100 + "張100元";
			}
			if(count50 != 0) {
				if(change != "") {
					change = change + "、";
				}
				change = change + count50 + "個50元硬幣";
			}
			if(count10 != 0) {
				if(change != "") {
					change = change + "、";
				}
				change = change + count10 + "個10元硬幣";
			}
			if(count5 != 0) {
				if(change != "") {
					change = change + "、";
				}
				change = change + count5 + "個5元硬幣";
			}
			if(count1 != 0) {
				if(change != "") {
					change = change + "、";
				}
				change = change + count1 + "個1元硬幣";
			}
			System.out.println("應找回" + change + "。");
		}

	}

}
