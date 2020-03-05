import java.util.Scanner;

public class SequentialFlowExample {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Unit Price : ");
		int price=sc.nextInt();
		System.out.println("Enter Quantity Purchased : ");
		int qty=sc.nextInt();
		int total=price*qty;
		System.out.println("Total Amount : "+total);
	}

}
