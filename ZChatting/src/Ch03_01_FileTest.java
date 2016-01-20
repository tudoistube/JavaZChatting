import java.io.*; //...IOException.
import java.awt.*; //...GUI(Frame).
import java.awt.event.*; //...GUI Event(ActionListener).

public class Ch03_01_FileTest  extends Frame implements ActionListener 
{

	   private TextField txtInput;
	   private TextArea txtOutput;
	   
	   public Ch03_01_FileTest() {
	      super( "File Ŭ���� �׽�Ʈ" );

	      txtInput = new TextField("���� �� ���丮���� �Է��ϼ���");
	      txtInput.addActionListener( this );
	      
	      txtOutput = new TextArea();
	      add(txtInput, BorderLayout.NORTH);
	      add(txtOutput, BorderLayout.CENTER);
	      addWindowListener(new WinListener());
	      
	      setSize( 400, 400 );
	      setVisible( true );	      
	   }	

	   class WinListener extends WindowAdapter
	   {
	      public void windowClosing(WindowEvent we){
	         System.exit(0);
	      }
	   }	   

	@Override
	public void actionPerformed(ActionEvent e) {
		// �ؽ�Ʈ �ʵ��� �����̸��� ����  
		File fileName = new File(e.getActionCommand());
		
		// + ������ ���͸� �Է��ϸ� �ȵ�
	     if (fileName.exists()) { 
	         txtOutput.setText(fileName.getName() + "�� �����Ѵ�.\n" 
									            +(fileName.isFile() ? "�����̴�.\n" : "������ �ƴϴ�.\n" ) 
									            +(fileName.isDirectory() ? "���丮�̴�.\n" : "���丮�� �ƴϴ�.\n" ) 
									            +( fileName.isAbsolute() ? "�������̴�.\n" : "�����ΰ� �ƴϴ�.\n" ) 
									            +"������ ������¥�� : " + fileName.lastModified() 
									            +"\n������ ���̴� : " + fileName.length() 
									            +"\n������ ��δ� : " + fileName.getPath() 
									            +"\n�����δ� : " + fileName.getAbsolutePath() 
									            +"\n���� ���丮�� : " + fileName.getParent() );
	         
	         if ( fileName.isFile() ) {
	            try {
	               //...r : �б���.
	               RandomAccessFile r =  new RandomAccessFile(fileName, "r");
	               StringBuffer buf = new StringBuffer();
	               String text;
	               txtOutput.append( "\n\n" );
	               while( ( text = r.readLine() ) != null ) 
	                  buf.append( text + "\n" );
	               txtOutput.append( buf.toString() );
	            } catch( IOException e2 ) {
	            }
	         }
	         else if(fileName.isDirectory()) {
	            String directory[] = fileName.list();
	            txtOutput.append( "\n\n���丮�� ������ :\n");
	            for (int i = 0; i < directory.length; i++ )
	               txtOutput.append( directory[i] + "\n" );
	         }//...E.if ( name.isFile() ) {
	      }
	      else {
	         txtOutput.setText( e.getActionCommand() + " �� �������� �ʴ´�.\n");
	      }//...E.if (name.exists()) {  		
	}
	
	public static void main(String[] args) {
		Ch03_01_FileTest f = new Ch03_01_FileTest();
	}	
	
}
