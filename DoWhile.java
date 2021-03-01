import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int x=sc.nextInt();
		do
		{
			System.out.println("x");
			x--;		
		}
		while(x>=0);
	
	}
}