public class BuyCard
{
  public static PlayerBoard main(PlayerBoard playerBoard, Card[] cards, int[] order, int turn, int x, int y)
  {
    if (playerBoard.player[order[turn]].buys > 0) {
      if (x != -1) {
        if (playerBoard.player[order[turn]].money >= cards[playerBoard.board[x][y].card.intValue()].cost.intValue()) {
          if (playerBoard.board[x][y].total > 0) {
            for (int counter = 0; counter < playerBoard.player[order[turn]].discard.length; counter++) {
              if (playerBoard.player[order[turn]].discard[counter] == null)
              {
                playerBoard.player[order[turn]].buys -= 1;
                playerBoard.player[order[turn]].money = 
                  (playerBoard.player[order[turn]].money - cards[playerBoard.board[x][y].card.intValue()].cost.intValue());
                playerBoard.player[order[turn]].discard[counter] = playerBoard.board[x][y].card;
                playerBoard.board[x][y].total -= 1;
                counter = 100;
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
            }
          }
        }
      }
    }
    return playerBoard;
  }
}
