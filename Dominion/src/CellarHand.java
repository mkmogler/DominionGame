import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CellarHand
  extends JFrame
  implements ActionListener, MouseListener
{
  Integer[] hand = new Integer[50];
  Integer[] displayed = new Integer[6];
  int totalCards;
  int cardsSelected;
  static boolean[] selected = new boolean[50];
  JButton select1 = new JButton("Select");
  JButton select2 = new JButton("Select");
  JButton select3 = new JButton("Select");
  JButton select4 = new JButton("Select");
  JButton select5 = new JButton("Select");
  JPanel[] cardPanel = new JPanel[5];
  JPanel left = new JPanel();
  JPanel right = new JPanel();
  JButton ok = new JButton("OK");
  JLabel text = new JLabel();
  Color green = new Color(40, 100, 28);
  Color red = Color.RED;
  
  public CellarHand()
  {
    setBackground(this.green);
    this.cardsSelected = 0;
    this.text.setText("Cards To Discard:" + this.cardsSelected);
    for (int counter = 0; counter < 50; counter++) {
      selected[counter] = false;
    }
    for (int counter = 0; counter < 5; counter++)
    {
      this.cardPanel[counter] = new JPanel();
      this.cardPanel[counter].addMouseListener(this);
      this.cardPanel[counter].setBackground(this.green);
    }
    this.select1.addActionListener(this);
    this.select2.addActionListener(this);
    this.select3.addActionListener(this);
    this.select4.addActionListener(this);
    this.select5.addActionListener(this);
    
    this.displayed[0] = Integer.valueOf(0);
    
    this.hand = ActionSpecial.GetHand();
    this.totalCards = 0;
    for (int counter = 0; counter < 50; counter++) {
      if (this.hand[counter] != null) {
        this.totalCards += 1;
      }
    }
    for (int counter = 0; counter < 5; counter++) {
      this.displayed[(counter + 1)] = this.hand[counter];
    }
  }
  
  public void actionPerformed(ActionEvent e)
  {
    Object source = e.getSource();
    if (source == this.left)
    {
      if ((this.displayed[0].intValue() > 0) && (this.totalCards > 5))
      {
        int tmp38_37 = 0; Integer[] tmp38_34 = this.displayed;tmp38_34[tmp38_37] = Integer.valueOf(tmp38_34[tmp38_37].intValue() - 1);
        for (int counter = 1; counter < 6; counter++)
        {
          this.displayed[counter] = this.hand[(this.displayed[0].intValue() + counter)];
          if (selected[this.displayed[counter].intValue()]!= 0) {
            this.cardPanel[(counter - 1)].setBackground(this.red);
          } else {
            this.cardPanel[(counter - 1)].setBackground(this.green);
          }
        }
      }
    }
    else if (source == this.right)
    {
      if (this.displayed[0].intValue() < this.totalCards - 5)
      {
        int tmp168_167 = 0; Integer[] tmp168_164 = this.displayed;tmp168_164[tmp168_167] = Integer.valueOf(tmp168_164[tmp168_167].intValue() + 1);
        for (int counter = 5; counter > 0; counter--)
        {
          this.displayed[counter] = this.hand[(this.displayed[0].intValue() + counter)];
          if (selected[this.displayed[counter].intValue()] != 0) {
            this.cardPanel[(counter - 1)].setBackground(this.red);
          } else {
            this.cardPanel[(counter - 1)].setBackground(this.green);
          }
        }
      }
    }
    else if (source == this.ok) {
      dispose();
    } else if (source == this.select1)
    {
      if (selected[this.displayed[1].intValue()] != 0)
      {
        selected[this.displayed[1].intValue()] = false;
        this.cardsSelected -= 1;
        this.cardPanel[0].setBackground(this.green);
      }
      else
      {
        selected[this.displayed[1].intValue()] = true;
        this.cardsSelected += 1;
        this.cardPanel[0].setBackground(this.red);
      }
    }
    else if (source == this.select2)
    {
      if (selected[this.displayed[2].intValue()] != 0)
      {
        selected[this.displayed[2].intValue()] = false;
        this.cardsSelected -= 1;
        this.cardPanel[1].setBackground(this.green);
      }
      else
      {
        selected[this.displayed[2].intValue()] = true;
        this.cardsSelected += 1;
        this.cardPanel[1].setBackground(this.red);
      }
    }
    else if (source == this.select3)
    {
      if (selected[this.displayed[3].intValue()] != 0)
      {
        selected[this.displayed[3].intValue()] = false;
        this.cardsSelected -= 1;
        this.cardPanel[2].setBackground(this.green);
      }
      else
      {
        selected[this.displayed[3].intValue()] = true;
        this.cardsSelected += 1;
        this.cardPanel[2].setBackground(this.red);
      }
    }
    else if (source == this.select4)
    {
      if (selected[this.displayed[4].intValue()] != 0)
      {
        selected[this.displayed[4].intValue()] = false;
        this.cardsSelected -= 1;
        this.cardPanel[3].setBackground(this.green);
      }
      else
      {
        selected[this.displayed[4].intValue()] = true;
        this.cardsSelected += 1;
        this.cardPanel[3].setBackground(this.red);
      }
    }
    else if (source == this.select5) {
      if (selected[this.displayed[5].intValue()] != 0)
      {
        selected[this.displayed[5].intValue()] = false;
        this.cardsSelected -= 1;
        this.cardPanel[4].setBackground(this.green);
      }
      else
      {
        selected[this.displayed[5].intValue()] = true;
        this.cardsSelected += 1;
        this.cardPanel[4].setBackground(this.red);
      }
    }
  }
  
  public void mouseClicked(MouseEvent e) {}
  
  public void mouseEntered(MouseEvent e) {}
  
  public void mouseExited(MouseEvent e) {}
  
  public void mousePressed(MouseEvent e)
  {
    Object source = e.getSource();
  }
  
  public void mouseReleased(MouseEvent e) {}
  
  public boolean[] GetSelected()
  {
    return selected;
  }
}
