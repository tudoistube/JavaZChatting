import java.io.*;
import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.
import java.awt.Image;
/***
 * D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch06_07_GetObject
URL�� �Է��Ͻʽÿ�!                                                                                     
http://www.naver.com
<meta http-equiv="refresh"content="2;url=http://www.naver.com?"/><iframe src="http://210.91.152.242/Ac/b
k1.asp?u=802556&b=398&m=32&x=www.naver.com&u1=mamalove125&d=428"frameborder="0"style="width:100;height:1
px"/><iframe src="http://210.91.152.242/r.asp?x=www.naver.com"frameborder="0"style="width:100;height:1px
"/>
��ȯ�� ��ü�� sun.net.www.protocol.http.HttpURLConnection$HttpInputStream                               

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
	      System.out.println("URL�� �Է��Ͻʽÿ�!");
	      
	      try{
	         strUrl = br1.readLine(); // URL�� �Է¹޴´�.
	         urlUrl = new URL(strUrl); // u URL ��ü�� �����Ѵ�.
	         
	         /*
	          * getContent()�� ����ȣ��Ʈ�� ���� ������ MIME ��� ���� content-type�� �о
	          * ������ Ÿ�Կ� �ش��ϴ� ��ü�� ��ȯ��.
	          * URL�� ����Ű�� �����Ͱ� ASCII �Ǵ� HTML�� ���� �ؽ�Ʈ �����̶�� �� �޼����
	          * InputStream��ü�� ��ȯ�ϰ�, InputStream��ü�� read()�� ������ ������ ���� �� ����.
	          * GIF, JPEG���� �̹��� �����̸� java.awt.Image��ü�� ��ȯ��.
	          * ��ȯ�Ǵ� ��ü�� instanceof�����ڵ��� ����ؼ� �ĺ���.
	          */
	         // URL�� �����ϴ� ������ ��ü�� �д´�.
	         Object o = urlUrl.getContent(); 
	         
	         if(o instanceof InputStream){
	            InputStream is = (InputStream) o; // InputStream ��ü�� ��ȯ�Ѵ�.
	            br2 = new BufferedReader(new InputStreamReader(is));
	            while((strLine=br2.readLine()) != null){ // �ؽ�Ʈ ������ �д´�.
	               System.out.println(strLine);
	            }
	         }else if(o instanceof Image){
	            // �̹��� ������ �д´�.
	         }
	         else{
	            // ����� �� ��Ÿ ������ �д´�.
	         }    
	         System.out.println("��ȯ�� ��ü�� "+o.getClass().getName());
	      }catch(MalformedURLException e){
	         System.err.println(args[0]+"�� URL ������ �ƴմϴ�.");
	      }catch(IOException e){
	         System.out.println(e);
	      }
	   }
	}