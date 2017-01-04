package ch13;
import javax.swing.*;  // 스윙 패키지 선언
import javax.swing.event.*;
import java.awt.event.*;  // WindowEvent 클래스 사용을 위한 awt 패키지 선언

public class Ex1313_CloseableFrame extends JFrame   // 스윙의 JFrame 상속
  implements WindowListener
{
  public Ex1313_CloseableFrame(){ this.addWindowListener(this); }
  public Ex1313_CloseableFrame(String title)
  {
    super(title);
    //...WindowListener를 사용해서 닫기 버튼을 누를때 호출되는
    //...windowClosing()메서드 내에서 직접 dispose()시킨다.
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
