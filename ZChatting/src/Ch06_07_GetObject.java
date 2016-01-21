import java.io.*;
import java.net.*;//...네트워크 프로그램 작성 관련.
import java.awt.Image;
/***
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch06_07_GetObject
URL을 입력하십시오!                                                                                     
http://www.naver.com
<meta http-equiv="refresh"content="2;url=http://www.naver.com?"/><iframe src="http://210.91.152.242/Ac/b
k1.asp?u=802556&b=398&m=32&x=www.naver.com&u1=mamalove125&d=428"frameborder="0"style="width:100;height:1
px"/><iframe src="http://210.91.152.242/r.asp?x=www.naver.com"frameborder="0"style="width:100;height:1px
"/>
반환된 객체는 sun.net.www.protocol.http.HttpURLConnection$HttpInputStream                               

 * @author Administrator
 *
 */
public class Ch06_07_GetObject 
{
	   public static void main(String args[]){
	      URL urlUrl;	      
	      String strLine, strUrl;
	      	      
	      BufferedReader br1, br2;
	      
	      br1 = new BufferedReader(new InputStreamReader(System.in));	      
	      System.out.println("URL을 입력하십시오!");
	      
	      try{
	         strUrl = br1.readLine(); // URL을 입력받는다.
	         urlUrl = new URL(strUrl); // u URL 객체를 생성한다.
	         
	         /*
	          * getContent()는 원격호스트로 부터 수신한 MIME 헤더 속의 content-type을 읽어서
	          * 데이터 타입에 해당하는 객체를 반환함.
	          * URL이 가리키는 데이터가 ASCII 또는 HTML과 같은 텍스트 파일이라면 이 메서드는
	          * InputStream객체를 반환하고, InputStream객체의 read()로 파일의 내용을 읽을 수 있음.
	          * GIF, JPEG같은 이미지 파일이면 java.awt.Image객체를 반환함.
	          * 반환되는 객체는 instanceof연산자등을 사용해서 식별함.
	          */
	         // URL이 지정하는 파일을 객체로 읽는다.
	         Object o = urlUrl.getContent(); 
	         
	         if(o instanceof InputStream){
	            InputStream is = (InputStream) o; // InputStream 객체로 변환한다.
	            br2 = new BufferedReader(new InputStreamReader(is));
	            while((strLine=br2.readLine()) != null){ // 텍스트 파일을 읽는다.
	               System.out.println(strLine);
	            }
	         }else if(o instanceof Image){
	            // 이미지 파일을 읽는다.
	         }
	         else{
	            // 오디오 및 기타 파일을 읽는다.
	         }    
	         System.out.println("반환된 객체는 "+o.getClass().getName());
	      }catch(MalformedURLException e){
	         System.err.println(args[0]+"는 URL 형식이 아닙니다.");
	      }catch(IOException e){
	         System.out.println(e);
	      }
	   }
	}