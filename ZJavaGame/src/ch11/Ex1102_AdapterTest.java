package ch11;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
 * /JavaGame/src/ch11/Ex1102_InnerClassTest.java와 비교할 것.
 * /JavaGame/src/ch09/Ex0916_MouseTest.java 와 비교할 것.
 */
public class Ex1102_AdapterTest extends Applet
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
    g.setColor(Color.CYAN);

    for(int i=0; i<num; i++){
      g.fillOval(x[i]-20, y[i]-20, 40, 40);
    }  
  }

  //...어댑터를 상속받아 필요한 메서드만 오버라이딩했다.
  class MyMouseHandler extends MouseAdapter
  {
    public void mouseClicked(MouseEvent e)
    {
      if(num<100){
        x[num]= e.getX();
        y[num]= e.getY();
        num++;
      }
      repaint();
    }
  }
}