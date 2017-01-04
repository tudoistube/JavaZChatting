
public class Ex0406_CastTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int myInt;
	    //...double형을 float형으로 형변환.
	    float myFloat= (float) 3.0;
	    double myDouble;

	    myInt= (int) myFloat;
	    myDouble= myInt;
	    System.out.print("myInt = "+ myInt +", myFloat = "+ myFloat +
	                     ", myDouble = "+ myDouble);
	}

}
