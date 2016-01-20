import java.io.*; //...IOException.
import java.awt.*; //...GUI(Frame).
import java.awt.event.*; //...GUI Event(ActionListener).

public class Ch03_01_FileTest  extends Frame implements ActionListener 
{

	   private TextField txtInput;
	   private TextArea txtOutput;
	   
	   public Ch03_01_FileTest() {
	      super( "File 클래스 테스트" );

	      txtInput = new TextField("파일 및 디렉토리명을 입력하세요");
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
		// 텍스트 필드의 파일이름을 읽음  
		File fileName = new File(e.getActionCommand());
		
		// + 다음에 엔터를 입력하면 안됨
	     if (fileName.exists()) { 
	         txtOutput.setText(fileName.getName() + "이 존재한다.\n" 
									            +(fileName.isFile() ? "파일이다.\n" : "파일이 아니다.\n" ) 
									            +(fileName.isDirectory() ? "디렉토리이다.\n" : "디렉토리가 아니다.\n" ) 
									            +( fileName.isAbsolute() ? "절대경로이다.\n" : "절대경로가 아니다.\n" ) 
									            +"마지막 수정날짜은 : " + fileName.lastModified() 
									            +"\n파일의 길이는 : " + fileName.length() 
									            +"\n파일의 경로는 : " + fileName.getPath() 
									            +"\n절대경로는 : " + fileName.getAbsolutePath() 
									            +"\n상위 디렉토리는 : " + fileName.getParent() );
	         
	         if ( fileName.isFile() ) {
	            try {
	               //...r : 읽기모드.
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
	            txtOutput.append( "\n\n디렉토리의 내용은 :\n");
	            for (int i = 0; i < directory.length; i++ )
	               txtOutput.append( directory[i] + "\n" );
	         }//...E.if ( name.isFile() ) {
	      }
	      else {
	         txtOutput.setText( e.getActionCommand() + " 은 존재하지 않는다.\n");
	      }//...E.if (name.exists()) {  		
	}
	
	public static void main(String[] args) {
		Ch03_01_FileTest f = new Ch03_01_FileTest();
	}	
	
}
