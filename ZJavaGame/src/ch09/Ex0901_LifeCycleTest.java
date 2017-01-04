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

    myTextArea.append("초기화 루틴: init()\n");
  }

  public void start()
  {
    myTextArea.append("시작 루틴: start()\n");
  }

  public void stop()
  {
    myTextArea.append("정지 루틴: stop()\n");
  }

  public void destroy()
  {
    myTextArea.append("소멸 루틴: destroy()\n");
  }

  public void paint(Graphics g)
  {
    myTextArea.append("페인팅 루틴: paint()\n");

    g.drawString("애플릿의 라이프 사이클", 10, 20);
  }
}