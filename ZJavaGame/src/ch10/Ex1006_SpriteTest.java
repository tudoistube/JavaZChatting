package ch10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Ex1006_SpriteTest extends Applet
  implements Runnable, MouseMotionListener
{
  Thread clock; // 기준되는 시계

  Image off; // 메모리 상의 가상화면
  Graphics offG;

  Image bgImage; // 배경 이미지
  Image ufo, ufo2; // ufo 이미지
  int x, y, x2, y2; // ufo의 x,y좌표

  int mouseX, mouseY; // 마우스 커서의 위치

  public void init()
  {
    // 메모리 상에 가상화면 만들기
    off= createImage(500, 500);
    offG= off.getGraphics();

    // 이미지 로드
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

    x=100; y=100; // ufo의 시작위치
    x2=x+10; y2=y+10; // ufo의 시작위치    
    mouseX=100; mouseY=100; // 마우스 커서 초기값

    addMouseMotionListener(this); // 마우스 사용을 선언
  }

  public void start()
  {
    if(clock==null){
      clock= new Thread(this);
      clock.start();  // 시계 시작
    }
  }

  public void paint(Graphics g)
  {
    // 가상화면을 실제화면에 출력
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

      // ufo의 위치 조정 (마우스 커서 방향으로)
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
      offG.drawImage(ufo, x, y, this); // 가상화면에 출력
      offG.drawImage(ufo2, x2, y2, this); // 가상화면에 출력      

      repaint(); // paint() 호출
    }
  }

  public void stop()
  {
    if((clock!=null)&&(clock.isAlive())){
      clock=null; // 시계 정지(없앰)
    }
  }

  public void destroy()
  {
    // 종료 루틴
  }

  // 마우스 모션 처리 루틴
  public void mouseMoved(MouseEvent e)
  {
    // 마우스를 움직일때
    mouseX= e.getX(); // 마우스 커서의 x 좌표
    mouseY= e.getY(); // 마우스 커서의 y 좌표
    repaint(); // 화면 새로 그리기
  }
  public void mouseDragged(MouseEvent e)
  {
    // 마우스를 드래그할때(버튼을 누르고 움직일때)
  }
}