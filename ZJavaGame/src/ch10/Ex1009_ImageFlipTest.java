package ch10;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1009_ImageFlipTest extends Applet
  implements ItemListener
{
  Choice myChoice;
  Image  myImage;

  int flipSelect;

  public void init()
  {
    myImage= getImage(getCodeBase(), "./images/ch10/angel.jpg");

    myChoice= new Choice();
    myChoice.addItem("원본 이미지");
    myChoice.addItem("좌우 뒤집기");
    myChoice.addItem("상하 뒤집기");
    myChoice.addItem("180도 회전");
    myChoice.addItemListener(this);
    myChoice.select(0);
    add(myChoice);

    flipSelect= 0;
    setBackground(Color.black);
  }

  public void paint(Graphics g)
  {
    switch(flipSelect){
      case 0: 
        g.drawImage(myImage, 0, 40, myImage.getWidth(this), myImage.getHeight(this), 
                             0, 0, myImage.getWidth(this), myImage.getHeight(this), this);
        break;

      case 1: 
        g.drawImage(myImage, myImage.getWidth(this), 40, 0, myImage.getHeight(this), 
                             0, 0, myImage.getWidth(this), myImage.getHeight(this), this);
        break;

      case 2: 
        g.drawImage(myImage, 0, myImage.getHeight(this), myImage.getWidth(this), 40, 
                             0, 0, myImage.getWidth(this), myImage.getHeight(this), this);
        break;

      case 3: 
        g.drawImage(myImage, myImage.getWidth(this), myImage.getHeight(this), 0, 40, 
                             0, 0, myImage.getWidth(this), myImage.getHeight(this), this);
        break;
    }
  }

  public void itemStateChanged(ItemEvent e)
  {
    if(e.getSource()==myChoice){
      flipSelect= myChoice.getSelectedIndex();
      repaint();
    }
  }
}