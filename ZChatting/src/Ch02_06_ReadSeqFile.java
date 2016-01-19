import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Ch02_06_ReadSeqFile  extends Frame implements ActionListener
{
	   private TextField txtAccount, txtName, txtBalance;
	   private Button btnNext, btnDone; 
	   private DataInputStream dis;  // ���� �Է� ��Ʈ�� ��ü
	   
	   public Ch02_06_ReadSeqFile() {
	      super( "�������� ����");
	      
	      try {
	         dis = new DataInputStream(new FileInputStream("example02_05.txt"));
	      }catch ( IOException e ) {
	         System.err.println(e.toString());
	         System.exit(1);
	      }
	      
	      setSize(250, 130);
	      setLayout( new GridLayout( 4, 2 ));
	      
	      add( new Label("���¹�ȣ"));
	      txtAccount = new TextField(); // ���¹�ȣ�� �д� �ʵ�.
	      txtAccount.setEditable(false); // ������ �Է��� ������Ų��.
	      add(txtAccount);
	      
	      add(new Label("�̸�"));
	      txtName = new TextField( 20 ); // �̸��� �д� �ʵ�.
	      txtName.setEditable(false); // �������� �Է��� ������Ű��.
	      add(txtName);
	      
	      add(new Label("�ܰ�"));
	      txtBalance = new TextField( 20 ); // �ܰ� �д� �ʵ�.
	      txtBalance.setEditable(false); // �������� �Է��� ������Ų��.
	      add(txtBalance);
	      
	      btnNext = new Button("���"); // ���Ϸκ��� �����͸� �д� ��ư
	      btnNext.addActionListener(this);
	      add(btnNext);
	      
	      btnDone = new Button("����"); // ���α׷��� �����ϴ� ��ư
	      btnDone.addActionListener( this );
	      add(btnDone);
	      
	      setVisible(true);  
	   }
	   
	   public void actionPerformed(ActionEvent e){
	      if (e.getSource() == btnNext)
	         readRecord(); // �����͸� �� ���ڵ徿 �д� �޼ҵ�
	      else
	         closeFile();
	   }
	   
	   public void readRecord(){
	      int nAccountNo;
	      double dblBalance;
	      String strName;
	      
	      try{
	         nAccountNo = dis.readInt(); // �������� ���¹�ȣ�� �д´�.
	         strName = dis.readUTF(); // ���ڿ��� �̸��� �д´�.
	         dblBalance = dis.readDouble(); // �Ǽ����� �ܰ� �д´�.
	         //...�о�帰 �����͸� ���õ� �ؽ�Ʈ �ʵ忡 ����Ѵ�.
	         txtAccount.setText(String.valueOf(nAccountNo));
	         txtName.setText(strName);
	         txtBalance.setText(String.valueOf(dblBalance));
	         
	      }catch(EOFException eof){
	         closeFile();
	      }catch (IOException io) {
	         System.err.println(io.toString());
	         System.exit(1);
	      }
	   }
	   
	   private void closeFile(){ // ��Ʈ���� �ݰ� ���α׷��� �����Ѵ�.
	      try{
	         dis.close();
	         System.exit(0);
	         
	      }catch(IOException io){
	         System.err.println(io.toString());
	         System.exit(1);
	      }
	   }
	   
	   public static void main( String args[] ){
	      new Ch02_06_ReadSeqFile();
	   }
	}