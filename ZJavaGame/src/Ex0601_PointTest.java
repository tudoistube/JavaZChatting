
public class Ex0601_PointTest {

	public static void main(String[] args) {

		Point p = new Point();

		p.x = 10;
		p.y = 20;
		p.printXY();

		System.out.println("Hello World!");		
	}

}

class Point
{
	int x, y;

	public void printXY()
	{
		System.out.println("x = " + x + ", y = " + y);
	}
}