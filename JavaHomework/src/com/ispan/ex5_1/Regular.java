package com.ispan.ex5_1;

public class Regular extends Staff {
	private int salary;
	private int lunchAllowance;
	
	Regular(){
		
	}
	
	Regular(String name, String gender, String onBoardDate, String phone, String email, int salary, int lunchAllowance){
		super(name, gender, onBoardDate, phone, email);
		this.salary = salary;
		this.lunchAllowance = lunchAllowance;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getLunchAllowance() {
		return lunchAllowance;
	}
	public void setLunchAllowance(int lunchAllowance) {
		this.lunchAllowance = lunchAllowance;
	}
	
	public int monthlySalary() {
		return salary + lunchAllowance;
	}
	
}
