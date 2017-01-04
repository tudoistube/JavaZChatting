package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1313_JFrameTest extends JFrame
{
  public Ex1313_JFrameTest()
  {
	  super("Hello, Swing");
	  setSize(640, 480);
	  setLocation(100,100);
	  setVisible(true);
  }

  public static void main(String[] args)
  {
	  new Ex1313_JFrameTest();
  }
}
