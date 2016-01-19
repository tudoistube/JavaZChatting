import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Ch02_05_CreateSeqFile  extends Frame implements ActionListener
{
	   private TextField txtAccount, txtName, txtBalance;
	   private Button btnEnter, btnDone; 
	   private DataOutputStream dos;  // ���� ��Ʈ�� ��ü
	   
	   public Ch02_05_CreateSeqFile() {
	      super( "�������� ����" );
	      
	      try {
	         dos = new DataOutputStream(new FileOutputStream("example02_05.txt"));
	         
	      }catch ( IOException e ) {
	         System.err.println(e.toString());
	         System.exit(1);
	      }
	      setSize(250, 130);
	      setLayout( new GridLayout( 4, 2 ));
	      
	      add( new Label("���¹�ȣ"));
	      txtAccount = new TextField(); // ���¹�ȣ �Է� �ʵ�
	      add(txtAccount);
	      
	      add(new Label("�̸�"));
	      txtName = new TextField( 20 ); // �̸� �Է� �ʵ�
	      add(txtName);
	      
	      add(new Label("�ܰ�"));
	      txtBalance = new TextField( 20 ); // �ܰ� �Է� �ʵ�
	      add(txtBalance);
	      
	      btnEnter = new Button("�Է�"); // �Էµ� �����͸� �����ϴ� ��ư.
	      btnEnter.addActionListener(this); // �̺�Ʈ�� ����
	      add(btnEnter);
	      
	      btnDone = new Button("����"); // �Է��� �����ϴ� ��ư.
	      btnDone.addActionListener( this ); // �̺�Ʈ�� ����
	      add(btnDone);
	      
	      setVisible( true );  
	   }
	   
	   public void addRecord() {
	      int nAccountNo = 0;
	      String strBalance;
	      
	      if(!txtAccount.getText().equals("")){ // ���¹�ȣ�� �Է��� üũ
	         try{
		            nAccountNo = Integer.parseInt(txtAccount.getText());
		            
		            if(nAccountNo > 0){
		               dos.writeInt(nAccountNo); // ���¹�ȣ�� ������ ���Ͽ� �����Ѵ�.
		               dos.writeUTF(txtName.getText() ); // �̸��� ���ڿ��� �����Ѵ�.
		               strBalance=txtBalance.getText(); // �ܰ� ���ڿ��� ����
		               System.out.println("�ܰ� : " + strBalance);
		               dos.writeDouble(Double.valueOf(strBalance)); // �ܰ� �Ǽ��� �����Ѵ�.
	            }
		            
	            txtAccount.setText( "" ); // �ؽ�Ʈ �ʵ带 ����
	            txtName.setText( "" );
	            txtBalance.setText( "" );
	            
	         }catch (NumberFormatException nfe) {
	            System.err.println("������ �Է��ؾ� �մϴ�." );
	         }catch (IOException io) {
	            System.err.println(io.toString());
	            System.exit( 1 );
	         }
	      }
	   }
	   public void actionPerformed(ActionEvent e) {
	      addRecord(); // �Էµ� �����͸� ���Ͽ� �����Ѵ�.
	      
	      if (e.getSource() == btnDone) {
	         try {
	            dos.close(); // ������ �ݴ´�.
	         }catch(IOException io) {
	            System.err.println(io.toString());
	         }
	         
	         System.exit( 0 ); // ���α׷��� �����Ѵ�.
	      }
	   }
	   public static void main( String args[] ){
	      new Ch02_05_CreateSeqFile();
	   }
	}
