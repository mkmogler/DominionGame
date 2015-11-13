public class EndGame
{
  public static void main(PlayerBoard playerBoard, Card[] cards, int[] order, int turn)
  {
    int[] winningOrder = new int[playerBoard.player.length];
    
    int newTurn = turn;
    do
    {
      for (int counter = 0; counter < 1000; counter++) {
        if (playerBoard.player[order[newTurn]].discard[counter] != null) {
          for (int counter1 = 0; counter1 < 1000; counter1++) {
            if (playerBoard.player[order[newTurn]].deck[counter1] == null)
            {
              playerBoard.player[order[newTurn]].deck[counter1] = 
                playerBoard.player[order[newTurn]].discard[counter];
              playerBoard.player[order[newTurn]].discard[counter] = null;
              counter1 = 1000;
            }
          }
        }
      }
      for (int counter = 0; counter < 50; counter++) {
        if (playerBoard.player[order[newTurn]].play[counter] != null) {
          for (int counter1 = 0; counter1 < 1000; counter1++) {
            if (playerBoard.player[order[newTurn]].deck[counter1] == null)
            {
              playerBoard.player[order[newTurn]].deck[counter1] = 
                playerBoard.player[order[newTurn]].play[counter];
              playerBoard.player[order[newTurn]].play[counter] = null;
              counter1 = 1000;
            }
          }
        }
      }
      for (int counter = 0; counter < 50; counter++) {
        if (playerBoard.player[order[newTurn]].hand[counter] != null) {
          for (int counter1 = 0; counter1 < 1000; counter1++) {
            if (playerBoard.player[order[newTurn]].deck[counter1] == null)
            {
              playerBoard.player[order[newTurn]].deck[counter1] = 
                playerBoard.player[order[newTurn]].hand[counter];
              playerBoard.player[order[newTurn]].hand[counter] = null;
              counter1 = 1000;
            }
          }
        }
      }
      for (int counter = 0; counter < 1000; counter++) {
        if ((playerBoard.player[order[newTurn]].deck[counter] != null) && 
          (cards[playerBoard.player[order[newTurn]].deck[counter].intValue()].victoryCard.intValue() == 1))
        {
          if (playerBoard.player[order[newTurn]].deck[counter].intValue() == 16) {
            playerBoard.player[order[newTurn]].points += 
              (playerBoard.player[order[newTurn]].deck.length - 
              playerBoard.player[order[newTurn]].deck.length % 10) / 10;
          }
          playerBoard.player[order[newTurn]].points += 
            cards[playerBoard.player[order[newTurn]].deck[counter].intValue()].points.intValue();
        }
      }
      winningOrder[newTurn] = newTurn;
      newTurn = (newTurn + 1) % playerBoard.player.length;
    } while (newTurn != turn);
    for (int counter = 0; counter < playerBoard.player.length - 1; counter++) {
      if (playerBoard.player[winningOrder[counter]].points < playerBoard.player[winningOrder[(counter + 1)]].points)
      {
        int temp = winningOrder[counter];
        winningOrder[counter] = winningOrder[(counter + 1)];
        winningOrder[(counter + 1)] = temp;
        counter = -1;
      }
    }
    RunNewGame.GetStart().removeAll();
  }
}
