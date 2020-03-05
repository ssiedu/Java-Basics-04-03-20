
public class SwitchCaseExampleThree {

	public static void main(String[] args) {

		char gender='F';
			
			switch(gender) {
			case 'm':
			case 'M':
				System.out.println("Hello Mr.");
				break;
			case 'f':
			case 'F':
				System.out.println("Hello Ms.");
				break;
			}

	}

}
