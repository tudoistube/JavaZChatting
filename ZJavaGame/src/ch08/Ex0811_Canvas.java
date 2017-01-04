package ch08;
import java.awt.*;

public class Ex0811_Canvas extends Canvas
{
  public Ex0811_Canvas()
  {
    setBackground(Color.green);
    setSize(100,100);
  }

  public void paint(Graphics g)
  {
    g.drawString("³» Äµ¹ö½º", 10, 20);
    g.drawOval(40, 40, 50, 50);
    g.drawLine(30, 30, 60, 60);
    g.drawRect(0, 0, 99, 99);
  }
}