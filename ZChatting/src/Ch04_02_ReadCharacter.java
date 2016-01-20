import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch04_02_ReadCharacter 
{
	   public static void main(String args[]) throws IOException {
	      int nRead;
	      String strData;	      
	      char[] ch_arrBuffer = new char[80];    
	      FileReader fr = new FileReader("example04_01.txt");
	      
	      while((nRead = fr.read(ch_arrBuffer)) > -1){
	         System.out.println(ch_arrBuffer);
	      }
	      fr.close();
	   }
	}
