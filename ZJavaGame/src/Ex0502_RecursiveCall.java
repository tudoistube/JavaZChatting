public class Ex0502_RecursiveCall {
	
	public static int power(int x, int y)
	{
		if (y <= 0){
			return 1;
		}else{
			return x * power(x, y-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("power(2,1) : " + power(2,1) );
		System.out.println("power(2,2) : " + power(2,2) );
		System.out.println("power(2,3) : " + power(2,3) );
		System.out.println("power(2,4) : " + power(2,4) );
		System.out.println("power(2,5) : " + power(2,5) );
								
		System.out.println("Hello World!");
	}

}
