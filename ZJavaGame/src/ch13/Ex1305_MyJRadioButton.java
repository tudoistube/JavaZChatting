package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1305_MyJRadioButton extends JApplet
  implements ItemListener
{
  JLabel myJLabel;
  JRadioButton myJRadioButton1, myJRadioButton2, myJRadioButton3;
  ButtonGroup group; // 함께 동작될 라디오버튼들의 그룹

  public void init()
  {
	Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJRadioButton1= new JRadioButton("유비", false); 
    myJRadioButton1.addItemListener(this);
    c.add(myJRadioButton1);

    myJRadioButton2= new JRadioButton("관우", false); // 
    myJRadioButton2.addItemListener(this);
    c.add(myJRadioButton2);

    myJRadioButton3= new JRadioButton("장비", true);
    myJRadioButton3.addItemListener(this);
    c.add(myJRadioButton3);

    group= new ButtonGroup();
    group.add(myJRadioButton1);
    group.add(myJRadioButton2);
    group.add(myJRadioButton3);

	myJLabel= new JLabel();
    myJLabel.setText("체크박스를 선택해주세요!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void itemStateChanged(ItemEvent e)
  {
    if(e.getSource()==myJRadioButton1){
      myJLabel.setText("유비를 선택했습니다.");
      System.out.println(myJLabel.getText());
    }else if(e.getSource()==myJRadioButton2){
      myJLabel.setText("관우를 선택했습니다.");
    }else if(e.getSource()==myJRadioButton3){
      myJLabel.setText("장비를 선택했습니다.");
    }
  }
}