package ch12;
import java.io.*;

public class Ex1207_DataInputOutputTest
{
  public static void main(String[] args)
  {
    char myChar='T';
    byte myByte= 44;
    boolean myBoolean= true;

    try{
      DataOutputStream out= new DataOutputStream(new FileOutputStream("Ex1207_MYDATA"));
      out.writeChar(myChar);
      out.writeByte(myByte);
      out.writeBoolean(myBoolean);
      out.flush();
      out.close();

      DataInputStream in= new DataInputStream(new FileInputStream("Ex1207_MYDATA"));
      myChar= in.readChar();
      System.out.println("myChar: "+ myChar);
      myByte= in.readByte();
      System.out.println("myChar: "+ myByte);
      myBoolean= in.readBoolean();
      System.out.println("myChar: "+ myBoolean);

    }catch(IOException e){
      System.out.println(e.toString());
    }
  }
}