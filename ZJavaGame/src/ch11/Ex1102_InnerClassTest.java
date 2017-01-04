package ch11;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
 * /JavaGame/src/ch09/Ex0916_MouseTest.java 와 비교할 것.
 * /JavaGame/src/ch11/Ex1102_AdapterTest.java 와 비교할 것.
 */

public class Ex1102_InnerClassTest extends Applet
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

    //...this가 아닌 innerClass를 대입했다.
    addMouseListener(new MyMouseHandler());
  }

  public void paint(Graphics g)
  {
    g.setColor(Color.blue);

    for(int i=0; i<num; i++){
      g.fillOval(x[i]-20, y[i]-20, 40, 40);
    }  
  }

  //...리스너 인터페이스를 구현하여 해당 메서드를
  //...모두 구현했다.
  class MyMouseHandler implements MouseListener
  {
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
}