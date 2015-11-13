public class EndTurn
{
  public static PlayerBoard main(PlayerBoard playerBoard, int[] order, int turn)
  {
    for (int counter = 0; counter < 50; counter++)
    {
      if (playerBoard.player[order[turn]].play[counter] != null) {
        for (int counter1 = 0; counter1 < 1000; counter1++) {
          if (playerBoard.player[order[turn]].discard[counter1] == null)
          {
            playerBoard.player[order[turn]].discard[counter1] = 
              playerBoard.player[order[turn]].play[counter];
            playerBoard.player[order[turn]].play[counter] = null;
            counter1 = 1000;
          }
        }
      }
      if (playerBoard.player[order[turn]].hand[counter] != null) {
        for (int counter1 = 0; counter1 < 1000; counter1++) {
          if (playerBoard.player[order[turn]].discard[counter1] == null)
          {
            playerBoard.player[order[turn]].discard[counter1] = 
              playerBoard.player[order[turn]].hand[counter];
            playerBoard.player[order[turn]].hand[counter] = null;
            counter1 = 1000;
          }
        }
      }
    }
    playerBoard.player[order[turn]] = DrawCards.main(playerBoard.player[order[turn]], 5);
    
    return playerBoard;
  }
}
