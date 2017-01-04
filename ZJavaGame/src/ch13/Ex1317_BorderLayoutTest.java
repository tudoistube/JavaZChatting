package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1317_BorderLayoutTest extends JFrame
{
  String[] area= {"East","West","South","North","Center"}; // 보더 레이아웃의 구역

  public Ex1317_BorderLayoutTest()
  {
    setLayout(new BorderLayout(20, 50));   // 수평, 수직 간격을 각각 1, 2씩 갖는 보더 레이아웃으로 지정

    for(int i=0; i<5; i++){
      add(area[i], new JButton(area[i])); // 5개의 버튼을 각 구역에 추가
    }

    setSize(640, 480);
	setLocation(100,100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args)
  {
    new Ex1317_BorderLayoutTest();
  }
}
