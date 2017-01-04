package ch09;
import java.awt.*;
import java.applet.Applet;
import java.util.Calendar;

public class Ex0914_RunnableTest extends Applet
  implements Runnable
{
  Thread clock;
  Font myFont;

  public void init()
  {
    myFont= new Font("Serif", Font.BOLD, 40);
    setBackground(Color.green);
  }

  public void start()
  {
    if(clock==null){
      //...Runnable�������̽��� ������ ���, ThreadŬ���� ��ü�� ������
      //...�ϼ��� Ŭ������ ������ ThreadŬ������ �����ڿ��� �μ��� ������.
      //...������ Thread��ü�� start()�޼��带 ȣ����.
      clock= new Thread(this);
      clock.start();
    }
  }

  public void paint(Graphics g)
  {
    Calendar now= Calendar.getInstance();

    int year = now.get(Calendar.YEAR);
    int month= now.get(Calendar.MONTH);
    int date = now.get(Calendar.DATE);
    int hour = now.get(Calendar.HOUR);
    int min  = now.get(Calendar.MINUTE);
    int sec  = now.get(Calendar.SECOND);

    g.setFont(myFont);
    g.drawString(year+"-"+month+"-"+date+" "+hour +":"+min+":"+sec, 10, 40);
  }

  public void stop()
  {
    if((clock!=null)&&(clock.isAlive())){
      clock= null;
    }
  }

  public void run()
  {
    while(true){
      try{
        clock.sleep(1000);
      }catch(InterruptedException ie){}

      repaint();
    }
  }
}