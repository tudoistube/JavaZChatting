package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1313_CloseableFrameTest extends Ex1313_CloseableFrame
{
  public Ex1313_CloseableFrameTest()
  {
	  super("Hello, Swing");
	  setSize(800, 600);
	  setLocation(100,100);
	  setVisible(true);
  }

  public static void main(String[] args)
  {
	  new Ex1313_CloseableFrameTest();
  }
}
