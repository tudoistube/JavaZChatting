package ch10;
import java.applet.*;
import java.awt.*;

public class Ex1001_ImageTest extends Applet
{
  Image myImage;

  public void init()
  {
	//...getCodeBase() : ���� ���ø� Ŭ���� ������ ��ġ��ȯ.
	//...getDocumentBase() :  ���� �������� html ������ ���ϵ� ��ġ��ȯ.
    myImage= getImage(getCodeBase(), "./images/ch10/iu.jpg");
  }

  public void paint(Graphics g)
  {
    g.drawImage(myImage, 0, 0, this);
  }
}