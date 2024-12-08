package com.ispan.ex1;

public class Salary {

	public static void main(String[] args) {
		int workTime = 70;
		int salary_hour = 150;
		double salary_sum;
		
		if(workTime <= 60) {
			salary_sum = workTime * salary_hour;
			System.out.println("薪水為" + (int)salary_sum);
		}
		else if (workTime >= 81) {
			salary_sum = 60*salary_hour + 20*salary_hour*1.25 + (workTime - 81)*salary_hour*1.5;
			System.out.println("薪水為" + (int)salary_sum);
		}
		else {
			salary_sum = 60*salary_hour + (workTime - 60)*salary_hour*1.25;
			System.out.println("薪水為" + (int)salary_sum);
		}

	}

}
