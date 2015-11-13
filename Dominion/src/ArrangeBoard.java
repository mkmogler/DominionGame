public class ArrangeBoard
{
  public static void main(Board[][] board)
  {
    Card[] cards = Cards.main();
    for (int counter = 2; counter < 4; counter++) {
      for (int counter1 = 0; counter1 < 5; counter1++) {
        if (board[counter1][counter].card == null)
        {
          int x = counter1;
          int y = counter;
          if (x > 4) {
            y++;
          }
          x %= 5;
          if (y != 4)
          {
            board[counter1][counter].card = board[x][y].card;
            board[x][y].card = null;
          }
        }
      }
    }
    for (int counter = 2; counter < 4; counter++) {
      for (int counter1 = 0; counter1 < 5; counter1++)
      {
        int x = counter1;
        int y = counter;
        if (x > 4) {
          y++;
        }
        x %= 5;
        if ((y != 4) && (board[x][y].card != null)) {
          if (cards[board[counter1][counter].card.intValue()].cost.intValue() > cards[board[x][y].card.intValue()].cost.intValue())
          {
            int temp = board[x][y].card.intValue();
            board[x][y].card = board[counter1][counter].card;
            board[counter1][counter].card = Integer.valueOf(temp);
            
            counter1 = 6;
            counter = 1;
          }
          else if (cards[board[counter1][counter].card.intValue()].name.compareToIgnoreCase(cards[board[x][y].card.intValue()].name) > 0)
          {
            int temp = board[x][y].card.intValue();
            board[x][y].card = board[counter1][counter].card;
            board[counter1][counter].card = Integer.valueOf(temp);
            
            counter1 = 6;
            counter = 1;
          }
        }
      }
    }
    RunNewGame.AfterBoardScreen(board);
  }
}
