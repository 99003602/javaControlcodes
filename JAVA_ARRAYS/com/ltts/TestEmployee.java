package com.ltts;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setAge(24);
		e.setName("chandan");
		e.setSalary(30000);
		System.out.println(e.getAge()+"!! "+e.getName()+" "+e.getSalary());
	}
	

}
