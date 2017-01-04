package ch13;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class Ex1307_MyJList extends JApplet
  implements ListSelectionListener
{
  JLabel myJLabel;
  JList  myJList;

  public void init()
  {
    Container c= this.getContentPane();
	//c.setLayout(new FlowLayout());
	c.setLayout(new BorderLayout());

    String[] item= {"유비", "관우", "장비", "조조", "여포", "동탁"};
    myJList= new JList(item); 
    myJList.addListSelectionListener(this);
    //c.add(myJList);
    c.add("North", myJList);

    myJLabel= new JLabel();
    myJLabel.setText("리스트 항목을 선택해주세요!");
    myJLabel.setHorizontalAlignment(JLabel.CENTER);
    //c.add(myJLabel);
    c.add("Center", myJLabel);
  }

  public void valueChanged(ListSelectionEvent e)
  {
    if(e.getSource()==myJList){
      myJLabel.setText((String) myJList.getSelectedValue()+"를 클릭했습니다.");
    }
  }
}