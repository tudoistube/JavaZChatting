package ch10;
import java.applet.Applet;
import java.awt.*;

public class Ex1004_Update extends Applet
  implements Runnable
{
  int imageTotal;
  int index;
  int x, y;

  Image javacup[];
  Thread clock;
  MediaTracker myTracker;

  public void init()
  {
    imageTotal= 16;
    
    setBackground(Color.cyan);

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
    g.drawImage(javacup[index], x, y, 59, 90, this);
  }

  //...update() 화면을 지워줌.
  //...update() 메서드를 오버라이딩해서 화면을 지우지 못하도록 함.
  //...꼭 지워야 할 부분만 지움.
  public void update(Graphics g)
  {
    Color bgColor= getBackground();
    g.setColor(bgColor);
    g.fillRect(x-1, y-1, 59, 90);

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

