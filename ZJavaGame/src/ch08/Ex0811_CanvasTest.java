package ch08;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0811_CanvasTest extends Applet
{
	Ex0811_Canvas myCanvas;

  public void init()
  {
    myCanvas= new Ex0811_Canvas();
    add(myCanvas);
  }
}