

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ex0304_GawiBawiBo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    // 0 ~ 2 사이의 난수를 구한다.
	    Random r= new Random();
	    int computer= Math.abs(r.nextInt() % 3);

	    BufferedReader in= new BufferedReader(new InputStreamReader(System.in));

	    String user;
	    System.out.print("가위, 바위, 보 중 하나를 선택하세요. (가위=0, 바위=1, 보=2): ");
	    user= in.readLine();

	    if(user.equals("0")){
	      if(computer==0) System.out.println("무승부 (컴퓨터:가위, 사람:가위)");
	      if(computer==1) System.out.println("컴퓨터 승! (컴퓨터:바위, 사람:가위)");
	      if(computer==2) System.out.println("사람 승! (컴퓨터:보, 사람:가위)");
	    }else if(user.equals("1")){
	      if(computer==0) System.out.println("사람 승! (컴퓨터:가위, 사람:바위)");
	      if(computer==1) System.out.println("무승부 (컴퓨터:바위, 사람:바위)");
	      if(computer==2) System.out.println("컴퓨터 승! (컴퓨터:보, 사람:바위)");
	    }else if(user.equals("2")){
	      if(computer==0) System.out.println("컴퓨터 승! (컴퓨터:가위, 사람:보)");
	      if(computer==1) System.out.println("사람 승! (컴퓨터:바위, 사람:보)");
	      if(computer==2) System.out.println("무승부 (컴퓨터:보, 사람:보)");
	    }
	}

}
