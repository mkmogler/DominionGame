import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class DisplayImage
  extends Component
{
  BufferedImage img;
  
  public void paint(Graphics g)
  {
    g.drawImage(this.img, 0, 0, null);
  }
  
  public DisplayImage(String s)
  {
    try
    {
      this.img = ImageIO.read(new File(s));
    }
    catch (IOException e)
    {
      System.out.println("Image not displayed");
    }
  }
  
  public Dimension getPreferredSize()
  {
    if (this.img == null) {
      return new Dimension(100, 100);
    }
    return new Dimension(this.img.getWidth(null), this.img.getHeight(null));
  }
  
  public static void main(String[] args)
  {
    JFrame f = new JFrame("Load Image Sample");
    
    f.addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent e)
      {
        System.exit(0);
      }
    });
    f.pack();
    f.setVisible(true);
  }
}
