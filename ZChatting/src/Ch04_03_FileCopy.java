import java.io.*; //...IOException, InputStream, OutputStream, FileWriter

public class Ch04_03_FileCopy 
{
	   public static void main(String args[]) throws IOException{
	      int nRead;
	      char[] ch_arrBuffer = new char[80];
	      
	      FileWriter fw = new FileWriter("example04_03.txt");
	      FileReader fr = new FileReader("example04_01.txt");
	      
	      while((nRead = fr.read(ch_arrBuffer)) > -1){
	         fw.write(ch_arrBuffer, 0, nRead);
	      }
	      
	      fw.close();
	      fr.close();
	   }
	}
