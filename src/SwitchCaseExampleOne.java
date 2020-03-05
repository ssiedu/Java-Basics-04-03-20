import java.util.Scanner;


//byte, short, int, char (String java7)
public class SwitchCaseExampleOne {

	public static void main(String[] args) {

		// 50->English, 51->Maths, 52->Physics, 53->Chemistry
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Subject Code : ");
		int code = sc.nextInt();

		switch (code) {
		case 50:
			System.out.println("English");
			break;
		case 51:
			System.out.println("Maths");
			break;
		case 52:
			System.out.println("Physics");
			break;
		case 53:
			System.out.println("Chemistry");
			break;
		default:
			System.out.println("Invalid Code");

		}

		/*
		 * if(code==50) { System.out.println("English"); }else if(code==51) {
		 * System.out.println("Maths"); }else if(code==52) {
		 * System.out.println("Physics"); }else if(code==53) {
		 * System.out.println("Chemistry"); }else { System.out.println("Invalid Code");
		 * }
		 */

	}

}
