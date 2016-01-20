import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch04_11_AttachLineNumber 
{
	   public static void main(String args[]){
	      String strText;
	      FileInputStream fis=null;
	      FileOutputStream fos=null;
	      
	      if(args.length != 2){ // 인수로 소스파일명 및 대상파일명을 입력해야 한다.
	         System.out.println("소스파일 및 대상파일을 지정하십시오.");
	         System.exit(1);
	      }
	      
	      try{
	         fis = new FileInputStream(args[0]); // 소스 파일과 연결된 입력 파일 스트림
	         fos = new FileOutputStream(args[1]); // 대상 파일과 연결된 입력 파일 스트림
	      }catch(Exception e){
	         System.out.println(e);
	         System.exit(1);
	      }
	      
	      BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	      PrintStream ps = new PrintStream(fos); // 기본 fout 출력스트림에 연결
	      int nCount=1;	      
	      while(true){
	         try{
	            strText=br.readLine(); // 한 줄의 데이터를 읽는다.
	            if(strText==null) break;
	         }catch(IOException e){
	            System.out.println(e);
	            break;
	         }
	         
	         strText = nCount + " : " + strText; // [번호 : 프로그램 내용] 형식으로 수정
	         ps.println(strText); // 수정된 내용을 파일에 출력한다.
	         nCount++;
	      }
	      
	      try{
	         fis.close();
	         fos.close();
	      }catch(IOException e){
	         System.out.println(e);
	      }
	      
	   }
	}