package com.ispan.ex5_2;

public class Rectangle {
	int length, width;
	
	Rectangle(){
		
	}
	
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	public void computeArea() {
		System.out.println("面積為:" + length * width);
	}
	public void computeCircumference() {
		System.out.println("周長為:" + 2 * (length + width));
	}
}
