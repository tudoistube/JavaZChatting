package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1302_MyJButton extends JApplet
  implements ActionListener
{
  JLabel myJLabel;
  JButton myJButton1, myJButton2, myJButton3;

  public void init()
  {
	Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJButton1= new JButton();
    myJButton1.setText("유비");
    myJButton1.addActionListener(this);
    c.add(myJButton1);

    myJButton2= new JButton("관우");
    myJButton2.addActionListener(this);
    c.add(myJButton2);

    myJButton3= new JButton("장비");
    myJButton3.addActionListener(this);
    c.add(myJButton3);

    myJLabel= new JLabel();
    myJLabel.setText("버튼을 눌러주세요!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==myJButton1){ // 어느 버튼을 눌렀는지 getSource() 메소드로 조사
      myJLabel.setText("유비를 선택했습니다.");
    }else if(e.getSource()==myJButton2){
      myJLabel.setText("관우를 선택했습니다.");
    }else if(e.getSource()==myJButton3){
      myJLabel.setText("장비를 선택했습니다.");
    }
  }
}