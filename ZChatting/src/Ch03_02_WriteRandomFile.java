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
	      super( "���Ͼ���" );
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
	      
	      add( new Label( "���¹�ȣ" ) );
	      txtAccount = new TextField();
	      add( txtAccount );
	      
	      add( new Label( "�̸�" ) );
	      txtName = new TextField( 20 );
	      add( txtName );
	      
	      add( new Label( "�ܰ�" ) );
	      txtBalance = new TextField( 20 );
	      add( txtBalance );
	      
	      btnEnter = new Button( "�Է�" );
	      btnEnter.addActionListener( this );
	      add( btnEnter );
	      
	      btnRead = new Button( "�б�" );
	      btnRead.addActionListener( this );
	      add( btnRead );	      
	      
	      btnDone = new Button( "����" );
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
	            System.err.println("�����б� ����\n" + io.toString() );
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
	               
	               //...���� �����͸� ������ �ϴ� ���ڵ��� ù ��° ����Ʈ ��ġ�� �̵���Ŵ.
	               //...���ڵ��� ũ�Ⱑ 42����Ʈ�̹Ƿ� seek()�� �μ� ���� 0, 42, 84, 126...���
	               //...���� 42�� ����� �� ���ڵ��� ù��° ����Ʈ�� ��ġ ���� ����.
	               rafOutput.seek((long) ( nAccountNo-1 ) * Ch03_02_Record.size() );
	               recordData.write( rafOutput );
	               
	            }//...E.if ( nAccountNo > 0 && nAccountNo <= 100 ) {
	            
	            // �ؽ�Ʈ �ʵ��� ������ �����.
	            txtAccount.setText( "0" );
	            txtName.setText( " " );
	            txtBalance.setText( "0" );
	            
	         } catch ( NumberFormatException nfe ) {
	            System.err.println("���ڸ� �Է��ϼ���" );
	         } catch ( IOException io ) {
	            System.err.println("���Ͼ��� ����\n" + io.toString() );
	            System.exit( 1 );
	         }
	         
	      }//...E.if ( ! txtAccount.getText().equals( "" ) ) {
	      
	   }//...E.public void addRecord(){
	   
	   public void actionPerformed( ActionEvent e ){
 
		  if ( e.getSource() == btnEnter ) {
			  //...�Էµ� �����͸� �����Ѵ�.
			  addRecord();		         
		  }
		  
		  if ( e.getSource() == btnRead ) {
			  //...�Էµ� �����͸� �����Ѵ�.
			  readRecord();		         
		  }
		  
	      if ( e.getSource() == btnDone ) {
	         try {
	            rafOutput.close();
	         } catch ( IOException io ) {
	            System.err.println( "���� �ݱ� ����\n" + io.toString() );
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
	   
	   // RandomAccessFile�κ��� �� ���ڵ带 �д´�.
	   public void read(RandomAccessFile file) throws IOException {
		  // file�κ��� ���¹�ȣ�� �д´�.
		  nAccount = file.readInt(); 
	      char ch_arrName[] = new char[15];
	      for(int i = 0; i < ch_arrName.length; i++ )
	         ch_arrName[i] = file.readChar();
	      strName = new String(ch_arrName);
	      dblBalance = file.readDouble();
      
	   }
	   
	   // RandomAccessFile�κ��� �� ���ڵ带 �д´�.
	   public int readAccount(RandomAccessFile file) throws IOException {
		  // file�κ��� ���¹�ȣ�� �д´�.
		  nAccount = file.readInt(); 
		  return nAccount;    
	   }	  
	   
	// RandomAccessFile�κ��� �� ���ڵ带 �д´�.
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
	   
	   // RandomAccessFile�� �� ���ڵ带 �����Ѵ�.
	   public void write(RandomAccessFile file) throws IOException {
	      StringBuffer strBuf;
	      // file�� ���¹�ȣ�� �����Ѵ�.
	      file.writeInt( nAccount ); 
	      
	      if (strName != null) 
	         strBuf = new StringBuffer(strName);
	      else 
	         strBuf = new StringBuffer(15);
	      
	      strBuf.setLength(15); // �̸��� �����ϴ� �޸� ũ�⸦ 15�� ����
	      file.writeChars(strBuf.toString());
	      file.writeDouble( dblBalance );
	   }
	   
	   public void setAccount(int a) { nAccount = a; } // ���¹�ȣ�� �����Ѵ�.
	   public int getAccount() { return nAccount; } // ���¹�ȣ�� ��ȯ�Ѵ�.
	   public void setName(String f) { strName = f; } 
	   public String getName() { return strName; }
	   public void setBalance(double b) { dblBalance = b; }
	   public double getBalance() { return dblBalance; }
	   public static int size() { return 42; } // �� ���ڵ��� ����
	}