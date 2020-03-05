import java.util.Scanner;

public class IfExampleOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Unit Price : ");
		int price=sc.nextInt();
		System.out.println("Enter Quantity Purchased : ");
		int qty=sc.nextInt();
		int total=price*qty;
		int dis=0;
		
		if(total>=5000) {
			dis=total*10/100;
		} else if(total>=3000) {
			dis=total*8/100;
		} else if(total>=2000) {
			dis=total*6/100;
		} else {
			dis=total*4/100;
		}
		
		int net=total-dis;
		System.out.println("Total Amount : "+total);
		System.out.println("Discount : "+dis);
		System.out.println("Net Amount : "+net);

	}

}
