package ch09;
import java.awt.*;
import java.applet.*;

public class Ex0901_LifeCycleTest extends Applet
{
  TextArea myTextArea;

  public void init()
  {
    setLayout(null);

    myTextArea= new TextArea(20,20);
    myTextArea.setBounds(10, 30, 380, 200);
    add(myTextArea);

    myTextArea.append("�ʱ�ȭ ��ƾ: init()\n");
  }

  public void start()
  {
    myTextArea.append("���� ��ƾ: start()\n");
  }

  public void stop()
  {
    myTextArea.append("���� ��ƾ: stop()\n");
  }

  public void destroy()
  {
    myTextArea.append("�Ҹ� ��ƾ: destroy()\n");
  }

  public void paint(Graphics g)
  {
    myTextArea.append("������ ��ƾ: paint()\n");

    g.drawString("���ø��� ������ ����Ŭ", 10, 20);
  }
}