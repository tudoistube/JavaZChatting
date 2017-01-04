package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1313_CloseableFrameTest2 extends JFrame
{
  public Ex1313_CloseableFrameTest2()
  {
	  super("Hello, Swing");
	  setSize(800, 600);
	  setLocation(100,100);
	  setVisible(true);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  //setDefaultCloseOperation(HIDE_ON_CLOSE);
  }

  public static void main(String[] args)
  {
	  new Ex1313_CloseableFrameTest2();
  }
}
