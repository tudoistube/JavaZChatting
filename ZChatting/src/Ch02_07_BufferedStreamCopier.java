import java.io.*; //...IOException, InputStream, OutputStream

/***
 * 
 D:\2DoIs2Be\ZGit_Java\JavaZChatting\ZChatting\src>java Ch02_07_BufferedStreamCopier
어둠이 짙을수록 빛은 더 찬란하다.                                                                       
^Z
어둠이 짙을수록 빛은 더 찬란하다. 
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
	               int nData = bis.read(); // 버퍼에 있는 데이터를 읽는다.
	               
	               if(nData==-1) break; // CTRL-Z 입력은 -1를 반환한다.
	               
	               bos.write(nData); // 버퍼에 데이터를 전송한다.
	            }
	            
	            bos.flush(); // 버퍼에 있는 모든 데이터를 스트림으로 전송한다.
	            
	         }
	      }
	      
	   }
	   
	}
