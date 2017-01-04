package ch10;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1008_ImageScalingTest extends Applet
  implements ItemListener
{
  Choice myChoice;
  Image  myImage;

  int scaleRate;

  public void init()
  {
    myImage= getImage(getCodeBase(), "./images/ch10/angel.jpg");

    myChoice= new Choice();
    myChoice.addItem("50%");
    myChoice.addItem("100%");
    myChoice.addItem("200%");
    myChoice.addItemListener(this);
    myChoice.select(1);
    add(myChoice);

    scaleRate= 1;
    setBackground(Color.black);
  }

  public void paint(Graphics g)
  {
    switch(scaleRate){
      case 0: 
        g.drawImage(myImage, 0, 40, myImage.getWidth(this)/2, myImage.getHeight(this)/2, 
                             0, 0, myImage.getWidth(this), myImage.getHeight(this), this);
        break;

      case 1: 
        g.drawImage(myImage, 0, 40, myImage.getWidth(this), myImage.getHeight(this), 
                             0, 0, myImage.getWidth(this), myImage.getHeight(this), this);
        break;

      case 2: 
        g.drawImage(myImage, 0, 40, myImage.getWidth(this)*2, myImage.getHeight(this)*2, 
                             0, 0, myImage.getWidth(this), myImage.getHeight(this), this);
        break;
    }
  }

  public void itemStateChanged(ItemEvent e)
  {
    if(e.getSource()==myChoice){
      scaleRate= myChoice.getSelectedIndex();
      repaint();
    }
  }
}