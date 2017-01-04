
public class Ex0404_LogicalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    boolean x, y, z, b;

	    x = false;
	    y= z = true;
	    b = x || y && z;
	    System.out.println("x = "+ x +", y = "+ y +", z = "+ z +", b = "+ b);
	    
	    //...최단평가.
	    int a= 2;
	    int c= 4;

	    if((++a>3)&&(++c>8)){
	      System.out.println("if문이 수행되었습니다.");
	    }

	    System.out.println("a : "+ a +", c : "+ c);
	    
	    int q, w, e;
	    boolean r;

	    q = w = e = 1;
	    r = ((q-- > 0 ) || ( ++w != 0 ) && ( --e == 0));
	    System.out.println("q = "+ q +", w = "+ w +", e = "+ e +", r = "+ r);	    
	}

}
