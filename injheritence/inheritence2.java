package com.ltts;


class parent1{
	void dispInfo()
	{
		System.out.println("parent1");
	}
}

interface parent2{
	default void getInfo()
	{
		System.out.println("parent2");
	}
}

class child1 extends parent1 implements parent2 
{
	public void showInfo()
	{
	System.out.println("child class");	
	}
}
public class inheritence2 {
	public static void main(String[] args) {
		child1 cc=new child1();
		cc.showInfo();
		cc.getInfo();
		cc.dispInfo();
		
	}

}
