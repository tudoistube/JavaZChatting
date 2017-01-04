
public class Ex0403_AssignmentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int x, y, z;

	    x = y = z = 1;
	    z += x + y;
	    System.out.println("x = "+ x +", y = "+ y +", z = "+ z);

	    x += y -= z = 5;//...대입은 ← 방향.
	    System.out.println("x = "+ x +", y = "+ y +", z = "+ z);
	}

}
