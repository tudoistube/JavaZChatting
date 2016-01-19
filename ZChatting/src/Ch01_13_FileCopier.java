import java.io.*; //...IOException, InputStream, OutputStream

public class Ch01_13_FileCopier {
	
	//...이클립스 실행은 프로젝트폴더아래 src폴더 위에 파일이 있어야 실행가능함.
	//...콘솔 실행은 src폴더 아래에 파일이 있어야 실행가능함.
	   public static void main(String args[]){
		   
		      int bytesRead;
		      byte[] buffer = new byte[256];
		      FileInputStream fin = null;
		      FileOutputStream fout = null;
		      
		      try{
		         fin = new FileInputStream("example01_09.txt");
		         fout = new FileOutputStream("example01_13.txt");
		         //...반드시 메모리를 중간 매개체로 이용해서 입출력한다.
		         while((bytesRead = fin.read(buffer)) >= 0){ // 소스파일 -> 메모리
		            fout.write(buffer, 0, bytesRead); // 메모리 -> 목적지파일
		         }
		      }catch(IOException e){
		         System.err.println("스트림으로부터 데이터를 읽을 수 없습니다.");
		      }finally{
		         try{
		            if(fin != null) fin.close();
		            if(fout != null) fout.close();
		         }catch(IOException e){}
		      }
		      
		   }
	   
		}