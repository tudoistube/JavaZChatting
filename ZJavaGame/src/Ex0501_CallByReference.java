public class Ex0501_CallByReference {
	
	public static void swap(Number z) {
		int temp = z.a;
		z.a = z.b;
		z.b = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n = new Number();
		n.a = 10;
		n.b = 20;

		System.out.println("swap() 메소드 호출 전 : " + n.a + ", " + n.b);

		swap(n);

		System.out.println("swap() 메소드 호출 후 : " + n.a + ", " + n.b);

		System.out.println("Hello World!");
	}

}


class Number
{
	public int a;
	public int b;
}