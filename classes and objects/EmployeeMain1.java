package com.ltts;

import java.util.Scanner;

public class EmployeeMain1 {
	static int x;
	public static void main(String[] args) {
		Employee1 j=new Employee1();
		j.setName("chandan");
		j.setAddress("tumakuru");
		j.setMobile("8073052938");
		System.out.println("Employee details:");
		System.out.println("name:"+j.getName());
		System.out.println("address:"+j.getAddress());
		System.out.println("mobile:"+j.getMobile());
		System.out.println("\r\n");
		
		
		
		
		while(true)
		{
		System.out.println("Verify and Update the details:\r\n"
				+ "\r\n"
				+ "Menu\r\n"
				+ "\r\n"
				+ "1. Update Employee name\r\n"
				+ "\r\n"
				+ "2. Update Employee Address\r\n"
				+ "\r\n"
				+ "3. Update Employee mobile\r\n"
				+ "\r\n"
				+ "4. All information correct/Exit ");
	
		Scanner sc3=new Scanner(System.in);
		x=sc3.nextInt();
		switch (x)
		{
		case 1:
			System.out.println("current name is:\r\n"+j.getName());
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name:\r\n");
			j.setName(sc.next());
			break;
			
		case 2:
			System.out.println("current Address is:\r\n"+j.getAddress());
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter the Address:\r\n");
			j.setName(sc1.next());
			break;
			
		case 3:
			System.out.println("current mobile number is:\r\n"+j.getMobile());
			Scanner sc2=new Scanner(System.in);
			System.out.println("enter the new mobile number:\r\n");
			j.setName(sc2.next());
			break;
			
		case 4:
			System.out.println("Employee details:");
			System.out.println("name:"+j.getName());
			System.out.println("address:"+j.getAddress());
			System.out.println("mobile:"+j.getMobile());
		}
		}
	}
}


