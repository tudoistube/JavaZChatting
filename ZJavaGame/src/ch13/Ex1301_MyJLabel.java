package ch13;
import java.awt.*;
import javax.swing.*;

public class Ex1301_MyJLabel extends JApplet
{
  JLabel myJLabel1, myJLabel2, myJLabel3;

  public void init()
  {
	//...JApplet에 스윙 컴포넌트 추가.
	//...1.Container c = JApplet.getContentPane() 호출.
	//...2.패널의 레이아웃 매니저를 설정.
	//...  c.setLayout(new FlowLayout());
	//...3.스윙컴포넌트 생성.
	//...  myJButton = new JButton();
	//...패널에 스윙 컴포넌트를 추가.
	//...  c.add(myJButton);
	Container c= this.getContentPane();
	c.setLayout(new FlowLayout());

    myJLabel1= new JLabel();
    myJLabel1.setText("유비");
    myJLabel1.setHorizontalAlignment(JLabel.LEFT); // 왼쪽 정렬
    c.add(myJLabel1);

    myJLabel2= new JLabel("관우");
    myJLabel2.setHorizontalAlignment(JLabel.CENTER); // 가운데 정렬
    c.add(myJLabel2);

    myJLabel3= new JLabel("장비", JLabel.RIGHT); // 오른쪽 정렬
    c.add(myJLabel3);
  }
}