package com.ltts;

public class CompanyMain {
	public static void main(String[] args) {
		Company k=new Company();
		
		k.setName("L&T technology serviecs");
		String str="Ravi,Ram,Krishna,Shakir,Thomas";
		String[]  arrofstr= str.split(",");
		k.setEmployees(str);
		k.setTeamlead("Thomas");
		if("Thomas"==k.getTeamlead())
		{
		System.out.println("Name:"+k.getName());
		System.out.println("Employees:"+k.getEmployees());
		System.out.println("Lead:"+k.getTeamlead());
		}
		else
		{
			System.out.println("invalid input");
		}
		
		
	}

}
