package com.ispan.ex5_1;

public class PartTime extends Staff {
	private int hourlyWage;
	private int workHours;
	
	PartTime(){
		
	}
	
	PartTime(String name, String gender, String onBoardDate, String phone, String email, int hourlyWage, int workHours){
		super(name, gender, onBoardDate, phone, email);
		this.hourlyWage = hourlyWage;
		this.workHours = workHours;
	}
	
	public int getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public int getWorkHours() {
		return workHours;
	}
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	
	public int monthlySalary() {
		return hourlyWage * workHours;
	}
}
