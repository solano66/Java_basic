package com.ispan.ex5_2;

public class Circle implements Shape{
	int r;
	
	Circle(){
		
	}
	
	Circle(int r){
		this.r = r;
	}
	public void computeArea() {
		System.out.println("面積為:" + PI * PI * r);
	}
	public void computeCircumference() {
		System.out.println("周長為:" + 2 * PI * r);
	}
	
}
