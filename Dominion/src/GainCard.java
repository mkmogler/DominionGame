import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GainCard
  extends JFrame
  implements ActionListener, MouseListener
{
  static Board[][] board;
  static Card[] card;
  static int cost;
  static int x;
  static int y;
  static int cardsInRand;
  static Integer[] randomPile;
  static int toHand = 0;
  static int toDiscard = 1;
  JButton gain = new JButton("Gain Card");
  
  public GainCard()
  {
    x = -1;
    y = -1;
    this.gain.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    cardsInRand = 0;
    for (int counter = 0; counter < 50; counter++) {
      if (randomPile[counter] != null) {
        cardsInRand += 1;
      }
    }
    if (cardsInRand == 0) {
      JOptionPane.showMessageDialog(null, "There are no cards left in the random pile");
    } else if (cost < 4) {
      JOptionPane.showMessageDialog(null, "You can only gain a card costing " + cost + " or less");
    } else {
      dispose();
    }
    dispose();
    
    JOptionPane.showMessageDialog(null, "The card selected does not have any cards left in it");
    x = -1;
    y = -1;
    
    JOptionPane.showMessageDialog(null, "You can only gain a card costing " + cost + " or less");
    x = -1;
    y = -1;
    
    JOptionPane.showMessageDialog(null, "No card has been selected");
  }
  
  public void mouseClicked(MouseEvent e) {}
  
  public void mouseEntered(MouseEvent e) {}
  
  public void mouseExited(MouseEvent e) {}
  
  public void mousePressed(MouseEvent e)
  {
    Object source = e.getSource();
  }
  
  public void mouseReleased(MouseEvent e) {}
  
  public static PlayerBoard main(PlayerBoard playerBoard, Card[] cards, int[] order, int turn, int cCost, int where)
  {
    board = playerBoard.board;
    card = cards;
    cost = cCost;
    randomPile = playerBoard.randomPile;
    
    GainCard frame = new GainCard();
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int)screenSize.getWidth();
    int height = (int)screenSize.getHeight();
    
    frame.setSize(width - 50, height - 50);
    frame.setLocation(25, 25);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(0);
    
    int[] toReturn = new int[2];
    while (frame.isShowing())
    {
      toReturn[0] = frame.GetX();
      toReturn[1] = frame.GetY();
    }
    if (x == -1)
    {
      for (int counter1 = 0; counter1 < 1000; counter1++) {
        if (playerBoard.randomPile[counter1] != null) {
          if (where == 0) {
            for (int counter = 0; counter < 50; counter++) {
              if (playerBoard.player[order[turn]].hand[counter] == null)
              {
                playerBoard.player[order[turn]].hand[counter] = 
                  playerBoard.randomPile[counter1];
                playerBoard.randomPile[counter1] = null;
                counter = 1000;
                counter1 = 1000;
                cardsInRand -= 1;
              }
            }
          } else {
            for (int counter = 0; counter < 1000; counter++) {
              if (playerBoard.player[order[turn]].discard[counter] == null)
              {
                playerBoard.player[order[turn]].discard[counter] = 
                  playerBoard.randomPile[counter1];
                playerBoard.randomPile[counter1] = null;
                counter = 1000;
                counter1 = 1000;
                cardsInRand -= 1;
              }
            }
          }
        }
      }
      if (cardsInRand == 0)
      {
        int largest = 0;
        for (int y1 = 0; y1 < 4; y1++) {
          for (int x1 = 0; x1 < 4; x1++) {
            if (playerBoard.board[x1][y1].orderGone > largest) {
              largest = playerBoard.board[x1][y1].orderGone;
            }
          }
        }
        playerBoard.randomPileGone = (largest + 1);
        if (largest == 3) {
          EndGame.main(playerBoard, cards, order, turn);
        }
      }
    }
    else
    {
      if (where == 0) {
        for (int counter = 0; counter < 50; counter++) {
          if (playerBoard.player[order[turn]].hand[counter] == null)
          {
            playerBoard.player[order[turn]].hand[counter] = 
              playerBoard.board[x][y].card;
            playerBoard.board[x][y].total -= 1;
            counter = 1000;
          }
        }
      } else {
        for (int counter = 0; counter < 1000; counter++) {
          if (playerBoard.player[order[turn]].discard[counter] == null)
          {
            playerBoard.player[order[turn]].discard[counter] = 
              playerBoard.board[x][y].card;
            playerBoard.board[x][y].total -= 1;
            counter = 1000;
          }
        }
      }
      if (playerBoard.board[x][y].total == 0)
      {
        int largest = playerBoard.randomPileGone;
        for (int y1 = 0; y1 < 4; y1++) {
          for (int x1 = 0; x1 < 4; x1++) {
            if (playerBoard.board[x1][y1].orderGone > largest) {
              largest = playerBoard.board[x1][y1].orderGone;
            }
          }
        }
        playerBoard.board[x][y].orderGone = (largest + 1);
        if (largest == 3) {
          EndGame.main(playerBoard, cards, order, turn);
        }
      }
    }
    return playerBoard;
  }
  
  public int GetX()
  {
    return x;
  }
  
  public int GetY()
  {
    return y;
  }
}
