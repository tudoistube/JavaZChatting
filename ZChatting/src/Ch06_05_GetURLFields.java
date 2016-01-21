import java.io.*;
import java.net.*;//...네트워크 프로그램 작성 관련.
/***
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch06_05_GetURLFields http://www.ssc.ac.kr:80/inde
x.html
u의 URL은 http://www.ssc.ac.kr:80/index.html                                                            
u의 프로토콜은 http                                                                                     
u의 호스트는 www.ssc.ac.kr                                                                              
u의 포트번호는 80                                                                                       
u의 파일이름은 /index.html                                                                              
u의 파일 내 참조위치는 null                                                                             

 * @author Administrator
 *
 */
public class Ch06_05_GetURLFields 
{
	   public static void main(String args[]){
	      for(int i=0; i<args.length; i++){
	         try{
	            URL u = new URL(args[i]);
	            System.out.println("u의 URL은 "+u);
	            System.out.println("u의 프로토콜은 "+u.getProtocol());
	            System.out.println("u의 호스트는 "+u.getHost());
	            System.out.println("u의 포트번호는 "+u.getPort());
	            //...URL의 file 필드값(경로 및 파일이름)을 문자열로 반환함.
	            //...호스트 주소 이후의 첫번째 슬래쉬(/)부터 파일 내 참조위치(섹션)의 시작을 알리는
	            //...샵기호(#)까지의 문자열을 반환함.
	            //...만일 URL이 경로 및 파일이름을 포함하지 않으면 문자열"\"을 반환함.
	            System.out.println("u의 파일이름은 "+u.getFile());
	            //...URL의 ref 필드의 값(파일 내 참조 위치로 #이후의 문자열)을 문자열로 반환함.
	            //...만일 URL이 파일 내 참조 위치 부분을 갖고 있지 않으면 null을 반환함.
	            System.out.println("u의 파일 내 참조위치는 "+u.getRef());
	         }catch(MalformedURLException e){
	            System.err.println(args[i]+"는 URL 형식이 아닙니다.");
	         }
	      }
	   }
	}