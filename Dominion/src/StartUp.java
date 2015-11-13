import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class StartUp
  extends JFrame
  implements ActionListener
{
  int plays = 0;
  int displayWidth;
  int displayHeight;
  JMenuBar mainBar = new JMenuBar();
  JMenu File = new JMenu("File");
  JMenu Options = new JMenu("Options");
  JMenuItem NewGame = new JMenuItem("New Game");
  JMenuItem Rules = new JMenuItem("Rules");
  JMenuItem Exit = new JMenuItem("Exit");
  JPanel green = new JPanel();
  
  public StartUp()
  {
    super("Dominion");
    
    setJMenuBar(this.mainBar);
    
    this.mainBar.add(this.File);
    this.File.add(this.NewGame);
    this.File.add(this.Rules);
    this.File.add(this.Exit);
    this.NewGame.addActionListener(this);
    this.Rules.addActionListener(this);
    this.Exit.addActionListener(this);
    Color newGreen = new Color(40, 100, 28);
    this.green.setBackground(newGreen);
    add(this.green);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    Object source = e.getSource();
    if (source == this.NewGame) {
      DeletePriorGame.main();
    } else if (source == this.Rules) {
      DisplayRules.main();
    } else if (source == this.Exit) {
      System.exit(0);
    }
  }
}
