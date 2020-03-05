
public class WhileExample {

	public static void main(String[] args) {

		int i = 11;
		
		do {
			System.out.println(2*i);
			i++;
		}while(i<=10);
		

		/*
		 * while(i<=10) { System.out.println(2*i); i=i+1; }
		 */

		System.out.println("Outside The Loop");
	}

}
