
public class Ex0408_ParseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String num= "11";

	    try{
	     //...parseInt, parseByte, parseShort, parseLong
	      int bin= Integer.parseInt(num, 2); //...2����.
	      int oct= Integer.parseInt(num, 8); //...8����.
	      int dec= Integer.parseInt(num, 10); //...10����.
	      int hex= Integer.parseInt(num, 16); //...16����.

	      System.out.println("* �־��� ��    : "+ num);
	      System.out.println(" 2������ ������: "+ bin);
	      System.out.println(" 8������ ������: "+ oct);
	      System.out.println("10������ ������: "+ dec);
	      System.out.println("16������ ������: "+ hex);

	    }catch(NumberFormatException e){
	      System.out.println("ERROR: "+ e);
	    }
	}

}
