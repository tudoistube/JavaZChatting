public class Ex0503_OverloadTest {
	
	public static int max(int x, int y)
	{
		if(x > y){
			return x;
		}else{
			return y;
		}
	}

	public static double max(double x, double y)
	{
		if(x > y){
			return x;
		}else{
			return y;
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println("max(10, 20) : " + max(10, 20) );

		double c = 10.5;
		double d = 20.5;
		System.out.println("max(10.5, 20.5) : " + max(10.5, 20.5) );
											
		System.out.println("Hello World!");
	}

}
