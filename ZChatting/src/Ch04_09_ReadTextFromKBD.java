import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch04_09_ReadTextFromKBD 
{
	   public static void main(String args[]) throws IOException {
	      String strText;
	      InputStreamReader isr;
	      BufferedReader br;
	      FileOutputStream fos;
	      OutputStreamWriter osw;
	      BufferedWriter bw;
	      
	      isr = new InputStreamReader(System.in);
	      br = new BufferedReader(isr);
	      
	      fos = new FileOutputStream("example04_09.txt");
	      osw = new OutputStreamWriter(fos, "KSC5601");
	      bw = new BufferedWriter(osw);
	      
	      while((strText=br.readLine()) != null){
	         System.out.println(strText); // ȭ�鿡 ����Ѵ�.
	         bw.write(strText+"\r\n"); // ���Ͽ� �����Ѵ�.
	      }
	      
	      bw.flush(); // ������ ������ �����Ѵ�.
	      bw.close();
	   }
	   
	}