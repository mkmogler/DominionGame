import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GainTreasure
  extends JFrame
  implements ActionListener
{
  static int selected;
  static int cost;
  static Board[][] board;
  JPanel copper = new JPanel();
  JPanel silver = new JPanel();
  JPanel gold = new JPanel();
  JButton gainC = new JButton("Gain");
  JButton gainS = new JButton("Gain");
  JButton gainG = new JButton("Gain");
  
  public GainTreasure()
  {
    int w = 0;
    this.gainC.addActionListener(this);
    this.gainS.addActionListener(this);
    this.gainG.addActionListener(this);
    
    this.copper.add(new DisplayImage("copper.jpg"));
    this.silver.add(new DisplayImage("silver.jpg"));
    this.gold.add(new DisplayImage("gold.jpg"));
    
    this.copper.add(this.gainC);
    this.silver.add(this.gainS);
    this.gold.add(this.gainG);
    if (board[0][1].total > 0)
    {
      add(this.copper);
      w++;
    }
    if (board[1][1].total > 0)
    {
      add(this.silver);
      w++;
    }
    if ((cost > 5) && (board[2][1].total > 0))
    {
      add(this.gold);
      w++;
    }
    setSize(w * 300 + 20, 500);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int)screenSize.getWidth();
    int height = (int)screenSize.getHeight();
    setLocation(width / 2 - w * 150 - 10, height / 2 - 250);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    Object source = e.getSource();
    if (source == this.gainC) {
      selected = 0;
    }
    if (source == this.gainS) {
      selected = 1;
    }
    if (source == this.gainG) {
      selected = 2;
    }
    dispose();
  }
  
  public static int main(Board[][] bBoard, int cCost)
  {
    board = bBoard;
    cost = cCost;
    selected = 0;
    
    GainTreasure frame = new GainTreasure();
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(0);
    while (frame.isShowing()) {}
    return selected;
  }
}
