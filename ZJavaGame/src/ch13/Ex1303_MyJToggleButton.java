package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1303_MyJToggleButton extends JApplet
  implements ActionListener
{
  JLabel myJLabel;
  JToggleButton myJToggleButton1, myJToggleButton2, myJToggleButton3;

  public void init()
  {
	Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJToggleButton1= new JToggleButton();
    myJToggleButton1.setText("유비");
    myJToggleButton1.addActionListener(this);
    c.add(myJToggleButton1);

    myJToggleButton2= new JToggleButton("관우");
    myJToggleButton2.addActionListener(this);
    c.add(myJToggleButton2);

    myJToggleButton3= new JToggleButton("장비");
    myJToggleButton3.addActionListener(this);
    c.add(myJToggleButton3);

    myJLabel= new JLabel();
    myJLabel.setText("버튼을 눌러주세요!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==myJToggleButton1){ // 어느 버튼을 눌렀는지 getSource() 메소드로 조사
      myJLabel.setText("유비를 선택했습니다.");
    }else if(e.getSource()==myJToggleButton2){
      myJLabel.setText("관우를 선택했습니다.");
    }else if(e.getSource()==myJToggleButton3){
      myJLabel.setText("장비를 선택했습니다.");
    }
  }
}