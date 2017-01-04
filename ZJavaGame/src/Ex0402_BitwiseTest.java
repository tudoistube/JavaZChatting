
public class Ex0402_BitwiseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int x, y;

	    x= 2;
	    y= ~x; // y는 x의 보수
	    System.out.println("x = "+ x +", y = "+ y +" (~x)");

	    System.out.println(x +" AND "+ y +" = "+(x & y));
	    System.out.println(x +" OR "+ y +"  = "+(x | y));
	    System.out.println(x +" XOR "+ y +" = "+(x ^ y));

	    x= x << 2;
	    y= y << 2;
	    System.out.println("x = "+ x +" (x<<2), y = "+ y +" (y<<2)");

	    x= x >> 2;
	    y= y >> 2;
	    System.out.println("x = "+ x +" (x>>2), y = "+ y +" (y>>2)");

	    x= y >> 2;
	    y= y >>> 2;
	    System.out.println("x = "+ x +" (y>>2), y = "+ y +" (y>>>2)");
	}

}
