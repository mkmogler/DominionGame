import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrganizeBoardSelect
  extends JFrame
  implements MouseListener, ActionListener
{
  public Card[] cards;
  private JLabel prompt = new JLabel("");
  private JLabel prompt1 = new JLabel("X");
  Integer cardSelected;
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
  JPanel[] inner1 = new JPanel[32];
  JPanel[] inner2 = new JPanel[32];
  JPanel[] inner3 = new JPanel[32];
  JPanel[] inner4 = new JPanel[32];
  JPanel[] inner5 = new JPanel[32];
  static Integer[] selected = new Integer[10];
  Boolean i1;
  Boolean i2;
  Boolean i3;
  Boolean i4;
  Boolean i5;
  int z = 0;
  JPanel bottom1 = new JPanel();
  JPanel bottom2 = new JPanel();
  JPanel bottom3 = new JPanel();
  JPanel bottom4 = new JPanel();
  JPanel bottom5 = new JPanel();
  private JButton select = new JButton("  Select  ");
  private JButton remove = new JButton("  Undo  ");
  private JButton ok = new JButton("  Ok  ");
  Card[] card = Cards.main();
  private JPanel bigcard = new JPanel();
  private Container con = getContentPane();
  Color color = new Color(40, 100, 28);
  JPanel[] temp1 = new JPanel[32];
  JPanel[] temp2 = new JPanel[32];
  JPanel[] temp3 = new JPanel[32];
  JPanel[] temp4 = new JPanel[32];
  JPanel[] temp5 = new JPanel[32];
  int x = 1;
  int y = 1;
  GridBagConstraints c = new GridBagConstraints();
  static int[] cardsList = AlphabetizeCards();
  static int[] cardsShown = { 0, 31, 14, 7, 10, 8 };
  
  public OrganizeBoardSelect()
  {
    this.inner1[1] = new JPanel();
    this.inner2[1] = new JPanel();
    this.inner3[1] = new JPanel();
    this.inner4[1] = new JPanel();
    this.inner5[1] = new JPanel();
    
    this.inner1[1].add(new DisplayImage(this.card[cardsShown[this.x]].img));
    this.inner2[1].add(new DisplayImage(this.card[cardsShown[(this.x + 1)]].img));
    this.inner3[1].add(new DisplayImage(this.card[cardsShown[(this.x + 2)]].img));
    this.inner4[1].add(new DisplayImage(this.card[cardsShown[(this.x + 3)]].img));
    this.inner5[1].add(new DisplayImage(this.card[cardsShown[(this.x + 4)]].img));
    
    this.bigcard.add(this.inner1[1]);
    this.bigcard.add(this.inner2[1]);
    this.bigcard.add(this.inner3[1]);
    this.bigcard.add(this.inner4[1]);
    this.bigcard.add(this.inner5[1]);
    
    this.inner1[1].setVisible(false);
    this.inner2[1].setVisible(false);
    this.inner3[1].setVisible(false);
    this.inner4[1].setVisible(false);
    this.inner5[1].setVisible(false);
    for (int a = 2; a < 25; a++)
    {
      this.inner1[a] = new JPanel();
      this.bigcard.add(this.inner1[a]);
      this.inner1[a].setVisible(false);
      this.inner1[a].setBackground(this.color);
    }
    for (int a = 2; a < 25; a++)
    {
      this.inner2[a] = new JPanel();
      this.bigcard.add(this.inner2[a]);
      this.inner2[a].setVisible(false);
      this.inner2[a].setBackground(this.color);
    }
    for (int a = 2; a < 25; a++)
    {
      this.inner3[a] = new JPanel();
      this.bigcard.add(this.inner3[a]);
      this.inner3[a].setVisible(false);
      this.inner3[a].setBackground(this.color);
    }
    for (int a = 2; a < 25; a++)
    {
      this.inner4[a] = new JPanel();
      this.bigcard.add(this.inner4[a]);
      this.inner4[a].setVisible(false);
      this.inner4[a].setBackground(this.color);
    }
    for (int a = 2; a < 25; a++)
    {
      this.inner5[a] = new JPanel();
      this.bigcard.add(this.inner5[a]);
      this.inner5[a].setVisible(false);
      this.inner5[a].setBackground(this.color);
    }
    this.con.setBackground(this.color);
    
    setLayout(new GridBagLayout());
    
    this.c.fill = 2;
    this.c.gridx = 0;
    this.c.gridy = 0;
    this.c.ipadx = 126;
    this.c.ipady = 195;
    this.c.gridwidth = 1;
    this.c.insets = new Insets(20, 5, 0, 5);
    add(this.panel1, this.c);
    
    this.c.fill = 2;
    this.c.gridx = 1;
    this.c.gridy = 0;
    this.c.gridwidth = 1;
    
    add(this.panel2, this.c);
    
    this.c.fill = 2;
    this.c.gridx = 2;
    this.c.gridy = 0;
    this.c.gridwidth = 1;
    add(this.panel3, this.c);
    
    this.c.fill = 2;
    this.c.gridx = 3;
    this.c.gridy = 0;
    this.c.gridwidth = 1;
    add(this.panel4, this.c);
    
    this.c.fill = 2;
    this.c.gridx = 4;
    this.c.gridy = 0;
    this.c.gridwidth = 1;
    
    add(this.panel5, this.c);
    
    this.c.fill = 2;
    this.c.gridx = 0;
    this.c.gridy = 1;
    this.c.gridwidth = 1;
    this.c.insets = new Insets(2, 5, 2, 5);
    add(this.panel6, this.c);
    
    this.c.fill = 2;
    this.c.gridx = 1;
    this.c.gridy = 1;
    this.c.gridwidth = 1;
    
    add(this.panel7, this.c);
    
    this.c.fill = 2;
    this.c.gridx = 2;
    this.c.gridy = 1;
    this.c.gridwidth = 1;
    
    add(this.panel8, this.c);
    
    this.c.fill = 2;
    this.c.gridx = 3;
    this.c.gridy = 1;
    this.c.gridwidth = 1;
    
    add(this.panel9, this.c);
    
    this.c.fill = 2;
    this.c.gridx = 4;
    this.c.gridy = 1;
    this.c.gridwidth = 1;
    
    add(this.panel10, this.c);
    
    this.c.gridx = 5;
    this.c.gridy = 0;
    this.c.gridwidth = 1;
    this.c.gridheight = 2;
    this.c.ipadx = 10;
    this.c.ipady = 20;
    this.c.insets = new Insets(10, 10, 10, 10);
    add(this.ok, this.c);
    this.ok.addActionListener(this);
    
    this.c.gridx = 6;
    this.c.gridy = 0;
    this.c.gridwidth = 3;
    this.c.gridheight = 2;
    this.c.ipadx = 296;
    this.c.ipady = 473;
    this.c.insets = new Insets(10, 10, 10, 10);
    add(this.bigcard, this.c);
    this.bigcard.setLayout(new FlowLayout());
    this.bigcard.add(this.prompt);
    this.bigcard.setBackground(this.color);
    
    this.c.fill = 2;
    this.c.gridx = 0;
    this.c.gridy = 2;
    this.c.ipadx = 73;
    this.c.ipady = 41;
    this.c.gridwidth = 1;
    this.c.insets = new Insets(0, 0, 0, 0);
    add(this.panel17, this.c);
    this.panel17.add(new DisplayImage("left-arrow-right-md.jpg"));
    this.panel17.setBackground(this.color);
    this.panel17.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 1;
    this.c.gridy = 2;
    this.c.gridwidth = 1;
    this.c.ipadx = 126;
    this.c.ipady = 195;
    this.c.insets = new Insets(5, 0, 5, 5);
    add(this.panel12, this.c);
    this.panel12.addMouseListener(this);
    this.panel12.setBackground(this.color);
    this.panel12.add(this.bottom1);
    this.bottom1.add(new DisplayImage("small" + this.card[cardsShown[1]].img));
    this.bottom1.setBackground(this.color);
    this.panel12.add(this.prompt);
    for (int a = 0; a < 25; a++)
    {
      this.temp1[a] = new JPanel();
      this.panel12.add(this.temp1[a]);
      this.temp1[a].setVisible(false);
      this.temp1[a].setBackground(this.color);
    }
    this.c.fill = 2;
    this.c.gridx = 2;
    this.c.gridy = 2;
    this.c.gridwidth = 1;
    add(this.panel13, this.c);
    this.panel13.setBackground(this.color);
    this.panel13.addMouseListener(this);
    this.panel13.add(this.bottom2);
    this.bottom2.add(new DisplayImage("small" + this.card[cardsShown[2]].img));
    this.bottom2.setBackground(this.color);
    for (int a = 0; a < 25; a++)
    {
      this.temp2[a] = new JPanel();
      this.panel13.add(this.temp2[a]);
      this.temp2[a].setVisible(false);
      this.temp2[a].setBackground(this.color);
    }
    this.c.fill = 2;
    this.c.gridx = 3;
    this.c.gridy = 2;
    this.c.gridwidth = 1;
    add(this.panel14, this.c);
    this.panel14.setBackground(this.color);
    this.panel14.addMouseListener(this);
    this.panel14.add(this.bottom3);
    this.bottom3.add(new DisplayImage("small" + this.card[cardsShown[3]].img));
    this.bottom3.setBackground(this.color);
    for (int a = 0; a < 25; a++)
    {
      this.temp3[a] = new JPanel();
      this.panel14.add(this.temp3[a]);
      this.temp3[a].setVisible(false);
      this.temp3[a].setBackground(this.color);
    }
    this.c.fill = 2;
    this.c.gridx = 4;
    this.c.gridy = 2;
    this.c.gridwidth = 1;
    add(this.panel15, this.c);
    this.panel15.setBackground(this.color);
    this.panel15.addMouseListener(this);
    this.panel15.add(this.bottom4);
    this.bottom4.add(new DisplayImage("small" + this.card[cardsShown[4]].img));
    this.bottom4.setBackground(this.color);
    for (int a = 0; a < 25; a++)
    {
      this.temp4[a] = new JPanel();
      this.panel15.add(this.temp4[a]);
      this.temp4[a].setVisible(false);
      this.temp4[a].setBackground(this.color);
    }
    this.c.fill = 2;
    this.c.gridx = 5;
    this.c.gridy = 2;
    this.c.gridwidth = 1;
    add(this.panel16, this.c);
    this.panel16.setBackground(this.color);
    this.panel16.addMouseListener(this);
    this.panel16.add(this.bottom5);
    this.bottom5.add(new DisplayImage("small" + this.card[cardsShown[5]].img));
    this.bottom5.setBackground(this.color);
    for (int a = 0; a < 25; a++)
    {
      this.temp5[a] = new JPanel();
      this.panel16.add(this.temp5[a]);
      this.temp5[a].setVisible(false);
      this.temp5[a].setBackground(this.color);
    }
    this.c.fill = 2;
    this.c.gridx = 6;
    this.c.gridy = 2;
    this.c.ipadx = 73;
    this.c.ipady = 41;
    this.c.gridwidth = 1;
    this.c.insets = new Insets(0, 20, 0, 0);
    add(this.panel18, this.c);
    this.panel18.add(new DisplayImage("red-arrow-right-md.jpg"));
    this.panel18.setBackground(this.color);
    this.panel18.addMouseListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 7;
    this.c.gridy = 2;
    this.c.ipadx = 20;
    this.c.ipady = 20;
    this.c.gridwidth = 1;
    this.c.insets = new Insets(10, 10, 20, 10);
    add(this.select, this.c);
    this.select.addActionListener(this);
    
    this.c.fill = 2;
    this.c.gridx = 8;
    this.c.gridy = 2;
    this.c.ipadx = 20;
    this.c.ipady = 20;
    this.c.gridwidth = 1;
    this.c.insets = new Insets(10, 10, 20, 10);
    add(this.remove, this.c);
    this.remove.addActionListener(this);
  }
  
  public void mouseClicked(MouseEvent e) {}
  
  public void mouseEntered(MouseEvent e) {}
  
  public void mouseExited(MouseEvent e) {}
  
  public void mousePressed(MouseEvent e)
  {
    Object source = e.getSource();
    this.bigcard.setVisible(true);
    if (source == this.panel17)
    {
      if (cardsShown[0] == 1)
      {
        this.inner1[this.x].setVisible(false);
        this.inner2[this.x].setVisible(false);
        this.inner3[this.x].setVisible(false);
        this.inner4[this.x].setVisible(false);
        this.inner5[this.x].setVisible(false);
        
        cardsShown[0] -= 1;
        int[] Array = { cardsShown[0], cardsList[cardsShown[0]], cardsList[(cardsShown[0] + 1)], cardsList[(cardsShown[0] + 2)], 
          cardsList[(cardsShown[0] + 3)], cardsList[(cardsShown[0] + 4)] };
        cardsShown = Array;
        this.x -= 1;
        
        this.temp1[(this.x + 1)].setVisible(false);
        this.bottom1.setVisible(true);
        this.prompt.setText(" ");
        
        this.temp2[(this.x + 1)].setVisible(false);
        this.bottom2.setVisible(true);
        this.prompt.setText(" ");
        
        this.temp3[(this.x + 1)].setVisible(false);
        this.bottom3.setVisible(true);
        this.prompt.setText(" ");
        
        this.temp4[(this.x + 1)].setVisible(false);
        this.bottom4.setVisible(true);
        this.prompt.setText(" ");
        
        this.temp5[(this.x + 1)].setVisible(false);
        this.bottom5.setVisible(true);
        this.prompt.setText(" ");
        
        this.y += 1;
      }
      if (cardsShown[0] > 1)
      {
        this.inner1[this.x].setVisible(false);
        this.inner2[this.x].setVisible(false);
        this.inner3[this.x].setVisible(false);
        this.inner4[this.x].setVisible(false);
        this.inner5[this.x].setVisible(false);
        
        cardsShown[0] -= 1;
        int[] Array = { cardsShown[0], cardsList[cardsShown[0]], cardsList[(cardsShown[0] + 1)], cardsList[(cardsShown[0] + 2)], 
          cardsList[(cardsShown[0] + 3)], cardsList[(cardsShown[0] + 4)] };
        cardsShown = Array;
        
        this.x -= 1;
        
        this.temp1[this.x].setVisible(false);
        this.temp1[(this.x - 1)].setVisible(true);
        this.prompt.setText(" ");
        
        this.temp2[this.x].setVisible(false);
        this.temp2[(this.x - 1)].setVisible(true);
        this.prompt.setText(" ");
        
        this.temp3[this.x].setVisible(false);
        this.temp3[(this.x - 1)].setVisible(true);
        this.prompt.setText(" ");
        
        this.temp4[this.x].setVisible(false);
        this.temp4[(this.x - 1)].setVisible(true);
        this.prompt.setText(" ");
        
        this.temp5[this.x].setVisible(false);
        this.temp5[(this.x - 1)].setVisible(true);
        this.prompt.setText(" ");
        
        this.y += 1;
      }
    }
    if (source == this.panel18) {
      if (cardsShown[0] < 20)
      {
        this.inner1[this.x].setVisible(false);
        this.inner2[this.x].setVisible(false);
        this.inner3[this.x].setVisible(false);
        this.inner4[this.x].setVisible(false);
        this.inner5[this.x].setVisible(false);
        
        cardsShown[0] += 1;
        int[] Array = { cardsShown[0], cardsList[cardsShown[0]], cardsList[(cardsShown[0] + 1)], cardsList[(cardsShown[0] + 2)], 
          cardsList[(cardsShown[0] + 3)], cardsList[(cardsShown[0] + 4)] };
        cardsShown = Array;
        
        this.prompt.setText(" ");
        if (this.y != this.x)
        {
          this.bottom1.setVisible(false);
          this.temp1[(this.x - 1)].setVisible(false);
          this.temp1[this.x].setVisible(true);
          this.prompt.setText(" ");
          
          this.bottom2.setVisible(false);
          this.temp2[(this.x - 1)].setVisible(false);
          this.temp2[this.x].setVisible(true);
          this.prompt.setText(" ");
          
          this.bottom3.setVisible(false);
          this.temp3[(this.x - 1)].setVisible(false);
          this.temp3[this.x].setVisible(true);
          this.prompt.setText(" ");
          
          this.bottom4.setVisible(false);
          this.temp4[(this.x - 1)].setVisible(false);
          this.temp4[this.x].setVisible(true);
          this.prompt.setText(" ");
          
          this.bottom5.setVisible(false);
          this.temp5[(this.x - 1)].setVisible(false);
          this.temp5[this.x].setVisible(true);
          this.prompt.setText(" ");
          this.x += 1;
          this.y -= 1;
        }
        if (this.y == this.x)
        {
          this.bottom1.setVisible(false);
          this.temp1[(this.x - 1)].setVisible(false);
          this.temp1[this.x].add(new DisplayImage("small" + this.card[cardsShown[1]].img));
          this.inner1[(this.x + 1)].add(new DisplayImage(this.card[cardsShown[1]].img));
          this.temp1[this.x].setVisible(true);
          this.prompt.setText(" ");
          
          this.bottom2.setVisible(false);
          this.temp2[(this.x - 1)].setVisible(false);
          this.temp2[this.x].add(new DisplayImage("small" + this.card[cardsShown[2]].img));
          this.temp2[this.x].setVisible(true);
          this.prompt.setText(" ");
          this.inner2[(this.x + 1)].add(new DisplayImage(this.card[cardsShown[2]].img));
          
          this.bottom3.setVisible(false);
          this.temp3[(this.x - 1)].setVisible(false);
          this.temp3[this.x].add(new DisplayImage("small" + this.card[cardsShown[3]].img));
          this.temp3[this.x].setVisible(true);
          this.prompt.setText(" ");
          this.inner3[(this.x + 1)].add(new DisplayImage(this.card[cardsShown[3]].img));
          
          this.bottom4.setVisible(false);
          this.temp4[(this.x - 1)].setVisible(false);
          this.temp4[this.x].add(new DisplayImage("small" + this.card[cardsShown[4]].img));
          this.temp4[this.x].setVisible(true);
          this.prompt.setText(" ");
          this.inner4[(this.x + 1)].add(new DisplayImage(this.card[cardsShown[4]].img));
          
          this.bottom5.setVisible(false);
          this.temp5[(this.x - 1)].setVisible(false);
          this.temp5[this.x].add(new DisplayImage("small" + this.card[cardsShown[5]].img));
          this.temp5[this.x].setVisible(true);
          this.prompt.setText(" ");
          this.inner5[(this.x + 1)].add(new DisplayImage(this.card[cardsShown[5]].img));
          
          this.x += 1;
          this.y += 1;
        }
      }
    }
    if (source == this.panel12)
    {
      this.inner2[this.x].setVisible(false);
      this.inner3[this.x].setVisible(false);
      this.inner4[this.x].setVisible(false);
      this.inner5[this.x].setVisible(false);
      this.i1 = Boolean.valueOf(true);
      this.i2 = Boolean.valueOf(false);
      this.i3 = Boolean.valueOf(false);
      this.i4 = Boolean.valueOf(false);
      this.i5 = Boolean.valueOf(false);
      this.prompt.setText(" ");
      this.inner1[this.x].setVisible(true);
      this.inner1[this.x].setBackground(this.color);
      this.cardSelected = Integer.valueOf(cardsShown[1]);
    }
    if (source == this.panel13)
    {
      this.inner3[this.x].setVisible(false);
      this.inner4[this.x].setVisible(false);
      this.inner5[this.x].setVisible(false);
      this.inner1[this.x].setVisible(false);
      this.i1 = Boolean.valueOf(false);
      this.i2 = Boolean.valueOf(true);
      this.i3 = Boolean.valueOf(false);
      this.i4 = Boolean.valueOf(false);
      this.i5 = Boolean.valueOf(false);
      this.prompt.setText(" ");
      this.inner2[this.x].setVisible(true);
      this.inner2[this.x].setBackground(this.color);
      this.cardSelected = Integer.valueOf(cardsShown[2]);
    }
    if (source == this.panel14)
    {
      this.inner2[this.x].setVisible(false);
      this.inner1[this.x].setVisible(false);
      this.inner4[this.x].setVisible(false);
      this.inner5[this.x].setVisible(false);
      this.i1 = Boolean.valueOf(false);
      this.i2 = Boolean.valueOf(false);
      this.i3 = Boolean.valueOf(true);
      this.i4 = Boolean.valueOf(false);
      this.i5 = Boolean.valueOf(false);
      this.prompt.setText(" ");
      this.inner3[this.x].setVisible(true);
      this.inner3[this.x].setBackground(this.color);
      this.cardSelected = Integer.valueOf(cardsShown[3]);
    }
    if (source == this.panel15)
    {
      this.inner2[this.x].setVisible(false);
      this.inner3[this.x].setVisible(false);
      this.inner1[this.x].setVisible(false);
      this.inner5[this.x].setVisible(false);
      this.i1 = Boolean.valueOf(false);
      this.i2 = Boolean.valueOf(false);
      this.i3 = Boolean.valueOf(false);
      this.i4 = Boolean.valueOf(true);
      this.i5 = Boolean.valueOf(false);
      this.prompt.setText(" ");
      this.inner4[this.x].setVisible(true);
      this.inner4[this.x].setBackground(this.color);
      this.cardSelected = Integer.valueOf(cardsShown[4]);
    }
    if (source == this.panel16)
    {
      this.inner2[this.x].setVisible(false);
      this.inner3[this.x].setVisible(false);
      this.inner4[this.x].setVisible(false);
      this.inner1[this.x].setVisible(false);
      this.i1 = Boolean.valueOf(false);
      this.i2 = Boolean.valueOf(false);
      this.i3 = Boolean.valueOf(false);
      this.i4 = Boolean.valueOf(false);
      this.i5 = Boolean.valueOf(true);
      this.prompt.setText(" ");
      this.inner5[this.x].setVisible(true);
      this.inner5[this.x].setBackground(this.color);
      this.cardSelected = Integer.valueOf(cardsShown[5]);
    }
  }
  
  public void mouseReleased(MouseEvent e) {}
  
  public void actionPerformed(ActionEvent event)
  {
    this.bigcard.setVisible(true);
    Object source = event.getSource();
    if (source == this.select)
    {
      if (this.z == 0)
      {
        this.panel1.setVisible(true);
        if (this.i1.booleanValue())
        {
          this.panel1.add(new DisplayImage("small" + this.card[cardsShown[1]].img));
          this.bigcard.setVisible(false);
          this.panel1.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[1]);
        }
        if (this.i2.booleanValue())
        {
          this.panel1.add(new DisplayImage("small" + this.card[cardsShown[2]].img));
          this.bigcard.setVisible(false);
          this.panel1.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[2]);
        }
        if (this.i3.booleanValue())
        {
          this.panel1.add(new DisplayImage("small" + this.card[cardsShown[3]].img));
          this.bigcard.setVisible(false);
          this.panel1.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[3]);
        }
        if (this.i4.booleanValue())
        {
          this.panel1.add(new DisplayImage("small" + this.card[cardsShown[4]].img));
          this.bigcard.setVisible(false);
          this.panel1.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[4]);
        }
        if (this.i5.booleanValue())
        {
          this.panel1.add(new DisplayImage("small" + this.card[cardsShown[5]].img));
          this.bigcard.setVisible(false);
          this.panel1.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[5]);
        }
      }
      if (this.z == 1)
      {
        this.panel2.setVisible(true);
        if (this.i1.booleanValue())
        {
          this.panel2.add(new DisplayImage("small" + this.card[cardsShown[1]].img));
          this.bigcard.setVisible(false);
          this.panel2.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[1]);
        }
        if (this.i2.booleanValue())
        {
          this.panel2.add(new DisplayImage("small" + this.card[cardsShown[2]].img));
          this.bigcard.setVisible(false);
          this.panel2.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[2]);
        }
        if (this.i3.booleanValue())
        {
          this.panel2.add(new DisplayImage("small" + this.card[cardsShown[3]].img));
          this.bigcard.setVisible(false);
          this.panel2.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[3]);
        }
        if (this.i4.booleanValue())
        {
          this.panel2.add(new DisplayImage("small" + this.card[cardsShown[4]].img));
          this.bigcard.setVisible(false);
          this.panel2.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[4]);
        }
        if (this.i5.booleanValue())
        {
          this.panel2.add(new DisplayImage("small" + this.card[cardsShown[5]].img));
          this.bigcard.setVisible(false);
          this.panel2.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[5]);
        }
      }
      if (this.z == 2)
      {
        this.panel3.setVisible(true);
        if (this.i1.booleanValue())
        {
          this.panel3.add(new DisplayImage("small" + this.card[cardsShown[1]].img));
          this.bigcard.setVisible(false);
          this.panel3.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[1]);
        }
        if (this.i2.booleanValue())
        {
          this.panel3.add(new DisplayImage("small" + this.card[cardsShown[2]].img));
          this.bigcard.setVisible(false);
          this.panel3.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[2]);
        }
        if (this.i3.booleanValue())
        {
          this.panel3.add(new DisplayImage("small" + this.card[cardsShown[3]].img));
          this.bigcard.setVisible(false);
          this.panel3.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[3]);
        }
        if (this.i4.booleanValue())
        {
          this.panel3.add(new DisplayImage("small" + this.card[cardsShown[4]].img));
          this.bigcard.setVisible(false);
          this.panel3.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[4]);
        }
        if (this.i5.booleanValue())
        {
          this.panel3.add(new DisplayImage("small" + this.card[cardsShown[5]].img));
          this.bigcard.setVisible(false);
          this.panel3.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[5]);
        }
      }
      if (this.z == 3)
      {
        this.panel4.setVisible(true);
        if (this.i1.booleanValue())
        {
          this.panel4.add(new DisplayImage("small" + this.card[cardsShown[1]].img));
          this.bigcard.setVisible(false);
          this.panel4.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[1]);
        }
        if (this.i2.booleanValue())
        {
          this.panel4.add(new DisplayImage("small" + this.card[cardsShown[2]].img));
          this.bigcard.setVisible(false);
          this.panel4.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[2]);
        }
        if (this.i3.booleanValue())
        {
          this.panel4.add(new DisplayImage("small" + this.card[cardsShown[3]].img));
          this.bigcard.setVisible(false);
          this.panel4.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[3]);
        }
        if (this.i4.booleanValue())
        {
          this.panel4.add(new DisplayImage("small" + this.card[cardsShown[4]].img));
          this.bigcard.setVisible(false);
          this.panel4.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[4]);
        }
        if (this.i5.booleanValue())
        {
          this.panel4.add(new DisplayImage("small" + this.card[cardsShown[5]].img));
          this.bigcard.setVisible(false);
          this.panel4.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[5]);
        }
      }
      if (this.z == 4)
      {
        this.panel5.setVisible(true);
        if (this.i1.booleanValue())
        {
          this.panel5.add(new DisplayImage("small" + this.card[cardsShown[1]].img));
          this.bigcard.setVisible(false);
          this.panel5.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[1]);
        }
        if (this.i2.booleanValue())
        {
          this.panel5.add(new DisplayImage("small" + this.card[cardsShown[2]].img));
          this.bigcard.setVisible(false);
          this.panel5.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[2]);
        }
        if (this.i3.booleanValue())
        {
          this.panel5.add(new DisplayImage("small" + this.card[cardsShown[3]].img));
          this.bigcard.setVisible(false);
          this.panel5.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[3]);
        }
        if (this.i4.booleanValue())
        {
          this.panel5.add(new DisplayImage("small" + this.card[cardsShown[4]].img));
          this.bigcard.setVisible(false);
          this.panel5.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[4]);
        }
        if (this.i5.booleanValue())
        {
          this.panel5.add(new DisplayImage("small" + this.card[cardsShown[5]].img));
          this.bigcard.setVisible(false);
          this.panel5.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[5]);
        }
      }
      if (this.z == 5)
      {
        this.panel6.setVisible(true);
        if (this.i1.booleanValue())
        {
          this.panel6.add(new DisplayImage("small" + this.card[cardsShown[1]].img));
          this.bigcard.setVisible(false);
          this.panel6.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[1]);
        }
        if (this.i2.booleanValue())
        {
          this.panel6.add(new DisplayImage("small" + this.card[cardsShown[2]].img));
          this.bigcard.setVisible(false);
          this.panel6.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[2]);
        }
        if (this.i3.booleanValue())
        {
          this.panel6.add(new DisplayImage("small" + this.card[cardsShown[3]].img));
          this.bigcard.setVisible(false);
          this.panel6.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[3]);
        }
        if (this.i4.booleanValue())
        {
          this.panel6.add(new DisplayImage("small" + this.card[cardsShown[4]].img));
          this.bigcard.setVisible(false);
          this.panel6.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[4]);
        }
        if (this.i5.booleanValue())
        {
          this.panel6.add(new DisplayImage("small" + this.card[cardsShown[5]].img));
          this.bigcard.setVisible(false);
          this.panel6.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[5]);
        }
      }
      if (this.z == 6)
      {
        this.panel7.setVisible(true);
        if (this.i1.booleanValue())
        {
          this.panel7.add(new DisplayImage("small" + this.card[cardsShown[1]].img));
          this.bigcard.setVisible(false);
          this.panel7.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[1]);
        }
        if (this.i2.booleanValue())
        {
          this.panel7.add(new DisplayImage("small" + this.card[cardsShown[2]].img));
          this.bigcard.setVisible(false);
          this.panel7.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[2]);
        }
        if (this.i3.booleanValue())
        {
          this.panel7.add(new DisplayImage("small" + this.card[cardsShown[3]].img));
          this.bigcard.setVisible(false);
          this.panel7.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[3]);
        }
        if (this.i4.booleanValue())
        {
          this.panel7.add(new DisplayImage("small" + this.card[cardsShown[4]].img));
          this.bigcard.setVisible(false);
          this.panel7.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[4]);
        }
        if (this.i5.booleanValue())
        {
          this.panel7.add(new DisplayImage("small" + this.card[cardsShown[5]].img));
          this.bigcard.setVisible(false);
          this.panel7.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[5]);
        }
      }
      if (this.z == 7)
      {
        this.panel8.setVisible(true);
        if (this.i1.booleanValue())
        {
          this.panel8.add(new DisplayImage("small" + this.card[cardsShown[1]].img));
          this.bigcard.setVisible(false);
          this.panel8.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[1]);
        }
        if (this.i2.booleanValue())
        {
          this.panel8.add(new DisplayImage("small" + this.card[cardsShown[2]].img));
          this.bigcard.setVisible(false);
          this.panel8.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[2]);
        }
        if (this.i3.booleanValue())
        {
          this.panel8.add(new DisplayImage("small" + this.card[cardsShown[3]].img));
          this.bigcard.setVisible(false);
          this.panel8.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[3]);
        }
        if (this.i4.booleanValue())
        {
          this.panel8.add(new DisplayImage("small" + this.card[cardsShown[4]].img));
          this.bigcard.setVisible(false);
          this.panel8.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[4]);
        }
        if (this.i5.booleanValue())
        {
          this.panel8.add(new DisplayImage("small" + this.card[cardsShown[5]].img));
          this.bigcard.setVisible(false);
          this.panel8.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[5]);
        }
      }
      if (this.z == 8)
      {
        this.panel9.setVisible(true);
        if (this.i1.booleanValue())
        {
          this.panel9.add(new DisplayImage("small" + this.card[cardsShown[1]].img));
          this.bigcard.setVisible(false);
          this.panel9.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[1]);
        }
        if (this.i2.booleanValue())
        {
          this.panel9.add(new DisplayImage("small" + this.card[cardsShown[2]].img));
          this.bigcard.setVisible(false);
          this.panel9.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[2]);
        }
        if (this.i3.booleanValue())
        {
          this.panel9.add(new DisplayImage("small" + this.card[cardsShown[3]].img));
          this.bigcard.setVisible(false);
          this.panel9.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[3]);
        }
        if (this.i4.booleanValue())
        {
          this.panel9.add(new DisplayImage("small" + this.card[cardsShown[4]].img));
          this.bigcard.setVisible(false);
          this.panel9.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[4]);
        }
        if (this.i5.booleanValue())
        {
          this.panel9.add(new DisplayImage("small" + this.card[cardsShown[5]].img));
          this.bigcard.setVisible(false);
          this.panel9.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[5]);
        }
      }
      if (this.z == 9)
      {
        this.panel10.setVisible(true);
        if (this.i1.booleanValue())
        {
          this.panel10.add(new DisplayImage("small" + this.card[cardsShown[1]].img));
          this.bigcard.setVisible(false);
          this.panel10.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[1]);
        }
        if (this.i2.booleanValue())
        {
          this.panel10.add(new DisplayImage("small" + this.card[cardsShown[2]].img));
          this.bigcard.setVisible(false);
          this.panel10.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[2]);
        }
        if (this.i3.booleanValue())
        {
          this.panel10.add(new DisplayImage("small" + this.card[cardsShown[3]].img));
          this.bigcard.setVisible(false);
          this.panel10.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[3]);
        }
        if (this.i4.booleanValue())
        {
          this.panel10.add(new DisplayImage("small" + this.card[cardsShown[4]].img));
          this.bigcard.setVisible(false);
          this.panel10.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[4]);
        }
        if (this.i5.booleanValue())
        {
          this.panel10.add(new DisplayImage("small" + this.card[cardsShown[5]].img));
          this.bigcard.setVisible(false);
          this.panel10.setBackground(this.color);
          selected[this.z] = Integer.valueOf(cardsShown[5]);
        }
      }
      this.z += 1;
    }
    if (source == this.remove)
    {
      if (this.z > 10) {
        this.z = 10;
      }
      selected[(this.z - 1)] = null;
      if (this.z == 1)
      {
        this.panel1.removeAll();
        this.panel1.setVisible(false);
      }
      if (this.z == 2)
      {
        this.panel2.removeAll();
        this.panel2.setVisible(false);
      }
      if (this.z == 3)
      {
        this.panel3.removeAll();
        this.panel3.setVisible(false);
      }
      if (this.z == 4)
      {
        this.panel4.removeAll();
        this.panel4.setVisible(false);
      }
      if (this.z == 5)
      {
        this.panel5.removeAll();
        this.panel5.setVisible(false);
      }
      if (this.z == 6)
      {
        this.panel6.removeAll();
        this.panel6.setVisible(false);
      }
      if (this.z == 7)
      {
        this.panel7.removeAll();
        this.panel7.setVisible(false);
      }
      if (this.z == 8)
      {
        this.panel8.removeAll();
        this.panel8.setVisible(false);
      }
      if (this.z == 9)
      {
        this.panel9.removeAll();
        this.panel9.setVisible(false);
      }
      if (this.z == 10)
      {
        this.panel10.removeAll();
        this.panel10.setVisible(false);
      }
      this.z -= 1;
    }
    if (source == this.ok) {
      if (this.z >= 10) {
        for (int a = 0; a < 10; a++)
        {
          for (int b = 0; b < 10; b++) {
            if ((a != b) && 
              (selected[a] == selected[b]))
            {
              b = 10;
              a = 10;
            }
          }
          if (a == 9)
          {
            Board[][] board = new Board[5][4];
            int counter = 0;
            for (int y = 2; y < 4; y++) {
              for (int x = 0; x < 5; x++)
              {
                board[x][y] = new Board();
                board[x][y].card = selected[counter];
                counter++;
              }
            }
            dispose();
            ArrangeBoard.main(board);
          }
        }
      }
    }
  }
  
  public static int[] AlphabetizeCards()
  {
    int[] cards = new int[25];
    int c = 0;
    
    cards[c] = 31;
    c++;
    
    cards[c] = 14;
    c++;
    
    cards[c] = 7;
    c++;
    
    cards[c] = 10;
    c++;
    
    cards[c] = 8;
    c++;
    
    cards[c] = 24;
    c++;
    
    cards[c] = 15;
    c++;
    
    cards[c] = 25;
    c++;
    
    cards[c] = 16;
    c++;
    
    cards[c] = 26;
    c++;
    
    cards[c] = 27;
    c++;
    
    cards[c] = 28;
    c++;
    
    cards[c] = 17;
    c++;
    
    cards[c] = 29;
    c++;
    
    cards[c] = 18;
    c++;
    
    cards[c] = 9;
    c++;
    
    cards[c] = 19;
    c++;
    
    cards[c] = 20;
    c++;
    
    cards[c] = 21;
    c++;
    
    cards[c] = 22;
    c++;
    
    cards[c] = 23;
    c++;
    
    cards[c] = 11;
    c++;
    
    cards[c] = 30;
    c++;
    
    cards[c] = 12;
    c++;
    
    cards[c] = 13;
    
    return cards;
  }
  
  public static void main()
  {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int)screenSize.getWidth();
    int height = (int)screenSize.getHeight();
    OrganizeBoardSelect select = new OrganizeBoardSelect();
    int WIDTH = 1300;
    int HEIGHT = 750;
    select.setSize(1300, 750);
    select.setVisible(true);
    select.setLocation(width / 2 - 650, height / 2 - 375);
  }
}
