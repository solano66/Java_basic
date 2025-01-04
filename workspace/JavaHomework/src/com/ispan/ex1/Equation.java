package com.ispan.ex1;

public class Equation {

	public static void main(String[] args) {
		int a = 1, b = -4, c = 3;
		double root = b*b - 4*a*c;
		double x1 = (-b + Math.sqrt(root)) / 2*a;
		double x2 = (-b - Math.sqrt(root)) / 2*a;
		
		if (root > 0) {
			System.out.println("有兩個不相等的實根");
			System.out.println("x1 = " + x1 + "，x2 = " + x2);
		}
		else if (root == 0) {
			System.out.println("有兩個相等的實根");
			System.out.println("x1 = x2 = " + x1);
		}
		else {
			System.out.println("沒有實根");
		}
		

	}

}
