import java.util.Scanner;
public class calc{
	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter first num");
		int fn = sc.nextInt();
		System.out.println ("Enter Second num");
		int sn= sc.nextInt();
		 System.out.println("Enter the following option");
		 System.out.println("1. For Addition");
		 System.out.println("2. For Subtraction");
		 System.out.println("3. For Multiplication");
		 System.out.println("4. For Division");
		 int option = sc.nextInt();

	
	switch (option){
	case 1:
		System.out.println(fn+sn);
		break;
	case 2 :
		System.out.println(fn-sn);
		break;
	case 3 :
		System.out.println(fn*sn);
		break;
	case 4 :
		if (sn==0){
			System.out.println("Cannot be divided");
		}else {
		System.out.println(fn/sn);

		}
		break;	 
		}
	}

}
