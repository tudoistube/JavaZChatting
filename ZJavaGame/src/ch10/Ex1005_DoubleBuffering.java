package ch10;
import java.applet.Applet;
import java.awt.*;

public class Ex1005_DoubleBuffering extends Applet
  implements Runnable
{
  int imageTotal;
  int index;
  int x, y;

  Image javacup[];
  Thread clock;
  MediaTracker myTracker;

  Image off;
  Graphics offG;

  public void init()
  {
	//...더블버퍼링.
	//...가상화면에서 이미지의 삭제와 출력작업을 하고,
	//...실제 화면에는 한 번만 출력하는 방식임.
    //...1.1.가상화면과 그래픽 컨텍스트를 생성함.
    off= createImage(400, 400);
    offG= off.getGraphics();

    imageTotal= 16;

    myTracker= new MediaTracker(this);

    javacup= new Image[imageTotal];

    for(int i=0; i<imageTotal; i++){
     javacup[i]= getImage(getCodeBase(), "./images/ch10/javacup"+i+".gif");
     myTracker.addImage(javacup[i], 0);
    }

    try{
      myTracker.waitForAll();
    }catch(InterruptedException ie){}

    while((myTracker.statusAll(true) & MediaTracker.COMPLETE)==0){}

    x= y= 0;
  }

  public void start()
  {
    if(clock==null){
      clock= new Thread(this);
      clock.start();
    }
  }

  public void paint(Graphics g)
  {
	//...1.3.가상화면을 실제 화면으로 옮김.
    g.drawImage(off, 0, 0, 400, 400, this);
  }

  public void update(Graphics g)
  {
    paint(g);
  }

  public void run()
  {
    while(true){
      try{
        clock.sleep(50);
      }catch(InterruptedException ie){}

      if(x<400){
        x++;
        y++;
      }else{
        x= y= 0;
      }

      if(index<imageTotal-1){
        index++;
      }else{
        index= 0;
      }

      //...1.2.이미지를 가상화면에 출력함.
      Color bgColor= getBackground();
      offG.setColor(bgColor);
      offG.fillRect(x-1, y-1, 59, 90);
      offG.drawImage(javacup[index], x, y, 59, 90, this);

      repaint();
    }
  }

  public void stop()
  {
    if((clock!=null)&&(clock.isAlive())){
      clock= null;
    }
  }
}

