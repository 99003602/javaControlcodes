package com.ltts;
import java.util.Scanner;

public class Array {
	//int searh;
	static int count=0;
	
	void findElementCount(int arr[],int size,int search)
	{
		arr=new int[20];
		System.out.println("enter size of array");
		Scanner s=new Scanner(System.in);
	    size=s.nextInt();
	    if(size>0 && size<20)
	    {
		
		System.out.println("Enter the elements of the array: ");  
		Scanner s1=new Scanner(System.in);
		for(int i=0; i<size; i++)  
		{   
		arr[i]=s1.nextInt();
		if(arr[i]<0)
		{
			System.out.println("invalid input");
			System.exit(0);
		}
		}  
		
		 
		
		
		System.out.println("Enter the element to be counted: "); 
		//Scanner s11=new Scanner(System.in);
	    search = s.nextInt(); 
		
		for(int j = 0;j<size;j++)
		{
			
			if(search==arr[j])
			{
				count++;
			}
		}
		System.out.println("count is:");
		System.out.println(count);
	    }
		else
	    {
		System.out.println("invalid input");
		}
		
	}
	public static void main(String[] args) {
		
		Array a=new Array();
		
		a.findElementCount(null, count, count);
		
	}

}
