package ch11;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1103_KeyTest extends Applet
  implements KeyListener
{
  String str= "";

  public void init()
  {
    this.requestFocus();

    //...this : �������̽� ������ ���.
    //...new myClass : ����͸� ����� ����Ŭ���� ���.
    addKeyListener(this);
  }

  public void paint(Graphics g)
  {
    g.setColor(Color.black);
    g.drawString("�ƹ� Ű�� ��������.", 20, 20);
    g.setColor(Color.red);
    g.drawString(str, 20, 40);
  }

  public void keyPressed(KeyEvent e)
  {
	//...KeyEventŬ���� �޼���.
	//...char getKeyChar(), int getKeyCode(), String getKeyText(int)
	//...boolean isAltDown(), boolean isControlDown(), boolean isShiftDown()
    str= e.getKeyText(e.getKeyCode());
    //...�����ٿ� �����.
    showStatus("������ Ű: "+ str);
    repaint();
  }

  public void keyReleased(KeyEvent e)
  {
    str= e.getKeyText(e.getKeyCode());
    showStatus("���� Ű: "+ str);
    repaint();
  }

  public void keyTyped(KeyEvent e)
  {
    str= e.getKeyText(e.getKeyCode());
    showStatus("Ÿ������ Ű: "+ str);
    repaint();
  }
}