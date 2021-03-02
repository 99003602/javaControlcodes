package com.ltts;

public class methods {
	int a=10;
	int b=20;//instance variables
	void displayInfo()
	{
		System.out.println(a+b);
	}
public static void main(String[] args) {
	methods m=new methods();//m is object
	m.a=25;
	m.b=36;
	m.displayInfo();
}
}
