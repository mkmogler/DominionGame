import java.util.Random;

public class DrawCards
{
  public static Players main(Players player, int cardsToDraw)
  {
    Random rand = new Random();
    
    int cardsDrawn = 0;
    int counter;
    label260:
    for (; cardsDrawn < cardsToDraw; counter < 1000)
    //Loop is set up wrong?
    {
      for (counter = 999; counter >= 0; counter--) {
        if (player.deck[counter] != null) {
          for (int counter1 = 0; counter1 < 50; counter1++) {
            if (player.hand[counter1] == null)
            {
              player.hand[counter1] = player.deck[counter];
              player.deck[counter] = null;
              counter1 = 100;
              counter = -100;
              cardsDrawn++;
            }
          }
        }
      }
      if ((counter <= -50) || (cardsDrawn >= cardsToDraw)) {
        break label260;
      }
      for (counter = 0; counter < 1000; counter++) {
        if (player.discard[counter] != null)
        {
          int cardLoc = rand.nextInt(1000);
          while (player.deck[cardLoc] != null) {
            cardLoc = (cardLoc + 1) % 1000;
          }
          player.deck[cardLoc] = player.discard[counter];
          player.discard[counter] = null;
        }
      }
      counter = 0; continue;
      if (player.deck[counter] == null) {
        for (int counter1 = counter + 1; counter1 < 1000; counter1++) {
          if (player.deck[counter1] != null)
          {
            player.deck[counter] = player.deck[counter1];
            player.deck[counter1] = null;
            counter1 = 1000;
          }
        }
      }
      counter++;
    }
    return player;
  }
}
