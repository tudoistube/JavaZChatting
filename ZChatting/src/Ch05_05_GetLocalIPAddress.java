import java.io.*;
import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.

public class Ch05_05_GetLocalIPAddress 
{
	   public static void main(String args[]){
	      try{
	         InetAddress inetAddressLocal = InetAddress.getLocalHost();
	      // IP�ּҰ� ����Ʈ �迭 �����
	         byte[] arrAddress = inetAddressLocal.getAddress(); 
	         
	         System.out.print("��� ���� ȣ��Ʈ�� IP �ּҴ� ");
	         
	         for(int i=0; i<arrAddress.length; i++){
	        	//...byte[] arrAddress = inetAddressLocal.getAddress(); �� ����� ����
	        	//...���� ���� ��ȯ�Ǵ� ����Ʈ ���� ��ȣ�� �ִ� ���� ���� ��.
	        	//...128(MSB�� 1)�̻��� ���� ������ �ǹǷ�, ���� ���������� ��ȯ����� ��.
	        	//...����(MSB�� 1)��� 256�� ���� ���� ��ȯ�Ϸ��� ���� ���� ������ ��ȯ��Ŵ.
	        	//...��) 255�� ��ȯ�Ǹ� -1�� ����Ʈ ���� ����.
	        	//...�� ���� 256�� ���ϸ� ������ ���� 255�� ��ȯ��.
	            int unsigned = arrAddress[i]<0 ? arrAddress[i]+256 : arrAddress[i];
	            System.out.print(unsigned+".");
	         }
	         
	         System.out.println();
	         
	      }catch(UnknownHostException e){
	         System.out.println("���� ȣ��Ʈ�� IP �ּҸ� �� �� �����ϴ�.");
	      }
	   }
	}