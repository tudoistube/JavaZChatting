package ch09;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
 * /JavaGame/src/ch11/Ex1102_InnerClassTest.java 와 비교할 것.
 */

public class Ex0916_MouseTest extends Applet
  implements MouseListener
{
  Label myLabel;  
  int[] x, y; 
  int num;

  public void init()
  {
    setLayout(new BorderLayout());
    myLabel=  new Label("마우스로 클릭하면 원을 그립니다.");
    myLabel.setAlignment(Label.CENTER);
    add("North", myLabel);

    x= new int[100];
    y= new int[100];
    num= 0;

    addMouseListener(this);
  }

  public void paint(Graphics g)
  {
    g.setColor(Color.green);

    for(int i=0; i<num; i++){
      g.fillOval(x[i]-20, y[i]-20, 40, 40);
    }  
  }

  public void mousePressed(MouseEvent e)
  {
  }

  public void mouseReleased(MouseEvent e)
  {
  }

  public void mouseClicked(MouseEvent e)
  {
    if(num<100){
      x[num]= e.getX();
      y[num]= e.getY();
      num++;
    }
    repaint();
  }

  public void mouseEntered(MouseEvent e)
  {
  }

  public void mouseExited(MouseEvent e)
  {
  }
}