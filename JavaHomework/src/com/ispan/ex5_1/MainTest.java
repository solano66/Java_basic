package com.ispan.ex5_1;

public class MainTest {
	
	public static void main(String[] args) {
		Staff ex_PartTime = new PartTime("臨時工", "男", "2024/01/01", "0912345678", "abc123@gmail.com", 195, 100);
		Staff ex_Regular = new Regular("一般員工", "男", "2024/01/01", "0912345678", "abc123@gmail.com", 30000, 2400);
		Staff ex_Manager = new Manager("主管", "男", "2024/01/01", "0912345678", "abc123@gmail.com", 40000, 2400, 10000, 3000);
		Staff ex_SalesPerson = new SalesPerson("銷售員", "男", "2024/01/01", "0912345678", "abc123@gmail.com", 30000, 2400, 20000);
		
		Staff[] staffArray = new Staff[4];
		staffArray[0] = ex_PartTime;
		staffArray[1] = ex_Regular;
		staffArray[2] = ex_Manager;
		staffArray[3] = ex_SalesPerson;
		
		for(int i = 0; i < staffArray.length; i++) {
			staffArray[i].showInformation();
			staffArray[i].showSalary();
			System.out.println("===========================");
		}
		
	}
}
