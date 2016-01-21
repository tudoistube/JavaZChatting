import java.io.*;
import java.net.*;//...네트워크 프로그램 작성 관련.

public class Ch05_05_GetLocalIPAddress 
{
	   public static void main(String args[]){
	      try{
	         InetAddress inetAddressLocal = InetAddress.getLocalHost();
	      // IP주소가 바이트 배열 저장됨
	         byte[] arrAddress = inetAddressLocal.getAddress(); 
	         
	         System.out.print("사용 중인 호스트의 IP 주소는 ");
	         
	         for(int i=0; i<arrAddress.length; i++){
	        	//...byte[] arrAddress = inetAddressLocal.getAddress(); 에 저장된 값은
	        	//...읽을 때는 반환되는 바이트 값은 부호가 있는 정수 값이 됨.
	        	//...128(MSB가 1)이상의 값은 음수가 되므로, 양의 정수값으로 변환해줘야 함.
	        	//...음수(MSB가 1)라면 256을 더해 원래 반환하려는 양의 정수 값으로 변환시킴.
	        	//...예) 255는 반환되면 -1의 바이트 값을 가짐.
	        	//...이 값에 256을 더하면 원래의 값인 255로 변환됨.
	            int unsigned = arrAddress[i]<0 ? arrAddress[i]+256 : arrAddress[i];
	            System.out.print(unsigned+".");
	         }
	         
	         System.out.println();
	         
	      }catch(UnknownHostException e){
	         System.out.println("로컬 호스트의 IP 주소를 알 수 없습니다.");
	      }
	   }
	}