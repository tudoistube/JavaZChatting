import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Ch02_05_CreateSeqFile  extends Frame implements ActionListener
{
	   private TextField txtAccount, txtName, txtBalance;
	   private Button btnEnter, btnDone; 
	   private DataOutputStream dos;  // 필터 스트림 객체
	   
	   public Ch02_05_CreateSeqFile() {
	      super( "고객파일을 생성" );
	      
	      try {
	         dos = new DataOutputStream(new FileOutputStream("example02_05.txt"));
	         
	      }catch ( IOException e ) {
	         System.err.println(e.toString());
	         System.exit(1);
	      }
	      setSize(250, 130);
	      setLayout( new GridLayout( 4, 2 ));
	      
	      add( new Label("구좌번호"));
	      txtAccount = new TextField(); // 구좌번호 입력 필드
	      add(txtAccount);
	      
	      add(new Label("이름"));
	      txtName = new TextField( 20 ); // 이름 입력 필드
	      add(txtName);
	      
	      add(new Label("잔고"));
	      txtBalance = new TextField( 20 ); // 잔고 입력 필드
	      add(txtBalance);
	      
	      btnEnter = new Button("입력"); // 입력된 데이터를 저장하는 버튼.
	      btnEnter.addActionListener(this); // 이벤트와 연결
	      add(btnEnter);
	      
	      btnDone = new Button("종료"); // 입력을 종료하는 버튼.
	      btnDone.addActionListener( this ); // 이벤트와 연결
	      add(btnDone);
	      
	      setVisible( true );  
	   }
	   
	   public void addRecord() {
	      int nAccountNo = 0;
	      String strBalance;
	      
	      if(!txtAccount.getText().equals("")){ // 구좌번호의 입력을 체크
	         try{
		            nAccountNo = Integer.parseInt(txtAccount.getText());
		            
		            if(nAccountNo > 0){
		               dos.writeInt(nAccountNo); // 구좌번호를 정수로 파일에 저장한다.
		               dos.writeUTF(txtName.getText() ); // 이름을 문자열을 저장한다.
		               strBalance=txtBalance.getText(); // 잔고를 문자열로 읽음
		               System.out.println("잔고 : " + strBalance);
		               dos.writeDouble(Double.valueOf(strBalance)); // 잔고를 실수로 저장한다.
	            }
		            
	            txtAccount.setText( "" ); // 텍스트 필드를 삭제
	            txtName.setText( "" );
	            txtBalance.setText( "" );
	            
	         }catch (NumberFormatException nfe) {
	            System.err.println("정수를 입력해야 합니다." );
	         }catch (IOException io) {
	            System.err.println(io.toString());
	            System.exit( 1 );
	         }
	      }
	   }
	   public void actionPerformed(ActionEvent e) {
	      addRecord(); // 입력된 데이터를 파일에 저장한다.
	      
	      if (e.getSource() == btnDone) {
	         try {
	            dos.close(); // 파일을 닫는다.
	         }catch(IOException io) {
	            System.err.println(io.toString());
	         }
	         
	         System.exit( 0 ); // 프로그램을 종료한다.
	      }
	   }
	   public static void main( String args[] ){
	      new Ch02_05_CreateSeqFile();
	   }
	}
