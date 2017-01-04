package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1308_MyJTextField extends JApplet
  implements ActionListener
{
  JLabel myJLabel;
  JTextField myJTextField;

  public void init()
  {
    Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJTextField= new JTextField(20); // 텍스트필드 생성
    myJTextField.addActionListener(this);
    c.add(myJTextField);

    myJLabel= new JLabel();
    myJLabel.setText("텍스트필드에 글을 입력해주세요!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void actionPerformed(ActionEvent e) // 텍스트필드에 입력이 완료되었을 때
  {
    if(e.getSource()==myJTextField){
      myJLabel.setText(new String(myJTextField.getText()) +"가 입력되었습니다!");
    }
  }
}