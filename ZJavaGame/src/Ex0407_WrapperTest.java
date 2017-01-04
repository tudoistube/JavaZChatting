
public class Ex0407_WrapperTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int myInt= 5316;
	    System.out.println("myInt = "+ myInt);

	    String myString= new Integer(myInt).toString();	    
	    System.out.println("myString = "+ myString);

	    myString= myString.replace('6', '2');
	    
	    //...★래퍼클래스.valueOf(변수).floatValue();
	    float myFloat= Float.valueOf(myString).floatValue();
	    System.out.println("myFloat = "+ myFloat);
	    
	    Integer x= new Integer(100);
	    Integer y= new Integer(100);

	    if(x==y){
	      System.out.println(x +" == "+ y);
	    }else{
	      System.out.println(x +" != "+ y);
	    }
	    
	    if(x.equals(y)){
		      System.out.println(x +" equals "+ y);
		    }else{
		      System.out.println(x +" not equeals "+ y);
		    }	    	    
	}

}
