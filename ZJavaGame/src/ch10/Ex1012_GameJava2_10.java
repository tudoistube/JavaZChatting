package ch10;
import java.applet.*; 
import java.awt.*; 
import java.awt.event.*;
import java.util.*;

public class Ex1012_GameJava2_10 extends Applet 
 implements Runnable, ActionListener
{ 
  Thread clock;

  Image off; // 메모리 상의 가상화면
  Graphics offG;

  Image slot;
  Image machine;

  Random r;

  int[] loc;   // 슬롯 위치
  int[] speed; // 슬롯 속도
  int[] hit;   // 정지될 번호판
  int slotNum;
  boolean[] stopSlot;
  boolean[] moveSlot;

  Button startButton, stopButton;
  Panel buttonPanel;

  public void init()
  {
    // 메모리 상에 가상화면 만들기
    off= createImage(192, 192);
    offG= off.getGraphics();
    offG.setColor(Color.white);
    offG.fillRect(0,0,192,192);

    // 이미지 로드
    MediaTracker tracker= new MediaTracker(this);
    slot= getImage(getCodeBase(), "./images/ch10/slot.gif");
    tracker.addImage(slot,0);
    machine= getImage(getCodeBase(), "./images/ch10/machine.gif");
    tracker.addImage(machine,0);
    try{ 
      tracker.waitForAll(); 
    }catch(InterruptedException ie){}

    while((tracker.statusAll(true) & MediaTracker.COMPLETE)==0){}

    // GUI
    setLayout(new BorderLayout());
    buttonPanel= new Panel();
    startButton= new Button("START");
    startButton.addActionListener(this);
    buttonPanel.add(startButton);
    stopButton= new Button("STOP");
    stopButton.addActionListener(this);
    buttonPanel.add(stopButton);
    add("South", buttonPanel);

    loc= new int[3];
    speed= new int[3];
    hit= new int[3];
    stopSlot= new boolean[3];
    moveSlot= new boolean[3];

    r= new Random();

    for(int i=0;i<3;i++){
      loc[i]= Math.abs(r.nextInt() % 7)* 64;
      speed[i]=  Math.abs(r.nextInt() % 7) * 8 + 8;
      stopSlot[i]= true;
      moveSlot[i]= false;
    }

    slotNum= 0;
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
        clock.sleep(30);
      }catch(InterruptedException ie){}


      offG.setColor(Color.white);
      offG.fillRect(0,0,192,192);

      drawSlot();

      offG.drawImage(machine, 0, 0, this);
      

      repaint(); // paint() 호출
    }
  }

  public void drawSlot()
  {
    for(int i=0; i<3; i++){
      if(moveSlot[i]){
        if(loc[i]<432){
          loc[i]+= speed[i];
        }else{
          loc[i]= 0;
        }
      }
      if(stopSlot[i]){
        if((loc[i]/64)==hit[i]){
          loc[i]= loc[i]/64*64;
          moveSlot[i]= false;
        }
      }

      if(loc[i]<320){
        offG.drawImage(slot, i*64, 0-loc[i], this);
      }else{
        offG.drawImage(slot, i*64, 0-loc[i], this);
        offG.drawImage(slot, i*64, 448-loc[i], this);
      }
    }
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==startButton){
      stopSlot[0]= stopSlot[1]= stopSlot[2]= false;
      moveSlot[0]= moveSlot[1]= moveSlot[2]= true;
      slotNum= 0;
    }else if(e.getSource()==stopButton){
      hit[slotNum]= Math.abs(r.nextInt() % 7);
      stopSlot[slotNum]= true;

      if(slotNum<2){
        slotNum++;
      }else{
        slotNum= 0;
      }
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
} 
