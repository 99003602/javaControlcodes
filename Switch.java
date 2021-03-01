import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner df=new Scanner(System.in);
		System.out.println("enter number");
		int x=df.nextInt();
		switch (x) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		default:
			System.out.println("error");
		}
	
	}
}