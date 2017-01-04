package ch10;
import java.applet.*;
import java.awt.*;

public class Ex1010_ImageClipingTest extends Applet
{
  Image myImage;

  public void init()
  {
    myImage= getImage(getCodeBase(), "./images/ch10/angel.jpg");
  }

  public void paint(Graphics g)
  {
	//...myImage객체중 (0, 50)부터 (300, 150)까지의 좌표에 속하는
	//...영역을 출력함.
    //g.drawImage(myImage, 0, 10, 300, 110, 
    //                     0, 50, 300, 150, this);
    g.drawImage(myImage, 0, 10, myImage.getWidth(this), myImage.getHeight(this), 
            0, 50, 300, 150, this);
  }
}