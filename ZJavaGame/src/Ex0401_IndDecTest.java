

public class Ex0401_IndDecTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int x, y, z;

	    x= 10; y= 5; z= 0;
	    z= x++ - y-- + 1;
	    System.out.println("x = "+ x +", y = "+ y +", z = "+ z);

	    x= 10; y= 5; z= 0;
	    z= ++x - --y + 1;
	    System.out.println("x = "+ x +", y = "+ y +", z = "+ z);
	}

}
