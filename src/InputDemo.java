import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("What is your name : ");
		String name=sc.next();
		
		
		System.out.println("What is your age : ");
		int age=sc.nextInt();
		System.out.println("What is your salary : ");
		double sal=sc.nextDouble();
		
		System.out.println("Your Details  : ================>");
		System.out.println(name);
		System.out.println(age);
		System.out.println(sal);
		

	}

}
