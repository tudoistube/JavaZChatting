public class Ex0501_CallByValue2 {

	static int a;
	static int b;		
	
	public static void swap() {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = 10;
		b = 20;

		System.out.println("swap() �޼ҵ� ȣ�� �� : " + a + ", " + b);

		swap();

		System.out.println("swap() �޼ҵ� ȣ�� �� : " + a + ", " + b);

		System.out.println("Hello World!");
	}

}
