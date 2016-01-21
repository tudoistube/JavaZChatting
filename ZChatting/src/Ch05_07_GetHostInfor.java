import java.awt.*; //...GUI.
import java.awt.event.*; //...GUI Event.
import java.net.*;//...��Ʈ��ũ ���α׷� �ۼ� ����.
import java.applet.*;

public class Ch05_07_GetHostInfor  extends Frame implements ActionListener
{
	   TextField txtHostname; // ȣ��Ʈ �̸��� �Է¹޴� �ʵ�
	   Button btnGetInfo; // �Էµ� ȣ��Ʈ�� ���� IP ������ �д� ��ư
	   TextArea txtDisplay; // ������ IP�� ���� ������ ����ϴ� �ʵ�
	   
	   public static void main(String args[]) {
		   Ch05_07_GetHostInfor host = new Ch05_07_GetHostInfor("InetAddress Ŭ����");
	      host.setVisible(true);
	   }
	   
	   public Ch05_07_GetHostInfor(String str){
	      super(str);	      
	      addWindowListener(new WinListener());
	      setLayout(new BorderLayout());
	      
	      Panel inputpanel = new Panel(); // ù ��° �г�
	      inputpanel.setLayout(new BorderLayout());
	      inputpanel.add("North", new Label("ȣ��Ʈ �̸�:"));
	      
	      txtHostname = new TextField("", 30);
	      btnGetInfo = new Button("ȣ��Ʈ ���� ���");
	      inputpanel.add("Center", txtHostname);
	      inputpanel.add("South", btnGetInfo);
	      
	      btnGetInfo.addActionListener(this); // �̺�Ʈ ���
	      add("North", inputpanel); // �г��� �����ӿ� ����
	      
	      Panel outputpanel = new Panel(); // �� ��° �г�
	      outputpanel.setLayout(new BorderLayout());
	      
	      txtDisplay = new TextArea("", 24, 40);
	      txtDisplay.setEditable(false);
	      outputpanel.add("North", new Label("���ͳ� �ּ�"));
	      outputpanel.add("Center", txtDisplay);
	      
	      add("Center", outputpanel);
	      setSize(270, 200);
	   }
	   
	   public void actionPerformed(ActionEvent e ) {
	      String name = txtHostname.getText(); // �Էµ� ȣ��Ʈ �̸��� ���Ѵ�.
	      try{
	         InetAddress inetAddress = InetAddress.getByName(name); // InetAddress ��ü����
	         String strHost = inetAddress.getHostName()+"\n"; // ȣ��Ʈ�� �̸��� ���Ѵ�.
	         txtDisplay.append(strHost);
	         
	         // ȣ��Ʈ�� IP �ּҸ� ���Ѵ�.
	         strHost = inetAddress.getHostAddress()+"\n"; 
	         txtDisplay.append(strHost);
	         
	      }catch(UnknownHostException ue){
	         String ip = name+": �ش� ȣ��Ʈ�� �����ϴ�.\n";
	         txtDisplay.append(ip);
	      }
	   }
	   class WinListener extends WindowAdapter
	   {
	      public void windowClosing(WindowEvent we){
	         System.exit(0);
	      }
	   }
	}