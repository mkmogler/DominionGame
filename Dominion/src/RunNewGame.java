import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;

public class RunNewGame
{
  static StartUp start = new StartUp();
  static Players[] players;
  
  public static void main()
  {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int)screenSize.getWidth();
    int height = (int)screenSize.getHeight();
    start.setSize(width, height);
    start.setResizable(false);
    start.setVisible(true);
    start.setDefaultCloseOperation(3);
    
    PlayerScreen.main();
  }
  
  public static StartUp GetStart()
  {
    return start;
  }
  
  public static void AfterPlayerScreen(Players[] player)
  {
    players = player;
    SetUpBoard.main();
  }
  
  public static void AfterBoardScreen(Board[][] board)
  {
    Random random = new Random();
    
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
    
    Card[] cards = Cards.main();
    
    int amountOfPlayers = players.length;
    
    int[] order = new int[amountOfPlayers];
    int turn = 0;
    for (int counter = 0; counter < amountOfPlayers; counter++)
    {
      order[counter] = random.nextInt(amountOfPlayers);
      for (int counter1 = counter - 1; counter1 >= 0; counter1--) {
        if (order[counter] == order[counter1]) {
          counter--;
        }
      }
    }
    for (int counter = 0; counter < amountOfPlayers; counter++)
    {
      players[counter].deck = new Integer['?'];
      players[counter].discard = new Integer['?'];
      players[counter].play = new Integer[50];
      players[counter].hand = new Integer[50];
      for (int counter1 = 0; counter1 < 7; counter1++) {
        players[counter].discard[counter1] = Integer.valueOf(0);
      }
      for (int counter1 = 7; counter1 < 10; counter1++) {
        players[counter].discard[counter1] = Integer.valueOf(3);
      }
    }
    for (int counter = 0; counter < amountOfPlayers; counter++) {
      players[counter] = DrawCards.main(players[counter], 5);
    }
    OrganizeBoard2.main(board, players, order, turn);
  }
}
