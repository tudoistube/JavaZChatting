package ch13;
import javax.swing.*;           // ���� ��Ű�� ����
import javax.swing.event.*;
import java.awt.*;               // Font ��� ���� ���� awt ��Ű�� ����
import java.awt.event.*;
import java.io.*;


public class Ex1322_Nemonemo extends Ex1322_CloseableFrame // JFrame���κ��� ��ӹ��� CloseableFrame ���
  implements ActionListener
{
  JPanel contentPane;

  // �޴�
  JMenuBar menuBar= new JMenuBar();
  JMenu gameMenu= new JMenu("Game"); // Game �޴�
  JMenu helpMenu= new JMenu("Help"); // Help �޴�

  // ����(add)�� Ŭ������ ����
  Ex1322_Board board; 
  Ex1322_Column col;
  Ex1322_Row row;

  // ���콺 Ŀ���� ��ǥ
  int mouseX=-1;
  int mouseY=-1 ;

  String data= "0001000000011100001101010000101111111110111111111000011111100001111100000100010000010001000011001100"; // ������ ����(�ʱⰪ�� ������)
  int[] temp; // �÷��̾ �Է��� ��

  int columnNums[][], rowNums[][];
  int numOfColumn[], numOfRow[];

  boolean endFlag= false; // ������ Ǯ�ȴ��� ����

  public static void main(String[] args)
  {
    Ex1322_Nemonemo nemo= new Ex1322_Nemonemo(); // �׸�׸���� ���� ����

    nemo.addWindowListener(new WindowAdapter(){
                                                 public void windowCloses(WindowEvent e)
                                                 {  System.exit(0);  }
                                               });

    nemo.setVisible(true);
    nemo.toFront();
  }

  public Ex1322_Nemonemo()
  {
    this.setTitle("Nemonemo Logic"); // ���ø����̼� â�� Ÿ��Ʋ(����) ����
    this.setSize(331, 381); // ���ø����̼��� ũ�� ����

    // ���� �ʱ�ȭ
    temp= new int[100]; // ���� 10ĭ, ���� 10ĭ���� �� 100ĭ ����
    for(int i=0; i<100; i++) temp[i]= 0; // �÷��̾ �Է��ϱ� ���� 0���� �ʱ�ȭ
    columnNums= new int[10][10];
    numOfColumn= new int[10];
    rowNums= new int[10][10];
    numOfRow= new int[10];

    contentPane= (JPanel) getContentPane();
    contentPane.setBackground(Color.white);
    contentPane.setLayout(null); // null ���̾ƿ����� ����

    createMenus(); // �޴� ����

    // �÷� ����
    col= new Ex1322_Column(this);
    contentPane.add(col);
    col.setFont(new Font("SansSerif", Font.BOLD, 14));
    col.setBounds(120, 0, 201, 120);
    col.repaint();

    // �ο� ����
    row= new Ex1322_Row(this);
    contentPane.add(row);
    row.setFont(new Font("SansSerif", Font.BOLD, 14));
    row.setBounds(0, 120, 120, 201);

    // ���� ����
    board= new Ex1322_Board(this);
    contentPane.add(board);
    board.setFont(new Font("SansSerif", Font.BOLD, 14));
    board.setBounds(120, 120, 201, 201); 
  }

  public void createMenus()
  {
    this.setJMenuBar(menuBar);
    menuBar.add(gameMenu);
    menuBar.add(helpMenu);

    // Game �޴��� ����޴� ����
    JMenuItem newGame= new JMenuItem("New Game ...");
    newGame.addActionListener(this);
    newGame.setActionCommand("newGame");
    gameMenu.add(newGame);

    JMenuItem answerGame= new JMenuItem("Answer");
    answerGame.addActionListener(this);
    answerGame.setActionCommand("answerGame");
    gameMenu.add(answerGame);

    JMenuItem exitGame= new JMenuItem("Exit");
    exitGame.addActionListener(this);
    exitGame.setActionCommand("exitGame");
    gameMenu.add(exitGame);

    // Help �޴��� ����޴� ����
    JMenuItem aboutGame= new JMenuItem("About Game ...");
    aboutGame.addActionListener(this);
    aboutGame.setActionCommand("aboutGame");
    helpMenu.add(aboutGame);
  }

  public void showLocation(int mouseX, int mouseY) // ���콺 Ŀ���� ��ġ�� ǥ��
  {
    if(mouseX!=this.mouseX){  // ���콺 Ŀ���� ��ġ�� ���� ���� ���
      this.mouseX= mouseX;
      col.repaint();
    }
    if(mouseY!=this.mouseY){  // ���콺 Ŀ���� ��ġ�� ���� ���� ���
      this.mouseY= mouseY;
      row.repaint();
    }
  }

  public void display() // ������ Ǯ�ȴ��� ���θ� �˻�
  {
    boolean endFlag= true;
    for(int j=0; (j<10)&&endFlag; j++)
      for(int i=0; (i<10)&&endFlag; i++)
      {
        if((data.charAt(j*10+i)=='1')&&(temp[j*10+i]!=1)) endFlag=false; // ä���� ĭ�� ��� ä������ �˻�
        else if((data.charAt(j*10+i)!='1')&&(temp[j*10+i]==1)) endFlag=false; // ä���� �ʾƾ� �� ĭ�� ä������ �˻�
      }

    if(endFlag)
    {
      this.endFlag= endFlag;
      board.repaint(); // ������ �� Ǯ������ ������ ĭ�� ä��
    }
  }

  public void actionPerformed(ActionEvent e) // ������ �޴��� ���� ������ ��ƾ�� ȣ��
  {
    String cmd= e.getActionCommand();
    
    if(cmd.equals("newGame")){ // �׸�׸���� �����͸� �ҷ��ͼ� �� ������ ����
      showOpenDialog();
    }else if(cmd.equals("answerGame")){ // Answer�� �����ϸ� ������ ���
      this.endFlag= true;
      board.repaint();
    }else if(cmd.equals("exitGame")){ // ���� ����
      this.dispose();      
    }else if(cmd.equals("aboutGame")){ // ���ø����̼� ������ ���
      showAboutDialog();
    }
  }

  // �޴����� New Game ���ý�, ���� �����͸� �ҷ����� �޼ҵ�
  public void showOpenDialog() 
  {
    FileDialog fd= 
      new FileDialog(this, "Open a File", FileDialog.LOAD);
      
    fd.setFile("*.nemo;*.NEMO"); // ������ ������ Ȯ���ڴ� nemo �Ǵ� NEMO
    fd.setVisible(true);
    
    if(fd.getFile()!=null)
    {
      String filename= fd.getFile();
      String logicDir= fd.getDirectory();
      if(filename.indexOf('.')!=-1){
        filename= (filename.substring(0, filename.indexOf('.'))).toLowerCase();
      }else{
        filename= filename.toLowerCase();
      }
      String logicName= filename;
    
      File f;                  
      FileInputStream from= null;
      BufferedReader d= null;
    
      try{
        f= new File(logicDir + logicName + ".nemo");
        from= new FileInputStream(f);
        d = new BufferedReader(new InputStreamReader(from));

        data= d.readLine();
        data.trim();

        d.close();
      }catch(IOException e){
        System.out.println("I/O ERROR: "+ e);
      }

      // ���� �ʱ�ȭ
      for(int i=0; i<100; i++) temp[i]= 0;      
      this.endFlag= false;

      // �ҷ��� �����Ϳ� ���� �÷�, �ο��� ���ڸ� ������ϰ� ������ ���带 �ٽ� ���
      col.getColumn(); 
      row.getRow();
      board.repaint();
    }
  }

  public void showAboutDialog() // �޴����� About Game ���ý� ����ϴ� ���ø����̼� ����
  {
    Ex1322_AboutDialog ad= new Ex1322_AboutDialog(this);
    ad.setVisible(true);
  }

}
