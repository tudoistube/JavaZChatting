package ch10;
import java.applet.*;
import java.awt.*;

public class Ex1007_ImageSizeTest extends Applet
{
  Image myImage;

  public void init()
  {
    myImage= getImage(getCodeBase(), "./images/ch10/angel.jpg");
  }

  public void paint(Graphics g)
  {
    g.drawImage(myImage, 0, 0, this);

    // 이미지 크기 출력
    //...Image.getWidth(observer); this or null 을 대입함.
    g.drawString("가로 크기: "+ myImage.getWidth(this), 10, 220);
    g.drawString("세로 크기: "+ myImage.getHeight(this), 10, 240);
  }
}