import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlayerScreen
  extends JFrame
  implements ActionListener
{
  static PlayerScreen frame = new PlayerScreen();
  private JLabel prompt = new JLabel("Enter the player names:");
  private JLabel inputLabel1 = new JLabel("Player 1: ");
  private JLabel inputLabel2 = new JLabel("Player 2: ");
  private JLabel inputLabel3 = new JLabel("Player 3: ");
  private JLabel inputLabel4 = new JLabel("Player 4: ");
  private JLabel dummyLabel = new JLabel("                         ");
  private JLabel dummyLabel2 = new JLabel("                         ");
  private JButton ok = new JButton("Ok");
  private JButton cancel = new JButton("Cancel");
  private JTextField textField1 = new JTextField(10);
  private JTextField textField2 = new JTextField(10);
  private JTextField textField3 = new JTextField(10);
  private JTextField textField4 = new JTextField(10);
  private JPanel panel1 = new JPanel();
  private JPanel panel2 = new JPanel();
  private Container con = getContentPane();
  Color color = new Color(40, 100, 28);
  int a = 0;
  Font font1 = new Font("Serif", 1, 38);
  Font font2 = new Font("Serif", 0, 32);
  Font font3 = new Font("Serif", 0, 30);
  
  public PlayerScreen()
  {
    this.prompt.setFont(this.font1);
    this.inputLabel1.setFont(this.font2);
    this.textField1.setFont(this.font3);
    this.inputLabel2.setFont(this.font2);
    this.inputLabel3.setFont(this.font2);
    this.inputLabel4.setFont(this.font2);
    this.textField2.setFont(this.font3);
    this.textField3.setFont(this.font3);
    this.textField4.setFont(this.font3);
    
    this.prompt.setForeground(Color.black);
    this.inputLabel1.setForeground(Color.black);
    this.textField1.setForeground(Color.black);
    this.inputLabel2.setForeground(Color.black);
    this.inputLabel3.setForeground(Color.black);
    this.inputLabel4.setForeground(Color.black);
    this.textField2.setForeground(Color.black);
    this.textField3.setForeground(Color.black);
    this.textField4.setForeground(Color.black);
    
    setLayout(new FlowLayout());
    
    this.con.add(this.panel1);
    this.con.add(this.panel2);
    
    this.panel1.setLayout(new FlowLayout());
    this.panel1.add(new DisplayImage("Dominion-header.jpg"));
    
    this.panel2.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    c.fill = 2;
    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = 2;
    c.insets = new Insets(25, 0, 0, 0);
    this.panel2.add(this.prompt, c);
    
    c.gridwidth = 1;
    c.gridy = 1;
    c.insets = new Insets(40, 0, 0, 20);
    this.panel2.add(this.inputLabel1, c);
    
    c.gridx = 1;
    this.panel2.add(this.textField1, c);
    
    c.insets = new Insets(20, 0, 0, 20);
    c.gridy = 2;
    c.gridx = 0;
    this.panel2.add(this.inputLabel2, c);
    
    c.gridx = 1;
    this.panel2.add(this.textField2, c);
    
    c.gridy = 3;
    c.gridx = 0;
    this.panel2.add(this.inputLabel3, c);
    
    c.gridx = 1;
    this.panel2.add(this.textField3, c);
    
    c.gridy = 4;
    c.gridx = 0;
    c.insets = new Insets(20, 0, 0, 20);
    this.panel2.add(this.inputLabel4, c);
    
    c.gridx = 1;
    this.panel2.add(this.textField4, c);
    
    c.gridy = 5;
    c.gridx = 0;
    c.insets = new Insets(40, 80, 0, 80);
    this.panel2.add(this.ok, c);
    
    c.gridx = 1;
    c.insets = new Insets(40, 100, 0, 100);
    this.panel2.add(this.cancel, c);
    
    this.con.setBackground(this.color);
    this.panel1.setBackground(this.color);
    this.panel2.setBackground(this.color);
    
    this.ok.addActionListener(this);
    this.cancel.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent event)
  {
    Object source = event.getSource();
    if (source == this.ok) {
      getPlayerData();
    } else {
      dispose();
    }
  }
  
  public void getPlayerData()
  {
    String name1 = this.textField1.getText();
    String name2 = this.textField2.getText();
    String name3 = this.textField3.getText();
    String name4 = this.textField4.getText();
    int length1 = name1.length();
    int length2 = name2.length();
    int length3 = name3.length();
    int length4 = name4.length();
    int b = 0;int c = 0;int d = 0;int e = 0;int f = 0;
    
    this.a = 0;
    if (length1 == 0)
    {
      this.a += 1;
      b++;
    }
    if (length2 == 0)
    {
      this.a += 1;
      c++;
    }
    if (length3 == 0)
    {
      this.a += 1;
      d++;
    }
    if (length4 == 0)
    {
      this.a += 1;
      e++;
    }
    if (this.a > 2) {
      JOptionPane.showMessageDialog(null, "You must enter at least 2 Players", "Error", 0);
    }
    if (this.a <= 2)
    {
      Players[] player = new Players[4 - this.a];
      for (int counter = 0; counter < 4 - this.a; counter++) {
        player[counter] = new Players();
      }
      for (int g = 0; g < 4; g++)
      {
        if (b == 0)
        {
          player[f].name = name1;
          b++;
          f++;
        }
        if (c == 0)
        {
          player[f].name = name2;
          c++;
          f++;
        }
        if (d == 0)
        {
          player[f].setName(name3);
          d++;
          f++;
        }
        if (e == 0)
        {
          player[f].setName(name4);
          e++;
          f++;
        }
      }
      frame.dispose();
      RunNewGame.AfterPlayerScreen(player);
    }
  }
  
  public static void main()
  {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int)screenSize.getWidth();
    int height = (int)screenSize.getHeight();
    int WIDTH = 650;
    int HEIGHT = 700;
    frame.setSize(650, 700);
    frame.setVisible(true);
    frame.setLocation(width / 2 - 325, height / 2 - 350);
  }
}
