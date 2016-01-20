import java.io.*; //...IOException, InputStream, OutputStream
import java.awt.*; //...GUI(Frame).
import java.awt.event.*; //...GUI Event(ActionListener).

public class Ch03_02_WriteRandomFile   extends Frame implements ActionListener 
{
	   private TextField txtAccount, txtName, txtBalance;
	   private Button btnEnter, btnRead, btnDone;
	   private RandomAccessFile rafOutput;
	   private RandomAccessFile rafRead;
	   private Ch03_02_Record recordData;
	   
	   public Ch03_02_WriteRandomFile(){
	      super( "파일쓰기" );
	      recordData = new Ch03_02_Record();
	      
	      try {
	         rafOutput = new RandomAccessFile( "example03_02.txt", "rw" );
	         rafRead = new RandomAccessFile( "example03_02.txt", "r" );
	      } catch ( IOException e ) {
	         System.err.println( e.toString() );
	         System.exit( 1 );
	      }
	      setSize( 300, 150 );
	      setLayout( new GridLayout( 4, 2 ) );	      
	      
	      add( new Label( "구좌번호" ) );
	      txtAccount = new TextField();
	      add( txtAccount );
	      
	      add( new Label( "이름" ) );
	      txtName = new TextField( 20 );
	      add( txtName );
	      
	      add( new Label( "잔고" ) );
	      txtBalance = new TextField( 20 );
	      add( txtBalance );
	      
	      btnEnter = new Button( "입력" );
	      btnEnter.addActionListener( this );
	      add( btnEnter );
	      
	      btnRead = new Button( "읽기" );
	      btnRead.addActionListener( this );
	      add( btnRead );	      
	      
	      btnDone = new Button( "종료" );
	      btnDone.addActionListener( this );
	      add( btnDone );
	      
	      setVisible( true );  
	   }
	   

	   private void readRecord() {
		   try {
			recordData.read(rafRead);

			String strTemp;
			strTemp = String.valueOf(recordData.readAccount(rafRead));
			txtAccount.setText( strTemp);
			
			strTemp = String.valueOf(recordData.readName(rafRead));
            txtName.setText( strTemp);
            
            strTemp = String.valueOf(recordData.readBalance(rafRead));
            txtBalance.setText( strTemp );			
			
	         } catch ( IOException io ) {
	            System.err.println("파일읽기 에러\n" + io.toString() );
	            System.exit( 1 );
	         }		
	   }
	   
	   public void addRecord(){
	      int nAccountNo = 0;
	      Double dblBalance;
	      
	      if ( ! txtAccount.getText().equals( "" ) ) {
	         try {
	            nAccountNo = Integer.parseInt( txtAccount.getText() );
	            
	            if ( nAccountNo > 0 && nAccountNo <= 999 ) {
	               recordData.setAccount( nAccountNo );
	               recordData.setName( txtName.getText() );
	               
	               dblBalance = new Double ( txtBalance.getText() );
	               recordData.setBalance( dblBalance.doubleValue() );
	               
	               //...파일 포인터를 쓰고자 하는 레코드의 첫 번째 바이트 위치로 이동시킴.
	               //...레코드의 크기가 42바이트이므로 seek()의 인수 값은 0, 42, 84, 126...등과
	               //...같이 42의 배수가 각 레코드의 첫번째 바이트의 위치 값을 가짐.
	               rafOutput.seek((long) ( nAccountNo-1 ) * Ch03_02_Record.size() );
	               recordData.write( rafOutput );
	               
	            }//...E.if ( nAccountNo > 0 && nAccountNo <= 100 ) {
	            
	            // 텍스트 필드의 내용을 지운다.
	            txtAccount.setText( "0" );
	            txtName.setText( " " );
	            txtBalance.setText( "0" );
	            
	         } catch ( NumberFormatException nfe ) {
	            System.err.println("숫자를 입력하세요" );
	         } catch ( IOException io ) {
	            System.err.println("파일쓰기 에러\n" + io.toString() );
	            System.exit( 1 );
	         }
	         
	      }//...E.if ( ! txtAccount.getText().equals( "" ) ) {
	      
	   }//...E.public void addRecord(){
	   
	   public void actionPerformed( ActionEvent e ){
 
		  if ( e.getSource() == btnEnter ) {
			  //...입력된 데이터를 저장한다.
			  addRecord();		         
		  }
		  
		  if ( e.getSource() == btnRead ) {
			  //...입력된 데이터를 저장한다.
			  readRecord();		         
		  }
		  
	      if ( e.getSource() == btnDone ) {
	         try {
	            rafOutput.close();
	         } catch ( IOException io ) {
	            System.err.println( "파일 닫기 에러\n" + io.toString() );
	         }
	         System.exit( 0 );
	      }
	   }//...E.public void actionPerformed( ActionEvent e ){
	   

	public static void main( String args[] ) {
	      new Ch03_02_WriteRandomFile();
	   }
	}

	class Ch03_02_Record
	{
	   private int nAccount;
	   private String strName;
	   private double dblBalance;
	   
	   // RandomAccessFile로부터 한 레코드를 읽는다.
	   public void read(RandomAccessFile file) throws IOException {
		  // file로부터 구좌번호를 읽는다.
		  nAccount = file.readInt(); 
	      char ch_arrName[] = new char[15];
	      for(int i = 0; i < ch_arrName.length; i++ )
	         ch_arrName[i] = file.readChar();
	      strName = new String(ch_arrName);
	      dblBalance = file.readDouble();
      
	   }
	   
	   // RandomAccessFile로부터 한 레코드를 읽는다.
	   public int readAccount(RandomAccessFile file) throws IOException {
		  // file로부터 구좌번호를 읽는다.
		  nAccount = file.readInt(); 
		  return nAccount;    
	   }	  
	   
	// RandomAccessFile로부터 한 레코드를 읽는다.
	   public String readName(RandomAccessFile file) throws IOException {
	      char ch_arrName[] = new char[15];
	      for(int i = 0; i < ch_arrName.length; i++ )
	         ch_arrName[i] = file.readChar();
	      strName = new String(ch_arrName);
	      return strName;	      
	   }
	   
	   public double readBalance(RandomAccessFile file) throws IOException {
	      dblBalance = file.readDouble();
	      return dblBalance;	      
	   }	   
	   
	   // RandomAccessFile에 한 레코드를 저장한다.
	   public void write(RandomAccessFile file) throws IOException {
	      StringBuffer strBuf;
	      // file에 구좌번호를 저장한다.
	      file.writeInt( nAccount ); 
	      
	      if (strName != null) 
	         strBuf = new StringBuffer(strName);
	      else 
	         strBuf = new StringBuffer(15);
	      
	      strBuf.setLength(15); // 이름을 저장하는 메모리 크기를 15로 설정
	      file.writeChars(strBuf.toString());
	      file.writeDouble( dblBalance );
	   }
	   
	   public void setAccount(int a) { nAccount = a; } // 구좌번호를 설정한다.
	   public int getAccount() { return nAccount; } // 구좌번호를 반환한다.
	   public void setName(String f) { strName = f; } 
	   public String getName() { return strName; }
	   public void setBalance(double b) { dblBalance = b; }
	   public double getBalance() { return dblBalance; }
	   public static int size() { return 42; } // 한 레코드의 길이
	}