package ch10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Ex1006_SpriteTest extends Applet
  implements Runnable, MouseMotionListener
{
  Thread clock; // ���صǴ� �ð�

  Image off; // �޸� ���� ����ȭ��
  Graphics offG;

  Image bgImage; // ��� �̹���
  Image ufo, ufo2; // ufo �̹���
  int x, y, x2, y2; // ufo�� x,y��ǥ

  int mouseX, mouseY; // ���콺 Ŀ���� ��ġ

  public void init()
  {
    // �޸� �� ����ȭ�� �����
    off= createImage(500, 500);
    offG= off.getGraphics();

    // �̹��� �ε�
    MediaTracker myTracker= new MediaTracker(this);

    bgImage= getImage(getCodeBase(), "./images/ch10/map.gif");
    myTracker.addImage(bgImage,0);
    ufo= getImage(getCodeBase(), "./images/ch10/ufo.gif");
    myTracker.addImage(ufo,0);
    
    ufo2= getImage(getCodeBase(), "./images/ch10/ufo.gif");
    myTracker.addImage(ufo2,0);    

    try{ 
      myTracker.waitForAll(); 
    }catch(InterruptedException ie){}

    while((myTracker.statusAll(true) & MediaTracker.COMPLETE)==0){}

    x=100; y=100; // ufo�� ������ġ
    x2=x+10; y2=y+10; // ufo�� ������ġ    
    mouseX=100; mouseY=100; // ���콺 Ŀ�� �ʱⰪ

    addMouseMotionListener(this); // ���콺 ����� ����
  }

  public void start()
  {
    if(clock==null){
      clock= new Thread(this);
      clock.start();  // �ð� ����
    }
  }

  public void paint(Graphics g)
  {
    // ����ȭ���� ����ȭ�鿡 ���
    g.drawImage(off, 0, 0, this); 
  }

  public void update(Graphics g)
  {
    paint(g);
  }

  public void run()
  {
    while(true)
    {
      try{
        clock.sleep(50);
      }catch(InterruptedException ie){}

      // ufo�� ��ġ ���� (���콺 Ŀ�� ��������)
      if(x<mouseX){
        x++;
        x2++;
      }else if(x>mouseX){
        x--;
        x2--;
      }

      if(y<mouseY){
        y++;
        y2++;
      }else if(y>mouseY){
        y--;
        y2--;
      }

      offG.setColor(Color.white);
      offG.fillRect(0,0,500,500);
      offG.drawImage(bgImage, 0, 0, this);
      offG.drawImage(ufo, x, y, this); // ����ȭ�鿡 ���
      offG.drawImage(ufo2, x2, y2, this); // ����ȭ�鿡 ���      

      repaint(); // paint() ȣ��
    }
  }

  public void stop()
  {
    if((clock!=null)&&(clock.isAlive())){
      clock=null; // �ð� ����(����)
    }
  }

  public void destroy()
  {
    // ���� ��ƾ
  }

  // ���콺 ��� ó�� ��ƾ
  public void mouseMoved(MouseEvent e)
  {
    // ���콺�� �����϶�
    mouseX= e.getX(); // ���콺 Ŀ���� x ��ǥ
    mouseY= e.getY(); // ���콺 Ŀ���� y ��ǥ
    repaint(); // ȭ�� ���� �׸���
  }
  public void mouseDragged(MouseEvent e)
  {
    // ���콺�� �巡���Ҷ�(��ư�� ������ �����϶�)
  }
}