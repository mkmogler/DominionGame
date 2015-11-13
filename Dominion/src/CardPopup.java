import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardPopup
  extends JFrame
{
  private JPanel n = new JPanel();
  private JPanel s = new JPanel();
  int a = 0;
  private JButton main = new JButton("Press Me!");
  
  public CardPopup()
  {
    setLayout(new BorderLayout());
    add(this.n, "Center");
    add(this.s, "South");
    this.s.add(this.main);
    
    this.n.add(new DisplayImage("gold.jpg"));
    
    setSize(310, 550);
  }
  
  public static void main(String[] args)
  {
    CardPopup frame = new CardPopup();
    frame.setVisible(true);
  }
}
