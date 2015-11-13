public class PlayCard
{
  public static PlayerBoard main(PlayerBoard playerBoard, Card[] cards, int cardNum, int cardLoc, int[] order, int turn, boolean skip)
  {
    if ((cards[cardNum].actionCost.intValue() <= 0) || (playerBoard.player[order[turn]].actions >= 1))
    {
      if (!skip)
      {
        for (int counter = 0; counter < playerBoard.player[order[turn]].play.length; counter++) {
          if (playerBoard.player[order[turn]].play[counter] == null)
          {
            playerBoard.player[order[turn]].play[counter] = Integer.valueOf(cardNum);
            playerBoard.player[order[turn]].hand[cardLoc] = null;
          }
        }
      //Added int counter
        for (int counter = 0; counter < 50; counter++) {
          if (playerBoard.player[order[turn]].hand[counter] == null) {
            for (int counter1 = counter + 1; counter1 < 50; counter1++) {
              if (playerBoard.player[order[turn]].hand[counter1] != null)
              {
                playerBoard.player[order[turn]].hand[counter] = 
                  playerBoard.player[order[turn]].hand[counter1];
                playerBoard.player[order[turn]].hand[counter1] = null;
                counter1 = 50;
              }
            }
          }
        }
      }
      playerBoard.player[order[turn]].actions = 
        (playerBoard.player[order[turn]].actions - cards[cardNum].actionCost.intValue());
      playerBoard.player[order[turn]].actions = 
        (playerBoard.player[order[turn]].actions + cards[cardNum].action.intValue());
      playerBoard.player[order[turn]].buys = 
        (playerBoard.player[order[turn]].buys + cards[cardNum].buy.intValue());
      playerBoard.player[order[turn]].money = 
        (playerBoard.player[order[turn]].money + cards[cardNum].money.intValue());
      
      playerBoard.player[order[turn]] = DrawCards.main(playerBoard.player[order[turn]], cards[cardNum].draws.intValue());
      if (cards[cardNum].special.intValue() == 3) {
        playerBoard = ActionSpecial.main(playerBoard, cards, cardNum, order, turn);
      }
    }
    return playerBoard;
  }
}
