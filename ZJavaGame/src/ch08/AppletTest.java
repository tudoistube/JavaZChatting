package ch08;

import java.awt.*;
import java.applet.*;

public class AppletTest extends Applet
{
  public void paint(Graphics g)
  {
    g.drawString("처음 만들어 본 자바 애플릿", 50, 100);
  }
}