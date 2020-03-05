import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number To Print Table : ");
		int number=sc.nextInt();
		
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(number*i);
		
		}
		

	}

}
