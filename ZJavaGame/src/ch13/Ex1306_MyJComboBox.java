package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1306_MyJComboBox extends JApplet
  implements ItemListener
{
  JLabel myJLabel;
  JComboBox myJComboBox;

  public void init()
  {
	Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJComboBox= new JComboBox();      // 초이스 생성
    myJComboBox.addItem("유비");    // 항목 추가
    myJComboBox.addItem("관우");
    myJComboBox.addItem("장비");
    myJComboBox.addItemListener(this);
    c.add(myJComboBox);

    myJLabel= new JLabel();
    myJLabel.setText("항목을 선택해주세요!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void itemStateChanged(ItemEvent e)
  {
    if(e.getSource()==myJComboBox){
      myJLabel.setText(myJComboBox.getSelectedItem()+"를 선택했습니다.");
    }
  }
}
