package ch11;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
 * /JavaGame/src/ch11/Ex1102_InnerClassTest.java�� ���� ��.
 * /JavaGame/src/ch09/Ex0916_MouseTest.java �� ���� ��.
 */
public class Ex1102_AdapterTest extends Applet
{
  Label myLabel;  
  int[] x, y; 
  int num;

  public void init()
  {
    setLayout(new BorderLayout());
    myLabel=  new Label("���콺�� Ŭ���ϸ� ���� �׸��ϴ�.");
    myLabel.setAlignment(Label.CENTER);
    add("North", myLabel);

    x= new int[100];
    y= new int[100];
    num= 0;

    //...this�� �ƴ� innerClass�� �����ߴ�.
    addMouseListener(new MyMouseHandler());
  }

  public void paint(Graphics g)
  {
    g.setColor(Color.CYAN);

    for(int i=0; i<num; i++){
      g.fillOval(x[i]-20, y[i]-20, 40, 40);
    }  
  }

  //...����͸� ��ӹ޾� �ʿ��� �޼��常 �������̵��ߴ�.
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