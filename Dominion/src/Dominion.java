import java.awt.Dimension;
import java.awt.Toolkit;

public class Dominion
{
  static StartUp start = new StartUp();
  
  public static void main(String[] args)
  {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int)screenSize.getWidth();
    int height = (int)screenSize.getHeight();
    start.setSize(width, height);
    start.setResizable(false);
    start.setVisible(true);
    start.setDefaultCloseOperation(3);
  }
  
  public static StartUp GetStart()
  {
    return start;
  }
}
