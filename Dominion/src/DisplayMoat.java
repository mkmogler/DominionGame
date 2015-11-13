import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisplayMoat
  extends JFrame
  implements ActionListener
{
  JPanel dis = new JPanel();
  JButton yes = new JButton("Yes");
  JButton no = new JButton("No");
  String attack = ActionSpecial.GetAttack();
  String player = ActionSpecial.GetPlayer();
  String attackedPlayer = ActionSpecial.GetAttackedPlayer();
  JLabel words1 = new JLabel(this.attackedPlayer + ", you are being attacked by " + this.player + " by the " + this.attack + ".");
  JLabel words2 = new JLabel("Do you wish to use your moat to block the attack");
  static boolean answer;
  
  public DisplayMoat()
  {
    answer = false;
    setLayout(new FlowLayout());
    
    this.dis.setBackground(new Color(40, 100, 28));
    
    this.dis.add(new DisplayImage("moat.jpg"));
    
    add(this.dis);
    
    this.yes.addActionListener(this);
    this.no.addActionListener(this);
    
    add(this.words1);
    add(this.words2);
    add(this.yes);
    add(this.no);
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int)screenSize.getWidth();
    int height = (int)screenSize.getHeight();
    setSize(300, 500);
    setLocation(width / 2 - 150, height / 2 - 250);
    setResizable(true);
    setVisible(true);
    setDefaultCloseOperation(2);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    Object source = e.getSource();
    if (source == this.yes)
    {
      answer = true;
      dispose();
    }
    else
    {
      dispose();
    }
  }
  
  public static boolean GetAnswer()
  {
    return answer;
  }
}
