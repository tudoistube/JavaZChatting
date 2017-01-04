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

    //...this : 인터페이스 리스너 사용.
    //...new myClass : 어댑터를 상속한 내부클래스 사용.
    addKeyListener(this);
  }

  public void paint(Graphics g)
  {
    g.setColor(Color.black);
    g.drawString("아무 키나 누르세요.", 20, 20);
    g.setColor(Color.red);
    g.drawString(str, 20, 40);
  }

  public void keyPressed(KeyEvent e)
  {
	//...KeyEvent클래스 메서드.
	//...char getKeyChar(), int getKeyCode(), String getKeyText(int)
	//...boolean isAltDown(), boolean isControlDown(), boolean isShiftDown()
    str= e.getKeyText(e.getKeyCode());
    //...상태줄에 출력함.
    showStatus("눌러진 키: "+ str);
    repaint();
  }

  public void keyReleased(KeyEvent e)
  {
    str= e.getKeyText(e.getKeyCode());
    showStatus("놓은 키: "+ str);
    repaint();
  }

  public void keyTyped(KeyEvent e)
  {
    str= e.getKeyText(e.getKeyCode());
    showStatus("타이핑한 키: "+ str);
    repaint();
  }
}