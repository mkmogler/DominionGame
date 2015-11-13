import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SetUpBoard
  extends JFrame
  implements ActionListener
{
  static SetUpBoard setup = new SetUpBoard();
  Card[] cards = Cards.main();
  static Board[][] realBoard;
  private JLabel prompt = new JLabel("Choose Kingdom Cards or Random?");
  Font font1 = new Font("Serif", 1, 35);
  private Button select = new Button("User Select");
  private Button random = new Button("Random");
  Color color = new Color(40, 100, 28);
  private Container con = getContentPane();
  
  public SetUpBoard()
  {
    this.prompt.setForeground(Color.black);
    
    setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    c.fill = 2;
    c.gridx = 0;
    c.gridy = 0;
    c.insets = new Insets(0, 0, 20, 0);
    c.gridwidth = 3;
    add(new DisplayImage("Dominion-header.jpg"), c);
    
    c.gridx = 0;
    c.gridy = 1;
    c.insets = new Insets(2, 10, 0, 0);
    c.gridwidth = 3;
    this.prompt.setFont(this.font1);
    add(this.prompt, c);
    c.gridx = 0;
    c.gridy = 2;
    c.insets = new Insets(30, 180, 0, 0);
    c.gridwidth = 1;
    add(this.select, c);
    c.gridx = 2;
    c.gridy = 2;
    c.insets = new Insets(30, 60, 0, 200);
    c.gridwidth = 1;
    add(this.random, c);
    
    this.con.setBackground(this.color);
    
    this.select.addActionListener(this);
    this.random.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent event)
  {
    Object source = event.getSource();
    if (source == this.select)
    {
      setVisible(false);
      dispose();
      OrganizeBoardSelect.main();
    }
    if (source == this.random) {
      RandomCards(this.cards);
    }
  }
  
  private void KingdomCards(Card[] cards)
  {
    Board[][] board = new Board[5][4];
    board[0][0].card = Integer.valueOf(3);
    board[1][0].card = Integer.valueOf(4);
    board[2][0].card = Integer.valueOf(5);
    board[3][0].card = Integer.valueOf(6);
    board[0][1].card = Integer.valueOf(0);
    board[1][1].card = Integer.valueOf(1);
    board[2][1].card = Integer.valueOf(2);
    board[0][1].total = 60;
    board[1][1].total = 40;
    board[2][1].total = 30;
    
    realBoard = board;
  }
  
  
  private void RandomCards(Card[] cards)
  {
    Board[][] board = new Board[5][4];
    
    Random rand = new Random();
    for (int x = 0; x < 5; x++) {
      for (int y = 0; y < 4; y++) {
        board[x][y] = new Board();
      }
    }
    for (int counter = 2; counter < 4; counter++) {
      for (int counter1 = 0; counter1 < 5; counter1++) {
        if (board[counter1][counter].card == null)
        {
          int randCard = rand.nextInt(25) + 7;
          if (cards[randCard].name != null)
          {
        	  //Re-declared x
            int x = 0;
            for (int y = 0; y < 4; y++) {
              for (x = 0; x < 5; x++) {
                if ((board[x][y].card != null) && (board[x][y].card.intValue() == randCard))
                {
                  x = 10;
                  y = 10;
                  counter--;
                }
              }
            }
            if (x < 8) {
              board[counter1][counter].card = Integer.valueOf(randCard);
            }
          }
          else
          {
            counter1--;
          }
        }
      }
    }
    dispose();
    
    ArrangeBoard.main(board);
  }
  
  public static void main()
  {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int)screenSize.getWidth();
    int height = (int)screenSize.getHeight();
    int WIDTH = 600;
    int HEIGHT = 400;
    setup.setSize(600, 400);
    setup.setVisible(true);
    setup.setLocation(width / 2 - 300, height / 2 - 200);
  }
}
