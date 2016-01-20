import java.io.*; //...IOException, InputStream, OutputStream

/***
 * 
 D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch02_07_BufferedStreamCopier
����� £������ ���� �� �����ϴ�.                                                                       
^Z
����� £������ ���� �� �����ϴ�. 
 * @author Administrator
 *
 */
public class Ch02_07_BufferedStreamCopier 
{
	   public static void main(String args[]){
	      try{
	         copy(System.in, System.out);
	      }catch(IOException e){System.err.println(e);}
	   }
	   
	   public static void copy(InputStream in, OutputStream out) throws IOException{
	      synchronized(in){
	         synchronized(out){
	        	 
	            BufferedInputStream bis = new BufferedInputStream(in);
	            BufferedOutputStream bos = new BufferedOutputStream(out);
	            
	            while(true){
	               int nData = bis.read(); // ���ۿ� �ִ� �����͸� �д´�.
	               
	               if(nData==-1) break; // CTRL-Z �Է��� -1�� ��ȯ�Ѵ�.
	               
	               bos.write(nData); // ���ۿ� �����͸� �����Ѵ�.
	            }
	            
	            //...��¹��۰� �� ���� �ʾƵ� �����ִ� ������ ���������� ���۽��Ѿ� ��.
	            // ���ۿ� �ִ� ��� �����͸� ��Ʈ������ �����Ѵ�.
	            bos.flush(); 
	            
	         }
	      }
	      
	   }
	   
	}
