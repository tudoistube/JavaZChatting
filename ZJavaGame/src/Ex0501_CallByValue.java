public class Ex0501_CallByValue {

	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;

		System.out.println("swap() �޼ҵ� ȣ�� �� : " + a + ", " + b);

		swap(a, b);

		System.out.println("swap() �޼ҵ� ȣ�� �� : " + a + ", " + b);

		System.out.println("Hello World!");
	}

}
