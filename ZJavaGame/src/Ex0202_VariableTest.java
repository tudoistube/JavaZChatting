

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
	    
	    SimpleDateFormat dateForm= new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
	    SimpleDateFormat dateForm2= new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");

	    System.out.println(dateForm.format(today));
	    System.out.println(dateForm2.format(today));	    
	    
	    Calendar now= Calendar.getInstance();

	    int date= now.get(Calendar.DATE);
	    int hour= now.get(Calendar.HOUR);
	    int min = now.get(Calendar.MINUTE);
	 
	    System.out.println("Date : " + date + " 현재시간은 "+ hour +"시 "+ min +"분 입니다.");	    
	    
	    Random r= new Random();

	    System.out.println("0 ~ 99 범위의 난수: "+ Math.abs(r.nextInt() % 100));	    
	    
	    //Date today= new Date();
	    SimpleDateFormat dateForm3 = new SimpleDateFormat("yyyy년 MM월 dd일의 ");
	    System.out.print(dateForm3.format(today));

	    Random r2= new Random();
	    int randomNum= Math.abs(r2.nextInt() % 100)+1;
	    System.out.println("금전운(100): "+ randomNum +"%");	    
	}

}
