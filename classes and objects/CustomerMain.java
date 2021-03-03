package com.ltts;

public class CustomerMain {
	public static void main(String[] args) {
		Customer c=new Customer();
		 String str = "chandan,tumakuru,8073052938"; 
	        String[] arrOfStr = str.split(",", 3); 
	        c.setName(arrOfStr[0]);
	        c.setAddress(arrOfStr[1]);
	        c.setMobile(arrOfStr[2]);
	        System.out.println("Name:"+c.getName());
			System.out.println("Address:"+c.getAddress());
	        System.out.println("Mobile:"+c.getMobile());
	      
	}

}
