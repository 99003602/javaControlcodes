package com.ltts;


class Parent{
	void displayInfo() 
	
	{
		System.out.println("Parent class method");
	}

}
class Child extends Parent
{
	void getInfo()
	{ 
		System.out.println("child class method");
	}
}

class ChildChild extends Child
{
	void showInfo()
	{
		System.out.println("ChildChild class method");
	}
}



public class inheritence {
	public static void main(String[] args) {
		ChildChild c=new ChildChild();
		c.getInfo();
		c.displayInfo();
		c.showInfo();
		
	}
}
