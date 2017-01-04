

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Ex0202_VariableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    char myChar='\u0041'; //...unicode.
	    System.out.println("myChar = "+ myChar);

	    int myInt= 0x15; //...hexadecimal.
	    System.out.println("myInt = "+ myInt);

	    float myFloat= 15.1F;
	    System.out.println("myFloat = "+ myFloat);

	    System.out.println("Single Quote(\')\tBackslash(\\)");
	    
	    //...Date test.
	    Date today= new Date();

	    System.out.println(today);
	    
	    SimpleDateFormat dateForm= new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
	    SimpleDateFormat dateForm2= new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm��");

	    System.out.println(dateForm.format(today));
	    System.out.println(dateForm2.format(today));	    
	    
	    Calendar now= Calendar.getInstance();

	    int date= now.get(Calendar.DATE);
	    int hour= now.get(Calendar.HOUR);
	    int min = now.get(Calendar.MINUTE);
	 
	    System.out.println("Date : " + date + " ����ð��� "+ hour +"�� "+ min +"�� �Դϴ�.");	    
	    
	    Random r= new Random();

	    System.out.println("0 ~ 99 ������ ����: "+ Math.abs(r.nextInt() % 100));	    
	    
	    //Date today= new Date();
	    SimpleDateFormat dateForm3 = new SimpleDateFormat("yyyy�� MM�� dd���� ");
	    System.out.print(dateForm3.format(today));

	    Random r2= new Random();
	    int randomNum= Math.abs(r2.nextInt() % 100)+1;
	    System.out.println("������(100): "+ randomNum +"%");	    
	}

}
