import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Ex0409_GuGuDan {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    int x, y;
	    Random r= new Random();

	    if(args.length==1){
	      x= Integer.valueOf(args[0]).intValue();
	    }else{
	      x= Math.abs(r.nextInt() % 9) + 1;
	    }

	    y= Math.abs(r.nextInt() % 9) + 1;
	    
	    int num= x*y;

	    System.out.println();
	    System.out.println("* ������ "+ x + "�ܿ� ���� �����Դϴ�");
	    System.out.println();


	    System.out.print(x +" * "+ y +" = ");
	 
	    BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	    String user;
	    user= in.readLine();

	    int inputNum= new Integer(user).intValue();

	    if(num==inputNum){
	      System.out.println("�¾ҽ��ϴ�!");
	    }else{
	      System.out.println("Ʋ�Ƚ��ϴ�. ������ "+ num +"�Դϴ�.");
	    }
	    
	    String strNum = new Integer(num).toString();
	    if(strNum.equals(user)){
		      System.out.println("�¾ҽ��ϴ�!");
		    }else{
		      System.out.println("Ʋ�Ƚ��ϴ�. ������ "+ num +"�Դϴ�.");
		    }	    
	}

}
