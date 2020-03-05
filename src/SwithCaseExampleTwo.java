import java.util.Scanner;

public class SwithCaseExampleTwo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter State Name : ");
		String state=sc.next();
		
		switch(state) {
		case "mp":
			System.out.println("Bhopal");
			break;
		case "mh":
			System.out.println("Mumbai");
			break;
		case "rj":
			System.out.println("Jaipur");
			break;
		}

	}

}
