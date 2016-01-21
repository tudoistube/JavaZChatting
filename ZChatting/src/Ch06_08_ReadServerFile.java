import java.io.*;
import java.net.*;//...네트워크 프로그램 작성 관련.
import java.awt.*;
import java.awt.event.*;

public class Ch06_08_ReadServerFile  extends Frame implements ActionListener
{
	   private TextField txtEnter;
	   private TextArea txtContents;
	   
	   public Ch06_08_ReadServerFile(){
	      super("호스트 파일 읽기");
	      setLayout( new BorderLayout() );
	      
	      txtEnter = new TextField( "URL를 입력하세요!" );
	      txtEnter.addActionListener( this );
	      add( txtEnter, BorderLayout.NORTH );
	      
	      txtContents=new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
	      add( txtContents, BorderLayout.CENTER );
	      
	      addWindowListener(new WinListener());
	      setSize(350, 150);
	      setVisible(true);
	   }
	   
	   public void actionPerformed( ActionEvent e ) {
	      URL url;
	      InputStream is;
	      BufferedReader br;
	      String strLine;
	      StringBuffer sb = new StringBuffer();	      
	      String strUrl = e.getActionCommand(); // 텍스트 필드에 입력된 URL를 구함
	      
	      try {
	         url = new URL( strUrl );
	         is = url.openStream(); // location(호스트)과 연결시키는 InputStream 객체생성
	         br = new BufferedReader(new InputStreamReader(is));
	         
	         txtContents.setText( "파일을 읽는 중입니다...." );
	         
	         while ( ( strLine = br.readLine() ) != null ) // 파일(웹페이지)을 읽는다.
	            sb.append( strLine ).append( '\n' );
	         
	         txtContents.setText( sb.toString() ); // 읽은 파일을 텍스트 에리어에 출력
	         br.close();
	      }catch(MalformedURLException mal) {
	         txtContents.setText("URL 형식이 잘못되었습니다.");
	      }catch ( IOException io ) {
	         txtContents.setText( io.toString() );
	      }catch ( Exception ex ) {
	         txtContents.setText( "호스트 컴퓨터의 파일만을 열 수 있습니다." );
	      }
	   }
	   public static void main(String args[]){
	      Ch06_08_ReadServerFile read = new Ch06_08_ReadServerFile();
	   }
	   class WinListener extends WindowAdapter
	   {
	      public void windowClosing(WindowEvent we){
	         System.exit(0);
	      }
	   }
	}