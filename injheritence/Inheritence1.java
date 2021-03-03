package com.ltts;

class parents
{
	void displayInfo()
	{
		System.out.println("parent class");
	}
}

class Childs extends parents
{
	void showInfo() {
		System.out.println("child class");
	}
}

public class Inheritence1{
	public static void main(String[] args) {
		Childs b=new Childs();
		b.showInfo();
		b.displayInfo();
	}
}