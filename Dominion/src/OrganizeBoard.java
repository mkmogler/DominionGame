import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrganizeBoard
  extends JFrame
  implements MouseListener, ActionListener
{
  public Card[] cards;
  JLabel name = new JLabel("");
  JLabel buys = new JLabel("Buys: ");
  JLabel action = new JLabel("Actions: ");
  JLabel money = new JLabel("Money: ");
  GridBagConstraints c = new GridBagConstraints();
  private JLabel prompt = new JLabel("");
  private JPanel panel1 = new JPanel();
  private JPanel panel2 = new JPanel();
  private JPanel panel3 = new JPanel();
  private JPanel panel4 = new JPanel();
  private JPanel panel5 = new JPanel();
  private JPanel panel6 = new JPanel();
  private JPanel panel7 = new JPanel();
  private JPanel panel8 = new JPanel();
  private JPanel panel9 = new JPanel();
  private JPanel panel10 = new JPanel();
  private JPanel panel11 = new JPanel();
  private JPanel panel12 = new JPanel();
  private JPanel panel13 = new JPanel();
  private JPanel panel14 = new JPanel();
  private JPanel panel15 = new JPanel();
  private JPanel panel16 = new JPanel();
  private JPanel panel17 = new JPanel();
  private JPanel panel18 = new JPanel();
  private JPanel panel19 = new JPanel();
  private JPanel panel20 = new JPanel();
  private JPanel panel21 = new JPanel();
  private JPanel hand1 = new JPanel();
  private JPanel hand2 = new JPanel();
  private JPanel hand3 = new JPanel();
  private JPanel hand4 = new JPanel();
  private JPanel hand5 = new JPanel();
  private JPanel played1 = new JPanel();
  private JPanel played2 = new JPanel();
  private JPanel played3 = new JPanel();
  private JPanel played4 = new JPanel();
  private JPanel played5 = new JPanel();
  private JPanel info = new JPanel();
  private JPanel discard = new JPanel();
  private JPanel draw = new JPanel();
  JButton buyplay = new JButton(" Buy/Play ");
  JButton endturn = new JButton(" End Turn ");
  Card[] card = Cards.main();
  private JPanel bigcard = new JPanel();
  static int[] cardsList = ;
  //Int default value?
  Color color = new Color(40, 100, 28);
  private Container con = getContentPane();
  Font font3 = new Font("Serif", 0, 20);
  
  public OrganizeBoard()
  {
    this.con.setBackground(this.color);
    
    setLayout(new GridBagLayout());
    
    this.c.fill = 2;
    this.c.gridx = 0;
    this.c.gridy = 0;
    this.c.ipadx = 70;
    this.c.ipady = 112;
    this.c.gridwidth = 1;
    this.c.insets = new Insets(20, 5, 0, 5);
    add(this.panel1, this.c);
    this.panel1.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 1;
    this.c.gridy = 0;
    this.c.gridwidth = 1;
    
    add(this.panel2, this.c);
    this.panel2.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 2;
    this.c.gridy = 0;
    this.c.gridwidth = 1;
    add(this.panel3, this.c);
    this.panel3.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 3;
    this.c.gridy = 0;
    this.c.gridwidth = 1;
    add(this.panel4, this.c);
    this.panel4.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 4;
    this.c.gridy = 0;
    this.c.gridwidth = 1;
    
    add(this.panel5, this.c);
    this.panel5.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 5;
    this.c.gridy = 0;
    this.c.gridwidth = 1;
    
    add(this.panel6, this.c);
    this.panel6.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 6;
    this.c.gridy = 0;
    this.c.gridwidth = 1;
    
    add(this.panel7, this.c);
    this.panel7.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 0;
    this.c.gridy = 1;
    this.c.gridwidth = 1;
    this.c.insets = new Insets(5, 5, 0, 5);
    add(this.panel8, this.c);
    this.panel8.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 1;
    this.c.gridy = 1;
    this.c.gridwidth = 1;
    
    add(this.panel9, this.c);
    this.panel9.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 2;
    this.c.gridy = 1;
    this.c.gridwidth = 1;
    
    add(this.panel10, this.c);
    this.panel10.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 3;
    this.c.gridy = 1;
    this.c.ipadx = 70;
    this.c.ipady = 112;
    this.c.gridwidth = 1;
    
    add(this.panel11, this.c);
    this.panel11.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 4;
    this.c.gridy = 1;
    this.c.gridwidth = 1;
    
    add(this.panel12, this.c);
    this.panel12.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 0;
    this.c.gridy = 2;
    this.c.gridwidth = 1;
    add(this.panel13, this.c);
    this.panel13.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 1;
    this.c.gridy = 2;
    this.c.gridwidth = 1;
    add(this.panel14, this.c);
    this.panel14.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 2;
    this.c.gridy = 2;
    this.c.gridwidth = 1;
    
    add(this.panel15, this.c);
    this.panel15.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 3;
    this.c.gridy = 2;
    this.c.gridwidth = 1;
    
    add(this.panel16, this.c);
    this.panel16.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 4;
    this.c.gridy = 2;
    this.c.gridwidth = 1;
    
    add(this.panel17, this.c);
    this.panel17.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 5;
    this.c.gridy = 1;
    this.c.gridwidth = 2;
    this.c.gridheight = 2;
    this.c.ipadx = 1;
    this.c.ipady = 112;
    add(this.info, this.c);
    this.info.setLayout(new GridLayout(4, 0));
    this.name.setFont(this.font3);
    this.money.setFont(this.font3);
    this.buys.setFont(this.font3);
    this.action.setFont(this.font3);
    this.info.add(this.name);
    this.info.add(this.money);
    this.info.add(this.buys);
    this.info.add(this.action);
    this.info.setBackground(this.color);
    this.name.setForeground(Color.black);
    this.money.setForeground(Color.black);
    this.buys.setForeground(Color.black);
    this.action.setForeground(Color.black);
    
    this.c.fill = 2;
    this.c.gridx = 7;
    this.c.gridy = 1;
    this.c.gridwidth = 1;
    this.c.gridheight = 1;
    this.c.ipadx = 1;
    this.c.ipady = 112;
    this.c.insets = new Insets(10, 10, 0, 10);
    add(this.discard, this.c);
    this.discard.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 7;
    this.c.gridy = 2;
    this.c.gridwidth = 1;
    this.c.gridheight = 1;
    this.c.ipadx = 1;
    this.c.ipady = 112;
    this.c.insets = new Insets(10, 10, 0, 10);
    add(this.draw, this.c);
    
    this.c.fill = 2;
    this.c.gridx = 2;
    this.c.gridy = 4;
    this.c.ipadx = 1;
    this.c.ipady = 112;
    this.c.gridwidth = 1;
    this.c.gridheight = 1;
    this.c.insets = new Insets(40, 5, 0, 5);
    add(this.hand1, this.c);
    this.hand1.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 3;
    this.c.gridy = 4;
    this.c.gridwidth = 1;
    
    add(this.hand2, this.c);
    this.hand2.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 4;
    this.c.gridy = 4;
    this.c.gridwidth = 1;
    add(this.hand3, this.c);
    this.hand3.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 5;
    this.c.gridy = 4;
    this.c.gridwidth = 1;
    add(this.hand4, this.c);
    this.hand4.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 6;
    this.c.gridy = 4;
    this.c.gridwidth = 1;
    
    add(this.hand5, this.c);
    this.hand5.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 2;
    this.c.gridy = 5;
    this.c.gridwidth = 1;
    this.c.insets = new Insets(5, 5, 0, 5);
    add(this.played1, this.c);
    this.played1.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 3;
    this.c.gridy = 5;
    this.c.gridwidth = 1;
    
    add(this.played2, this.c);
    this.played2.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 4;
    this.c.gridy = 5;
    this.c.gridwidth = 1;
    
    add(this.played3, this.c);
    this.played3.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 5;
    this.c.gridy = 5;
    this.c.gridwidth = 1;
    
    add(this.played4, this.c);
    this.played4.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 6;
    this.c.gridy = 5;
    this.c.gridwidth = 1;
    
    add(this.played5, this.c);
    this.played5.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 8;
    this.c.gridy = 4;
    this.c.gridwidth = 1;
    this.c.ipadx = 20;
    this.c.ipady = 20;
    this.c.insets = new Insets(80, 200, 10, 10);
    add(this.buyplay, this.c);
    this.buyplay.addActionListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 8;
    this.c.gridy = 5;
    this.c.gridwidth = 1;
    this.c.ipadx = 20;
    this.c.ipady = 20;
    this.c.insets = new Insets(0, 200, 10, 10);
    add(this.endturn, this.c);
    this.endturn.addActionListener(this);
    
    this.c.gridx = 8;
    this.c.gridy = 0;
    this.c.gridwidth = 5;
    this.c.gridheight = 6;
    this.c.ipadx = 296;
    this.c.ipady = 473;
    this.c.insets = new Insets(10, 200, 10, 10);
    add(this.bigcard, this.c);
    this.bigcard.setLayout(new FlowLayout());
    this.bigcard.add(this.prompt);
    this.bigcard.setBackground(this.color);
    
    this.c.fill = 2;
    this.c.gridx = 0;
    this.c.gridy = 5;
    this.c.ipadx = 73;
    this.c.ipady = 41;
    this.c.gridwidth = 2;
    this.c.gridheight = 1;
    this.c.insets = new Insets(40, 0, 0, 0);
    add(this.panel18, this.c);
    this.panel18.add(new DisplayImage("left-arrow-right-md.jpg"));
    this.panel18.setBackground(this.color);
    this.panel18.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 7;
    this.c.gridy = 5;
    this.c.ipadx = 73;
    this.c.ipady = 41;
    this.c.gridwidth = 1;
    this.c.gridheight = 1;
    this.c.insets = new Insets(40, 50, 0, 0);
    add(this.panel19, this.c);
    this.panel19.add(new DisplayImage("red-arrow-right-md.jpg"));
    this.panel19.setBackground(this.color);
    this.panel19.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 0;
    this.c.gridy = 4;
    this.c.ipadx = 73;
    this.c.ipady = 41;
    this.c.gridwidth = 2;
    this.c.gridheight = 1;
    this.c.insets = new Insets(40, 0, 0, 0);
    add(this.panel21, this.c);
    this.panel21.add(new DisplayImage("left-arrow-right-md.jpg"));
    this.panel21.setBackground(this.color);
    this.panel21.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 7;
    this.c.gridy = 4;
    this.c.ipadx = 73;
    this.c.ipady = 41;
    this.c.gridwidth = 1;
    this.c.gridheight = 1;
    this.c.insets = new Insets(40, 50, 0, 0);
    add(this.panel20, this.c);
    this.panel20.add(new DisplayImage("red-arrow-right-md.jpg"));
    this.panel20.setBackground(this.color);
    this.panel20.addMouseListener(this);
  }
  
  public void mouseClicked(MouseEvent e) {}
  
  public void mouseEntered(MouseEvent e) {}
  
  public void mouseExited(MouseEvent e) {}
  
  public void mousePressed(MouseEvent e) {}
  
  public void mouseReleased(MouseEvent e) {}
  
  public void actionPerformed(ActionEvent event) {}
  
  public static void main(String[] args)
  {
    OrganizeBoard select = new OrganizeBoard();
    int WIDTH = 1300;
    int HEIGHT = 750;
    select.setSize(1300, 750);
    select.setVisible(true);
  }
}
