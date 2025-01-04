package com.ispan.ex5_1;

public class Manager extends Regular {
	private int performanceAllowance;
	private int trafficAllowance;
	
	Manager(){
		
	}
	
	Manager(String name, String gender, String onBoardDate, String phone, String email, int salary, int lunchAllowance,
			int performanceAllowance, int trafficAllowance){
		super(name, gender, onBoardDate, phone, email, salary, lunchAllowance);
		this.performanceAllowance = performanceAllowance;
		this.trafficAllowance = trafficAllowance;
	}
	
	public int getPerformanceAllowance() {
		return performanceAllowance;
	}
	public void setPerformanceAllowance(int performanceAllowance) {
		this.performanceAllowance = performanceAllowance;
	}
	public int getTrafficAllowance() {
		return trafficAllowance;
	}
	public void setTrafficAllowance(int trafficAllowance) {
		this.trafficAllowance = trafficAllowance;
	}
	
	public int monthlySalary() {
		return super.monthlySalary() + performanceAllowance + trafficAllowance;
	}
}
