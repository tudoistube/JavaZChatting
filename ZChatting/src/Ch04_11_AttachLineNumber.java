import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch04_11_AttachLineNumber 
{
	   public static void main(String args[]){
	      String strText;
	      FileInputStream fis=null;
	      FileOutputStream fos=null;
	      
	      if(args.length != 2){ // �μ��� �ҽ����ϸ� �� ������ϸ��� �Է��ؾ� �Ѵ�.
	         System.out.println("�ҽ����� �� ��������� �����Ͻʽÿ�.");
	         System.exit(1);
	      }
	      
	      try{
	         fis = new FileInputStream(args[0]); // �ҽ� ���ϰ� ����� �Է� ���� ��Ʈ��
	         fos = new FileOutputStream(args[1]); // ��� ���ϰ� ����� �Է� ���� ��Ʈ��
	      }catch(Exception e){
	         System.out.println(e);
	         System.exit(1);
	      }
	      
	      BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	      PrintStream ps = new PrintStream(fos); // �⺻ fout ��½�Ʈ���� ����
	      int nCount=1;	      
	      while(true){
	         try{
	            strText=br.readLine(); // �� ���� �����͸� �д´�.
	            if(strText==null) break;
	         }catch(IOException e){
	            System.out.println(e);
	            break;
	         }
	         
	         strText = nCount + " : " + strText; // [��ȣ : ���α׷� ����] �������� ����
	         ps.println(strText); // ������ ������ ���Ͽ� ����Ѵ�.
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