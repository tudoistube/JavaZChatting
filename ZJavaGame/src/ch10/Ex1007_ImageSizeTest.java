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

    // �̹��� ũ�� ���
    //...Image.getWidth(observer); this or null �� ������.
    g.drawString("���� ũ��: "+ myImage.getWidth(this), 10, 220);
    g.drawString("���� ũ��: "+ myImage.getHeight(this), 10, 240);
  }
}