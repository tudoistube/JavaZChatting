

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
	    // 0 ~ 2 ������ ������ ���Ѵ�.
	    Random r= new Random();
	    int computer= Math.abs(r.nextInt() % 3);

	    BufferedReader in= new BufferedReader(new InputStreamReader(System.in));

	    String user;
	    System.out.print("����, ����, �� �� �ϳ��� �����ϼ���. (����=0, ����=1, ��=2): ");
	    user= in.readLine();

	    if(user.equals("0")){
	      if(computer==0) System.out.println("���º� (��ǻ��:����, ���:����)");
	      if(computer==1) System.out.println("��ǻ�� ��! (��ǻ��:����, ���:����)");
	      if(computer==2) System.out.println("��� ��! (��ǻ��:��, ���:����)");
	    }else if(user.equals("1")){
	      if(computer==0) System.out.println("��� ��! (��ǻ��:����, ���:����)");
	      if(computer==1) System.out.println("���º� (��ǻ��:����, ���:����)");
	      if(computer==2) System.out.println("��ǻ�� ��! (��ǻ��:��, ���:����)");
	    }else if(user.equals("2")){
	      if(computer==0) System.out.println("��ǻ�� ��! (��ǻ��:����, ���:��)");
	      if(computer==1) System.out.println("��� ��! (��ǻ��:����, ���:��)");
	      if(computer==2) System.out.println("���º� (��ǻ��:��, ���:��)");
	    }
	}

}
