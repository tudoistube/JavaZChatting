package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1312_MyJSlider extends JApplet
  implements ChangeListener
{
  JLabel myJLabel;
  JSlider myJSlider;

  public void init()
  {
    Container c= this.getContentPane();
    c.setLayout(new BorderLayout()); // 보더 레이아웃으로 지정

    myJSlider= new JSlider(JSlider.HORIZONTAL, 1, 100, 50); // 슬라이더 생성
    myJSlider.addChangeListener(this);
    c.add("North", myJSlider); // 슬라이더를 추가

    myJLabel= new JLabel();
    myJLabel.setText("슬라이더를 조정하세요!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add("Center", myJLabel); // 레이블을 추가
  }

  public void stateChanged(ChangeEvent e)
  {
    if(e.getSource()==myJSlider){
      myJLabel.setText("위치: "+ myJSlider.getValue());
    }
  }
}