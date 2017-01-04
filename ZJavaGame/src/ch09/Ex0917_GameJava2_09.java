package ch09;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex0917_GameJava2_09 extends Applet
  implements Runnable, ActionListener, MouseListener
{
  static final int maxX= 40;
  static final int maxY= 20;
  boolean map[][];
  int mapState[][];
  int gen;
  boolean nextGen;

  Panel controlPanel;
  Label genLabel;
  Button startButton, stopButton;

  Thread clock;

  public void init()
  {
    map= new boolean[maxX][maxY];
    mapState= new int[maxX][maxY];
    gen= 1; // 1세대부터 시작
    nextGen= false;

    // 디폴트 상태
    for(int x=15; x<25; x++){
      for(int y=10; y<11; y++){
        map[x][y]= true;
      }
    }

    // GUI
    setLayout(new BorderLayout());    
    controlPanel= new Panel();
    controlPanel.setBackground(Color.blue);
    genLabel= new Label(gen + " 세대");
    genLabel.setAlignment(Label.CENTER);
    genLabel.setBackground(Color.yellow);
    controlPanel.add(genLabel);
    startButton= new Button("START");
    startButton.addActionListener(this);
    controlPanel.add(startButton);
    stopButton= new Button("STOP");
    stopButton.setEnabled(false);
    stopButton.addActionListener(this);
    controlPanel.add(stopButton);
    add("South", controlPanel);

    // 마우스 사용을 선언
    addMouseListener(this);
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
    for(int x=0; x<maxX; x++){
      for(int y=0; y<maxY; y++){
        if(map[x][y]){
          g.fillRect(x*10,y*10,10,10);
        }else{
          g.drawRect(x*10,y*10,10,10);
        }
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
  }

  // 쓰레드 처리 루틴
  public void run()
  {
    while(true){
      try{
        clock.sleep(1000);
      }catch(InterruptedException ie){}

      if(nextGen){
        makeNextGen();
        gen++;
        genLabel.setText(gen + " 세대");
        repaint(); // paint() 호출
      }
    }
  }

  public void makeNextGen()
  {
    // set mapState
    for(int x=0; x<maxX; x++){
      for(int y=0; y<maxY; y++){
        if(map[x][y]){
          mapState[x][y]= 100;
        }else{
          mapState[x][y]= 0;
        }
      }
    }


    // countLife
    for(int x=0; x<maxX; x++){
      for(int y=0; y<maxY; y++){
        countLife(x, y);
      }
    }

    // next Generation
    for(int x=0; x<maxX; x++){
      for(int y=0; y<maxY; y++){
        switch(mapState[x][y]){
          case   3:
          case 102:
          case 103:
            map[x][y]= true;
            break;

          default:
            map[x][y]= false;
            break;
        }
      }
    }
  }

  public void countLife(int x, int y)
  {
    for(int i=-1; i<=1; i++){
      for(int j=-1; j<=1; j++){
        if((i!=0)||(j!=0)){
          if((x+i>=0)&&(x+i<maxX)&&(y+j>=0)&&(y+j<maxY)){
            if(map[x+i][y+j]){
              mapState[x][y]++;
              System.out.println("("+x+","+y+"): "+(x+i)+","+(y+j)+" - "+ mapState[x][y]);
            }
          }
        }
      }
    }
  }

  // 버튼처리
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==startButton){
      nextGen= true;
      startButton.setEnabled(false);
      stopButton.setEnabled(true);
    }else if(e.getSource()==stopButton){
      nextGen= false;
      startButton.setEnabled(true);
      stopButton.setEnabled(false);
    }
  }

  // 마우스 처리 루틴
  public void mousePressed(MouseEvent e)
  {
    int mouseX= e.getX(); // 마우스 커서의 x 좌표
    int mouseY= e.getY(); // 마우스 커서의 y 좌표
    map[mouseX/10][mouseY/10]= !map[mouseX/10][mouseY/10];
    repaint();
  }

  public void mouseReleased(MouseEvent e)
  {
  }

  public void mouseClicked(MouseEvent e)
  {
  }

  public void mouseEntered(MouseEvent e)
  {
  }

  public void mouseExited(MouseEvent e)
  {
  }
}