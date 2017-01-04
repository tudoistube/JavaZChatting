package ch10;
import java.applet.*;
import java.awt.*;

public class Ex1001_ImageTest extends Applet
{
  Image myImage;

  public void init()
  {
	//...getCodeBase() : 현재 애플릿 클래스 파일의 위치반환.
	//...getDocumentBase() :  현재 웹페이지 html 파일이 수록된 위치반환.
    myImage= getImage(getCodeBase(), "./images/ch10/iu.jpg");
  }

  public void paint(Graphics g)
  {
    g.drawImage(myImage, 0, 0, this);
  }
}