package preWork_wk3;
import java.util.Scanner;
public class preIO {
public static void main (String[] args) {
	int num1;
	float num2;
	double num3;
	boolean b;
	char c;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number ");
	num1 = in.nextInt();
	System.out.println("Enter the float number ");
	num2 = in.nextFloat();
	System.out.println("Enter the double number ");
	num3 = in.nextDouble();
	System.out.println("Enter the boolean value ");
	b = in.nextBoolean();
	System.out.println("Enter the character ");
	c = in.next().charAt(0);
	System.out.println("The int number " + num1);
	System.out.println("The float number " + num2);
	System.out.println("The double number  " + num3);
	System.out.println("The boolean value  " + b);
	System.out.println("The Character is " + c);
}
}
	