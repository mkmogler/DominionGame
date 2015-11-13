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

public class OrganizeBoard2
  extends JFrame
  implements MouseListener, ActionListener
{
  public Card[] cards = Cards.main();
  JLabel name = new JLabel("");
  JLabel buys = new JLabel("Buys: ");
  JLabel action = new JLabel("Actions: ");
  JLabel money = new JLabel("Money: ");
  static int[] order;
  static int turn;
  static PlayerBoard playerBoard;
  static Board[][] board;
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
  private JPanel[] inner = new JPanel[30];
  static int[] cardsList = ;
//Int default value?
  Color color = new Color(40, 100, 28);
  private Container con = getContentPane();
  Font font3 = new Font("Serif", 0, 20);
  
  public OrganizeBoard2()
  {
    this.con.setBackground(this.color);
    
    setLayout(new GridBagLayout());
    
    this.panel1.add(new DisplayImage("vs" + this.cards[board[0][0].card.intValue()].img));
    this.panel2.add(new DisplayImage("vs" + this.cards[board[1][0].card.intValue()].img));
    this.panel3.add(new DisplayImage("vs" + this.cards[board[2][0].card.intValue()].img));
    this.panel4.add(new DisplayImage("vs" + this.cards[board[3][0].card.intValue()].img));
    this.panel5.add(new DisplayImage("vs" + this.cards[board[0][1].card.intValue()].img));
    this.panel6.add(new DisplayImage("vs" + this.cards[board[1][1].card.intValue()].img));
    this.panel7.add(new DisplayImage("vs" + this.cards[board[2][1].card.intValue()].img));
    this.panel8.add(new DisplayImage("vs" + this.cards[board[0][2].card.intValue()].img));
    this.panel9.add(new DisplayImage("vs" + this.cards[board[1][2].card.intValue()].img));
    this.panel10.add(new DisplayImage("vs" + this.cards[board[2][2].card.intValue()].img));
    this.panel11.add(new DisplayImage("vs" + this.cards[board[3][2].card.intValue()].img));
    this.panel12.add(new DisplayImage("vs" + this.cards[board[4][2].card.intValue()].img));
    this.panel13.add(new DisplayImage("vs" + this.cards[board[0][3].card.intValue()].img));
    this.panel14.add(new DisplayImage("vs" + this.cards[board[1][3].card.intValue()].img));
    this.panel15.add(new DisplayImage("vs" + this.cards[board[2][3].card.intValue()].img));
    this.panel16.add(new DisplayImage("vs" + this.cards[board[3][3].card.intValue()].img));
    this.panel17.add(new DisplayImage("vs" + this.cards[board[4][3].card.intValue()].img));
    for (int a = 0; a < 30; a++)
    {
      this.inner[a] = new JPanel();
      
      this.inner[a].setBackground(this.color);
      this.inner[a].add(this.prompt);
    }
    this.inner[0].add(new DisplayImage(this.cards[3].img));
    this.inner[1].add(new DisplayImage(this.cards[4].img));
    this.inner[2].add(new DisplayImage(this.cards[5].img));
    this.inner[3].add(new DisplayImage(this.cards[6].img));
    this.inner[4].add(new DisplayImage(this.cards[0].img));
    this.inner[5].add(new DisplayImage(this.cards[1].img));
    this.inner[6].add(new DisplayImage(this.cards[2].img));
    this.inner[7].add(new DisplayImage(this.cards[board[0][2].card.intValue()].img));
    this.inner[8].add(new DisplayImage(this.cards[board[1][2].card.intValue()].img));
    this.inner[9].add(new DisplayImage(this.cards[board[2][2].card.intValue()].img));
    this.inner[10].add(new DisplayImage(this.cards[board[3][2].card.intValue()].img));
    this.inner[11].add(new DisplayImage(this.cards[board[4][2].card.intValue()].img));
    this.inner[12].add(new DisplayImage(this.cards[board[0][3].card.intValue()].img));
    this.inner[13].add(new DisplayImage(this.cards[board[1][3].card.intValue()].img));
    this.inner[14].add(new DisplayImage(this.cards[board[2][3].card.intValue()].img));
    this.inner[15].add(new DisplayImage(this.cards[board[3][3].card.intValue()].img));
    this.inner[16].add(new DisplayImage(this.cards[board[4][3].card.intValue()].img));
    
    this.discard.setBackground(this.color);
    this.draw.setBackground(this.color);
    this.draw.add(new DisplayImage("back.jpg"));
    
    this.panel1.setBackground(this.color);
    this.panel2.setBackground(this.color);
    this.panel3.setBackground(this.color);
    this.panel4.setBackground(this.color);
    this.panel5.setBackground(this.color);
    this.panel6.setBackground(this.color);
    this.panel7.setBackground(this.color);
    this.panel8.setBackground(this.color);
    this.panel9.setBackground(this.color);
    this.panel10.setBackground(this.color);
    this.panel11.setBackground(this.color);
    this.panel12.setBackground(this.color);
    this.panel13.setBackground(this.color);
    this.panel14.setBackground(this.color);
    this.panel15.setBackground(this.color);
    this.panel16.setBackground(this.color);
    this.panel17.setBackground(this.color);
    
    this.hand1.setBackground(this.color);
    this.hand1.add(new DisplayImage("vs" + this.cards[playerBoard.player[order[turn]].hand[0].intValue()].img));
    this.hand2.setBackground(this.color);
    this.hand2.add(new DisplayImage("vs" + this.cards[playerBoard.player[order[turn]].hand[1].intValue()].img));
    this.hand3.setBackground(this.color);
    this.hand3.add(new DisplayImage("vs" + this.cards[playerBoard.player[order[turn]].hand[2].intValue()].img));
    this.hand4.setBackground(this.color);
    this.hand4.add(new DisplayImage("vs" + this.cards[playerBoard.player[order[turn]].hand[3].intValue()].img));
    this.hand5.setBackground(this.color);
    this.hand5.add(new DisplayImage("vs" + this.cards[playerBoard.player[order[turn]].hand[4].intValue()].img));
    
    this.played1.setBackground(this.color);
    this.played2.setBackground(this.color);
    this.played3.setBackground(this.color);
    this.played4.setBackground(this.color);
    this.played5.setBackground(this.color);
    
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
    this.c.insets = new Insets(40, 5, 40, 5);
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
    this.c.gridy = 3;
    this.c.gridwidth = 1;
    this.c.insets = new Insets(5, 5, 0, 5);
    add(this.played1, this.c);
    this.played1.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 3;
    this.c.gridy = 3;
    this.c.gridwidth = 1;
    
    add(this.played2, this.c);
    this.played2.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 4;
    this.c.gridy = 3;
    this.c.gridwidth = 1;
    
    add(this.played3, this.c);
    this.played3.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 5;
    this.c.gridy = 3;
    this.c.gridwidth = 1;
    
    add(this.played4, this.c);
    this.played4.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 6;
    this.c.gridy = 3;
    this.c.gridwidth = 1;
    
    add(this.played5, this.c);
    this.played5.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 8;
    this.c.gridy = 3;
    this.c.gridwidth = 1;
    this.c.ipadx = 20;
    this.c.ipady = 20;
    this.c.insets = new Insets(100, 200, 10, 10);
    add(this.buyplay, this.c);
    this.buyplay.addActionListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 8;
    this.c.gridy = 4;
    this.c.gridwidth = 1;
    this.c.ipadx = 20;
    this.c.ipady = 20;
    this.c.insets = new Insets(0, 200, 10, 10);
    add(this.endturn, this.c);
    this.endturn.addActionListener(this);
    
    this.c.gridx = 7;
    this.c.gridy = 0;
    this.c.gridwidth = 6;
    this.c.gridheight = 4;
    this.c.ipadx = 296;
    this.c.ipady = 473;
    this.c.insets = new Insets(10, 200, 10, 30);
    add(this.bigcard, this.c);
    this.bigcard.setLayout(new FlowLayout());
    this.bigcard.add(this.prompt);
    this.bigcard.setBackground(this.color);
    
    this.c.fill = 2;
    this.c.gridx = 0;
    this.c.gridy = 4;
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
    this.c.gridy = 4;
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
    this.c.gridy = 3;
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
    this.c.gridy = 3;
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
  
  public void mousePressed(MouseEvent e)
  {
    this.prompt.setText(" ");
    Object source = e.getSource();
    if (source == this.panel1) {
      this.bigcard = this.inner[0];
    }
    if (source == this.panel2) {
      this.bigcard = this.inner[1];
    }
    if (source == this.panel3)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[2].setVisible(true);
    }
    if (source == this.panel4)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[3].setVisible(true);
    }
    if (source == this.panel5)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[4].setVisible(true);
    }
    if (source == this.panel6)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[5].setVisible(true);
    }
    if (source == this.panel7)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[6].setVisible(true);
    }
    if (source == this.panel8)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[7].setVisible(true);
    }
    if (source == this.panel9)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[8].setVisible(true);
    }
    if (source == this.panel10)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[9].setVisible(true);
    }
    if (source == this.panel11)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[10].setVisible(true);
    }
    if (source == this.panel12)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[11].setVisible(true);
    }
    if (source == this.panel13)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[12].setVisible(true);
    }
    if (source == this.panel14)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[13].setVisible(true);
    }
    if (source == this.panel15)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[14].setVisible(true);
    }
    if (source == this.panel16)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[15].setVisible(true);
    }
    if (source == this.panel17)
    {
      for (int a = 0; a < 30; a++) {
        this.inner[a].setVisible(false);
      }
      this.inner[16].setVisible(true);
    }
  }
  
  public void mouseReleased(MouseEvent e) {}
  
  public void actionPerformed(ActionEvent event) {}
  
  public static void main(Board[][] bBoard, Players[] p, int[] o, int t)
  {
    PlayerBoard pB = new PlayerBoard();
    pB.player = p;
    board = bBoard;
    playerBoard = pB;
    order = o;
    turn = t;
    
    OrganizeBoard2 select = new OrganizeBoard2();
    int WIDTH = 1300;
    int HEIGHT = 750;
    select.setSize(1300, 750);
    select.setVisible(true);
  }
}
