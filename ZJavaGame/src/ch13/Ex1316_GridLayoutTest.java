package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1316_GridLayoutTest extends JFrame
{
  public Ex1316_GridLayoutTest()
  {
    setLayout(new GridLayout(0, 5)); // 그리드 레이아웃으로 지정

    for(int i=1; i<=15; i++){
      add(new JButton("버튼-"+ i));  // 15개의 버튼을 추가
    }

    setSize(640, 480);
	setLocation(100,100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args)
  {
    new Ex1316_GridLayoutTest();
  }
}
