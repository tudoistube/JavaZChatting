
public class Ex0408_ParseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String num= "11";

	    try{
	     //...parseInt, parseByte, parseShort, parseLong
	      int bin= Integer.parseInt(num, 2); //...2진수.
	      int oct= Integer.parseInt(num, 8); //...8진수.
	      int dec= Integer.parseInt(num, 10); //...10진수.
	      int hex= Integer.parseInt(num, 16); //...16진수.

	      System.out.println("* 주어진 값    : "+ num);
	      System.out.println(" 2진수로 봤을때: "+ bin);
	      System.out.println(" 8진수로 봤을때: "+ oct);
	      System.out.println("10진수로 봤을때: "+ dec);
	      System.out.println("16진수로 봤을때: "+ hex);

	    }catch(NumberFormatException e){
	      System.out.println("ERROR: "+ e);
	    }
	}

}
