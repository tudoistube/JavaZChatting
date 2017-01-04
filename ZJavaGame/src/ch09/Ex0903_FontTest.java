package ch09;
import java.awt.*;
import java.applet.*;

public class Ex0903_FontTest extends Applet
{
  Font myFont1, myFont2, myFont3;

  public void init()
  {
    myFont1= new Font("Serif", Font.BOLD + Font.ITALIC, 12);
    myFont2= new Font("SansSerif", Font.ITALIC, 16);
    myFont3= new Font("Monospaced", Font.BOLD, 20);
  }

  public void paint(Graphics g)
  {
    g.setColor(Color.red);
    g.setFont(myFont1);
    g.drawString("Serif, Bold and Italic, 12 points", 10, 20);

    g.setColor(Color.blue);
    g.setFont(myFont2);
    g.drawString("SansSerif, Italic, 16 points", 10, 50);

    g.setColor(Color.black);
    g.setFont(myFont3);
    g.drawString("Monospaced, Bold, 20 points", 10, 80);
  }
}