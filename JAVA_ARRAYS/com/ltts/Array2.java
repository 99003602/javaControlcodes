package com.ltts;
import java.util.Scanner;

public class Array2 {
	static int cricketer;
	void findCricketerId(int array[], int size, int score) 
	{
		array=new int[30];
		System.out.println("enter the size of the array");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		
		if(size>0 && size<30)
		{
		System.out.println("enter cricketer id and score");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
			if(array[i]<0)
			{
				System.out.println("invalid input");
				System.exit(0);
			}
		}
		
	    System.out.println("enter the score");
	    score=sc.nextInt();
	    
	    System.out.println("cricketers who scored more than given score are:");
	    for(int j = 0;j<size;j++)
		{
			
			if(score<array[j])
			{
				System.out.println(array[j-1]);
				System.out.println(array[j]);
			}
		}
		}
	    else
	    {
	    	System.out.println("invalid input");
	    }
	}
	
	public static void main(String[] args) {

		Array2 a=new Array2();
		
		a.findCricketerId(null, cricketer, cricketer);
	}
	
}
