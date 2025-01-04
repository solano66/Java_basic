package com.ispan.ex5_1;

public class Staff {
	private String name;
	private String gender;
	private String onBoardDate;
	private String phone;
	private String email;

	Staff(){
		
	}
	
	Staff(String name, String gender, String onBoardDate, String phone, String email){
		this.name = name;
		this.gender = gender;
		this.onBoardDate = onBoardDate;
		this.phone = phone;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getOnBoardDate() {
		return onBoardDate;
	}



	public void setOnBoardDate(String onBoardDate) {
		this.onBoardDate = onBoardDate;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	
	public void showInformation() {
		System.out.println("姓名:" + name);
		System.out.println("性別:" + gender);
		System.out.println("到職日:" + onBoardDate);
		System.out.println("電話:" + phone);
		System.out.println("eamil:" + email);
	}
	
	public int monthlySalary() {
		return 0;
	}
	
	public void showSalary() {
		System.out.println("本月薪資為:" + monthlySalary());
	}
}
