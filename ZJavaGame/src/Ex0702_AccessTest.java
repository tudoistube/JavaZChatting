
public class Ex0702_AccessTest {
	
	public static void main(String[] args)
	{
		Ex0702_AccessA1 a1 = new Ex0702_AccessA1();
		Ex0702_AccessB1 b1 = new Ex0702_AccessB1();
		Ex0702_AccessC1 c1 = new Ex0702_AccessC1();
		
		a1.a = 500;
		
		a1.method_A1();
		b1.method_B1();
		c1.method_C1();
		
		System.out.println("a = " + a1.a);
		//System.out.println("b = " + b1.);
		System.out.println("c = " + c1.c);
	}

}
