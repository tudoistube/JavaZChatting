package ch09;
import java.awt.*;
import java.applet.*;

public class Ex0904_StringTest extends Applet
{
  char[] myChars= {'��', '��', '��', '��'};
  byte[] myBytes= {0x4b, 0x4f, 0x52, 0x45, 0x41}; 

  public void paint(Graphics g)
  {
    g.drawChars(myChars, 0, myChars.length, 10, 20);

    g.drawBytes(myBytes, 0, myBytes.length, 10, 50);

    g.drawString("����! ����! ������!", 10, 100);
  }
}