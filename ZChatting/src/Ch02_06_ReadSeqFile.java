import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Ch02_06_ReadSeqFile  extends Frame implements ActionListener
{
	   private TextField txtAccount, txtName, txtBalance;
	   private Button btnNext, btnDone; 
	   private DataInputStream dis;  // 필터 입력 스트림 객체
	   
	   public Ch02_06_ReadSeqFile() {
	      super( "고객파일을 읽음");
	      
	      try {
	         dis = new DataInputStream(new FileInputStream("example02_05.txt"));
	      }catch ( IOException e ) {
	         System.err.println(e.toString());
	         System.exit(1);
	      }
	      
	      setSize(250, 130);
	      setLayout( new GridLayout( 4, 2 ));
	      
	      add( new Label("구좌번호"));
	      txtAccount = new TextField(); // 구좌번호를 읽는 필드.
	      txtAccount.setEditable(false); // 데이터 입력을 금지시킨다.
	      add(txtAccount);
	      
	      add(new Label("이름"));
	      txtName = new TextField( 20 ); // 이름을 읽는 필드.
	      txtName.setEditable(false); // 데이터의 입력을 금지시키다.
	      add(txtName);
	      
	      add(new Label("잔고"));
	      txtBalance = new TextField( 20 ); // 잔고를 읽는 필드.
	      txtBalance.setEditable(false); // 데이터의 입력을 금지시킨다.
	      add(txtBalance);
	      
	      btnNext = new Button("출력"); // 파일로부터 데이터를 읽는 버튼
	      btnNext.addActionListener(this);
	      add(btnNext);
	      
	      btnDone = new Button("종료"); // 프로그램을 종료하는 버튼
	      btnDone.addActionListener( this );
	      add(btnDone);
	      
	      setVisible(true);  
	   }
	   
	   public void actionPerformed(ActionEvent e){
	      if (e.getSource() == btnNext)
	         readRecord(); // 데이터를 한 레코드씩 읽는 메소드
	      else
	         closeFile();
	   }
	   
	   public void readRecord(){
	      int nAccountNo;
	      double dblBalance;
	      String strName;
	      
	      try{
	         nAccountNo = dis.readInt(); // 정수값인 구좌번호를 읽는다.
	         strName = dis.readUTF(); // 문자열인 이름을 읽는다.
	         dblBalance = dis.readDouble(); // 실수값인 잔고를 읽는다.
	         //...읽어드린 데이터를 관련된 텍스트 필드에 출력한다.
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
	   
	   private void closeFile(){ // 스트림을 닫고 프로그램을 종료한다.
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