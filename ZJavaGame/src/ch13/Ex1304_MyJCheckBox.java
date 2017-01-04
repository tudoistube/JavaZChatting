package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1304_MyJCheckBox extends JApplet
  implements ItemListener
{
  JLabel myJLabel;
  JCheckBox myJCheckBox1, myJCheckBox2, myJCheckBox3;

  public void init()
  {
	Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJCheckBox1= new JCheckBox();
    myJCheckBox1.setText("유비");
    myJCheckBox1.addItemListener(this);
    c.add(myJCheckBox1);

    myJCheckBox2= new JCheckBox("관우");
    myJCheckBox2.addItemListener(this);
    c.add(myJCheckBox2);

    myJCheckBox3= new JCheckBox("장비", true);
    myJCheckBox3.addItemListener(this);
    c.add(myJCheckBox3);

    myJLabel= new JLabel();
    myJLabel.setText("체크박스를 선택해주세요!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void itemStateChanged(ItemEvent e)
  {
    if(e.getSource()==myJCheckBox1){ // 어느 체크박스를 선택했는지 getSource() 메소드로 조사
      myJLabel.setText("유비를 선택했습니다.");
      System.out.println(myJLabel.isFocusOwner());
    }else if(e.getSource()!=myJCheckBox1){ // 어느 체크박스를 선택했는지 getSource() 메소드로 조사
          myJLabel.setText("유비 선택을 해제했습니다.");
    }else if(e.getSource()==myJCheckBox2){
      myJLabel.setText("관우를 선택했습니다.");
    }else if(e.getSource()==myJCheckBox3){
      myJLabel.setText("장비를 선택했습니다.");
    }
  }
}