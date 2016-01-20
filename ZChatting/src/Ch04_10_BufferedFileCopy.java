import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch04_10_BufferedFileCopy 
{
	   public static void main(String args[]){
	      String strText;   
	      
	      try{
	         FileInputStream fis = new FileInputStream("example04_09.txt");
	         InputStreamReader isr = new InputStreamReader(fis, "KSC5601");
	         BufferedReader br = new BufferedReader(isr);
	         
	         FileOutputStream fos = new FileOutputStream("example04_10.txt");
	         OutputStreamWriter osw = new OutputStreamWriter(fos, "KSC5601");
	         BufferedWriter bw = new BufferedWriter(osw);
	         
	         while((strText=br.readLine()) != null){
	        	System.out.println(strText); // ȭ�鿡 ����Ѵ�.
	            bw.write(strText+"\r\n"); // readLine()�� ���κи��ڸ� �������� �ʴ´�.
	            bw.flush();
	         }
	      }catch(IOException e){
	         System.out.println(e);
	      }
	   }
	}