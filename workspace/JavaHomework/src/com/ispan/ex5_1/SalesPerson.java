package com.ispan.ex5_1;

public class SalesPerson extends Regular{
	private int salesAllowance;
	
	SalesPerson(){
		
	}

	SalesPerson(String name, String gender, String onBoardDate, String phone, String email, int salary, int lunchAllowance, int salesAllowance){
		super(name, gender, onBoardDate, phone, email, salary, lunchAllowance);
		this.salesAllowance = salesAllowance;
	}
	
	public int getSalesAllowance() {
		return salesAllowance;
	}

	public void setSalesAllowance(int salesAllowance) {
		this.salesAllowance = salesAllowance;
	}
	
	public int monthlySalary() {
		return super.monthlySalary() + salesAllowance;
	}
	
}
