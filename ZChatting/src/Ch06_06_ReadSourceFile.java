import java.io.*;
import java.net.*;//...네트워크 프로그램 작성 관련.
/***
 * 웹문서를 읽어서 화면에 출력함.
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch06_06_ReadSourceFile http://joywins.kr/2Be

<!DOCTYPE html>
<!--2Check::v001::index.jsp::20150124-001::is it necessary to set lang into 'en'?
<html lang="en">
 -->
<html>
<head>

 * @author Administrator
 *
 */
public class Ch06_06_ReadSourceFile 
{
	   public static void main(String args[]){
	      String line;
	      URL u;
	      
	      if(args.length>0){
	         try{

	            u = new URL(args[0]); // args[0]은 URL이며 객체를 생성함
	            
	            try{
		        	/*
		        	 * URL객체는 데이터를 송수신하는 프로토콜 및 특정한 호스트의 파일을 가리킴.
		        	 * openStream() : URL이 가리키는 원격 호스트에 연결하고 연결된 호스트로부터
		        	 * URL이 지정한 파일의 내용을 읽을 수 있는 InputStream객체를 반환하여 원격호스트의
		        	 * 파일 내용이 읽혀짐.
		        	 * 
		        	 *  InputStream객체를 통해 읽은 데이터는 URL이 가리키고 있는 파일의 원시내용임.
		        	 *  즉, URL이 텍스트 파일을 가리키면 스트림은 ASCII데이터를 반환하고
		        	 *  HTML파일이면 원시 HTML을 반환하고
		        	 *  이미지파일이면 2진수의 이미지 데이터를 반환함.
		        	 *  반환하는 데이터에는 HTML의 헤더나, 프로토콜과 고나련된 정보는 들어있지 않음.
		        	 *  파일의 내용만을 포함함.
		        	 */	            	
	               InputStream is = u.openStream(); // 입력 스트림 객체 생성
	               Reader isr = new InputStreamReader(is);
	               BufferedReader br = new BufferedReader(isr);
	               
	               while((line=br.readLine()) != null){ // URL의 파일을 한 줄씩 읽는다.
	                  System.out.println(line);
	               }
	            }catch(Exception e){
	               System.out.println(e);
	            }
	         }catch(MalformedURLException e){
	            System.err.println(args[0]+"는 URL 형식이 아닙니다.");
	         }
	      }
	   }
	}