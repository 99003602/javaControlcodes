import java.util.Scanner;
public class DemoLogic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int x=sc.nextInt();
		if(x>=0 && x<=60)
			System.out.println("eligible");
		else
			System.out.println("not eligible");
	
	}
}