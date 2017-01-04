package ch13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1309_MyJPasswordField extends JApplet
  implements ActionListener
{
  JLabel myJLabel;
  JPasswordField myJPasswordField;

  public void init()
  {
    Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJPasswordField= new JPasswordField(20); // 패스워드필드 생성
	myJPasswordField.setEchoChar('*'); // 입력 문자가 *로 표시
    myJPasswordField.addActionListener(this);
    c.add(myJPasswordField);

    myJLabel= new JLabel();
    myJLabel.setText("패스워드필드에 글을 입력해주세요!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    c.add(myJLabel);
  }

  public void actionPerformed(ActionEvent e) // 텍스트필드에 입력이 완료되었을 때
  {
    if(e.getSource()==myJPasswordField){
      myJLabel.setText(new String(myJPasswordField.getPassword()) +"가 입력되었습니다!");
    }
  }
}