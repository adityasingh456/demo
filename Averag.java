package lab_1;
import java.util.Scanner;
public class Averag {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks iin five subjects");
		int s1=s.nextInt();
		int s2=s.nextInt();
		int s3=s.nextInt();
		int s4=s.nextInt();
		int s5=s.nextInt();
		Float a1;
		a1=(s1+s2+s3+s4+s5)/5.0f;
		System.out.println("the average of given subjects is " +a1);
		if (a1>=40)
			System.out.println("pass");
		else
			System.out.println("fail");			

	}

}
