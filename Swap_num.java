package lab_1;
import java.util.Scanner;

public class Swap_num {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a,b,c;
		System.out.println("enter first number");
		a=  s.nextInt();
		System.out.println("enter second number");
		b=  s.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("numbers have been swaped  "+a+"  "+b);

	}

}
