import java.io.*; //...IOException, InputStream, OutputStream

public class Ch02_03_ReadNumberData 
{
	   static FileInputStream fis;
	   static DataInputStream dis;
	   
	   public static void main(String args[]){
	      boolean blData;
	      double dlData;
	      int number;
	      
	      try{
	         fis = new FileInputStream("example02_01.txt");
	         dis = new DataInputStream(fis);
	         
	         blData = dis.readBoolean(); // 부울 값을 읽는다.
	         System.out.println(blData);
	         
	         dlData = dis.readDouble(); // 실수 값을 읽는다.
	         System.out.println(dlData);
	         
	         while(true){
	        	//...dis.readInt()는 -1을 포함한 정수 값을 읽는 메서드.
	        	//...파일의 끝을 만나면 EOF(-1)이 아닌 EOFException 예외를 발생시킴.
	            number = dis.readInt();
	            System.out.print(number+" "); // 정수값을 읽고 화면에 출력한다.
	         }
	         
	      }catch(EOFException e){
	         System.out.println("데이터를 모두 읽었습니다."); // 정상종료
	      }catch(IOException e){ // 비정상 종료
	         System.err.println(e);
	      }
	   }
	}
