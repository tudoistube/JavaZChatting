package ch13;
import javax.swing.*;  // ���� ��Ű�� ����
import javax.swing.event.*;
import java.awt.event.*;  // WindowEvent Ŭ���� ����� ���� awt ��Ű�� ����

public class Ex1322_CloseableFrame extends JFrame   // ������ JFrame ���
  implements WindowListener
{
  public Ex1322_CloseableFrame(){ this.addWindowListener(this); }
  public Ex1322_CloseableFrame(String title)
  {
    super(title);
    this.addWindowListener(this);
  }
  
  // the methods of the WindowListener object
  public void windowClosing(WindowEvent e){ this.dispose(); }
  public void windowOpened(WindowEvent e){}
  public void windowClosed(WindowEvent e){}
  public void windowIconified(WindowEvent e){}
  public void windowDeiconified(WindowEvent e){}
  public void windowActivated(WindowEvent e){}
  public void windowDeactivated(WindowEvent e){}  
}
