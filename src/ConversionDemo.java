
public class ConversionDemo {

	public static void main(String[] args) {

		//case-1 (types are same)
			int v1=10;
			double v2=2.5;
			
		//case-2 (types are diff)
			//a (implicit conversion)
			
				double v3=50;	//int is converted to double
				long v4=25;		//int is converted to long
				
			//b (explicit conversion)
				
				int v5=(int) 45.5;	//double to int
				float v6=(float) 23.45;	//double to float
				
				
			//c (conversion not possible)
				//int v7=(int)true;
				//boolean v8=(boolean)1;
				
		    //d (floating point value assigned to integral type variable)
				long v9=(long) 2.5f;	//float to long
				
				
				
				

	}

}
