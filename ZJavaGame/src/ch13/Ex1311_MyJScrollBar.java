package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1311_MyJScrollBar extends JApplet
  implements AdjustmentListener
{
  JLabel myJLabel;
  JScrollBar myJScrollBar;

  public void init()
  {
    Container c= this.getContentPane();
    c.setLayout(new BorderLayout()); // 보더 레이아웃으로 지정

    //...스크롤바 생성 : 방향, 초기값, 버블크기, 최소, 최대값
    myJScrollBar= new JScrollBar(JScrollBar.HORIZONTAL, 50, 0, 1, 100);
    myJScrollBar.addAdjustmentListener(this);
    c.add("North", myJScrollBar); // 스크롤바를 추가

    myJLabel= new JLabel();
    myJLabel.setText("스크롤바를 조정하세요!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add("Center", myJLabel); // 레이블을 추가
  }

  public void adjustmentValueChanged(AdjustmentEvent e) // 버블을 움직일 때
  {
    if(e.getSource()==myJScrollBar){
      myJLabel.setText("위치: "+ myJScrollBar.getValue());
    }
  }
}