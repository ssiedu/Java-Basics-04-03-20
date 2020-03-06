
public class ForEachTwo {

	
	public static void add(int ar[]) {
		int sum=0;
		for(int n:ar) {
			sum=sum+n;
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {

		int x[]= {10,20,30,40,50};
		int y[]= {2,4,6,8,10,12,14,16,18,20};
		int z[]= {1,2,3};
	
		add(x);
		add(y);
		add(z);
		
	}

}
