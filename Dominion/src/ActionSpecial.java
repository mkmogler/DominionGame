import java.util.Random;
import javax.swing.JOptionPane;

//Problem with the local variables throughout
//First Change
public class ActionSpecial
{
  static Integer[] hand;
  static String attack;
  static String player;
  static String attackedPlayer;
  
  public static PlayerBoard main(PlayerBoard playerBoard, Card[] cards, int cardNum, int[] order, int turn)
  {
    hand = playerBoard.player[order[turn]].hand;
    attack = cards[cardNum].name;
    player = playerBoard.player[order[turn]].name;
    switch (cards[cardNum].actionSpecial.intValue())
    {
    case 1: 
      CellarHand cellar = new CellarHand();
      boolean[] selected = new boolean[50];
      for (int counter = 0; counter < 50; counter++) {
        selected[counter] = false;
      }
      while (cellar.isShowing()) {
        selected = cellar.GetSelected();
      }
      Integer[] cardsSelected = new Integer[4];
      Integer[] cardsLoc = new Integer[4];
      for (int counter = 0; counter < 50; counter++) {
        if (selected[counter] != 0)  //Boolean int type mismatch
        	{
          for (int counter1 = 0; counter1 < 4; counter1++) {
            if (cardsSelected[counter1] != null)
            {
              cardsSelected[counter1] = playerBoard.player[order[turn]].hand[counter];
              cardsLoc[counter1] = Integer.valueOf(counter);
            }
          }
        }
      }
      for (int counter = 0; counter < 4; counter++) {
        if (cardsSelected[counter] != null) {
          for (int counter1 = 0; counter1 < 1000; counter1++) {
            if (playerBoard.player[order[turn]].discard[counter1] == null)
            {
              playerBoard.player[order[turn]].discard[counter1] = cardsSelected[counter];
              cardsSelected[counter] = null;
              playerBoard.player[order[turn]].hand[cardsLoc[counter].intValue()] = null;
              counter1 = 1000;
            }
          }
        }
      }
      int cardsDiscarded = 0;
      
      playerBoard.player[order[turn]] = DrawCards.main(playerBoard.player[order[turn]], cardsDiscarded);
      
      break;
    case 2: 
      ChapelHand chapel = new ChapelHand();
      boolean[] selected = new boolean[50];
      for (int counter = 0; counter < 50; counter++) {
        selected[counter] = false;
      }
      while (chapel.isShowing()) {
        selected = chapel.GetSelected();
      }
      Integer[] cardsSelected = new Integer[4];
      Integer[] cardsLoc = new Integer[4];
      for (int counter = 0; counter < 50; counter++) {
        if (selected[counter] != 0) {
          for (int counter1 = 0; counter1 < 4; counter1++) {
            if (cardsSelected[counter1] != null)
            {
              cardsSelected[counter1] = playerBoard.player[order[turn]].hand[counter];
              cardsLoc[counter1] = Integer.valueOf(counter);
              counter1 = 4;
            }
          }
        }
      }
      for (int counter = 0; counter < 4; counter++) {
        if (cardsSelected[counter] != null) {
          for (int counter1 = 0; counter1 < 1000; counter1++) {
            if (playerBoard.trash[counter1] == null)
            {
              playerBoard.trash[counter1] = cardsSelected[counter];
              cardsSelected[counter] = null;
              playerBoard.player[order[turn]].hand[cardsLoc[counter].intValue()] = null;
              counter1 = 1000;
            }
          }
        }
      }
      break;
    case 3: 
      break;
    case 4: 
      int answer = -1;
      Object[] options = { "Yes", "No" };
      while (answer < 0) {
        answer = JOptionPane.showOptionDialog(null, "Would you like to place your deck into your discard pile?", 
          playerBoard.player[order[turn]].name, 1, 
          3, null, options, Integer.valueOf(0));
      }
      if (answer == 0) {
        for (int counter = 0; counter < 1000; counter++) {
          if (playerBoard.player[order[turn]].deck[counter] != null) {
            for (int counter1 = 0; counter1 < 1000; counter1++) {
              if (playerBoard.player[order[turn]].discard[counter1] == null)
              {
                playerBoard.player[order[turn]].discard[counter1] = 
                  playerBoard.player[order[turn]].deck[counter];
                playerBoard.player[order[turn]].deck[counter] = null;
                counter1 = 1000;
              }
            }
          }
        }
      }
      break;
    case 5: 
      playerBoard = GainCard.main(playerBoard, cards, order, turn, 4, GainCard.toDiscard);
      
      break;
    case 6: 
      if (playerBoard.board[1][1].total > 0) {
        for (int counter = 0; counter < 1000; counter++) {
          if (playerBoard.player[order[turn]].deck[counter] == null)
          {
            playerBoard.player[order[turn]].deck[counter] = Integer.valueOf(1);
            playerBoard.board[1][1].total -= 1;
            counter = 1000;
          }
        }
      }
      for (int newTurn = (turn + 1) % playerBoard.player.length; newTurn != turn; newTurn = (newTurn + 1) % playerBoard.player.length)
      {
        attackedPlayer = playerBoard.player[order[newTurn]].name;
        boolean moat = false;
        boolean vicCard = false;
        for (int counter = 0; counter < 50; counter++) {
          if (playerBoard.player[order[newTurn]].hand[counter].intValue() == 9) {
            moat = true;
          }
        }
        if (moat)
        {
          DisplayMoat dis = new DisplayMoat();
          while (dis.isShowing()) {
            moat = DisplayMoat.GetAnswer();
          }
        }
        if (!moat)
        {
          for (int counter = 0; counter < 50; counter++) {
            if (cards[playerBoard.player[order[newTurn]].hand[counter].intValue()].victoryCard.intValue() == 1) {
              vicCard = true;
            }
          }
          if (vicCard)
          {
            int cardLoc = 0;
            for (int counter = 0; counter < 50; counter++) {
              if (cards[playerBoard.player[order[newTurn]].hand[counter].intValue()].victoryCard.intValue() == 1) {
                cardLoc = counter;
              }
            }
            for (int counter = 0; counter < 1000; counter++) {
              if (playerBoard.player[order[newTurn]].deck[counter] == null)
              {
                playerBoard.player[order[newTurn]].deck[counter] = 
                  playerBoard.player[order[newTurn]].hand[cardLoc];
                playerBoard.player[order[newTurn]].hand[cardLoc] = null;
              }
            }
          }
        }
      }
      break;
    case 7: 
      for (int counter = 49; counter >= 0; counter--) {
        if (playerBoard.player[order[turn]].play[counter] != null)
        {
          if (playerBoard.player[order[turn]].play[counter].intValue() == 15) {
            for (int counter1 = 0; counter1 < 1000; counter1++) {
              if (playerBoard.trash[counter1] == null)
              {
                playerBoard.trash[counter1] = Integer.valueOf(15);
                playerBoard.player[order[turn]].play[counter] = null;
                counter1 = 1000;
              }
            }
          }
          counter = -1;
        }
      }
      playerBoard = GainCard.main(playerBoard, cards, order, turn, 5, GainCard.toDiscard);
      
      break;
    case 8: 
      for (int newTurn = (turn + 1) % playerBoard.player.length; newTurn != turn; newTurn = (newTurn + 1) % playerBoard.player.length)
      {
        attackedPlayer = playerBoard.player[order[newTurn]].name;
        boolean moat = false;
        for (int counter = 0; counter < 50; counter++) {
          if (playerBoard.player[order[newTurn]].hand[counter].intValue() == 9) {
            moat = true;
          }
        }
        if (moat)
        {
          DisplayMoat dis = new DisplayMoat();
          while (dis.isShowing()) {
            moat = DisplayMoat.GetAnswer();
          }
        }
        if (!moat) {
          if (playerBoard.player[order[newTurn]].hand.length > 3)
          {
            MilitiaHand militia = new MilitiaHand();
            boolean[] selected = new boolean[50];
            for (int counter = 0; counter < 50; counter++) {
              selected[counter] = false;
            }
            while (militia.isShowing()) {
              selected = militia.GetSelected();
            }
            Integer[] cardsSelected = new Integer[50];
            Integer[] cardsLoc = new Integer[50];
            for (int counter = 0; counter < 50; counter++) {
              if (selected[counter] != 0) {
                for (int counter1 = 0; counter1 < 50; counter1++) {
                  if (cardsSelected[counter1] != null)
                  {
                    cardsSelected[counter1] = playerBoard.player[order[turn]].hand[counter];
                    cardsLoc[counter1] = Integer.valueOf(counter);
                    counter1 = 50;
                  }
                }
              }
            }
            for (int counter = 0; counter < 50; counter++) {
              if (cardsSelected[counter] != null) {
                for (int counter1 = 0; counter1 < 1000; counter1++) {
                  if (playerBoard.player[order[turn]].deck[counter1] == null)
                  {
                    playerBoard.player[order[turn]].deck[counter1] = 
                      cardsSelected[counter];
                    playerBoard.player[order[turn]].hand[cardsLoc[counter].intValue()] = null;
                    counter1 = 1000;
                  }
                }
              }
            }
          }
          else
          {
            JOptionPane.showMessageDialog(null, playerBoard.player[order[newTurn]].name + ",\n" + 
              "You already have 3 or less cards");
          }
        }
      }
      break;
    case 9: 
      boolean copper = false;
      int copLoc = 0;
      for (int counter = 0; counter < 50; counter++) {
        if (playerBoard.player[order[turn]].hand[counter].intValue() == 0)
        {
          copper = true;
          copLoc = counter;
        }
      }
      if (copper) {
        for (int counter = 0; counter < 1000; counter++) {
          if (playerBoard.trash[counter] == null)
          {
            playerBoard.trash[counter] = Integer.valueOf(0);
            playerBoard.player[order[turn]].hand[copLoc] = null;
            playerBoard.player[order[turn]].money += 1;
            playerBoard.player[order[turn]].money += 1;
            playerBoard.player[order[turn]].money += 1;
            counter = 1000;
          }
        }
      }
      break;
    case 10: 
      RemodelHand remodel = new RemodelHand();
      boolean[] selected = new boolean[50];
      for (int counter = 0; counter < 50; counter++) {
        selected[counter] = false;
      }
      while (remodel.isShowing()) {
        selected = remodel.GetSelected();
      }
      int cardSelected = 0;
      int cost = 0;
      for (int counter = 0; counter < 50; counter++) {
        if (selected[counter] != 0)
        {
          cardSelected = playerBoard.player[order[turn]].hand[counter].intValue();
          playerBoard.player[order[turn]].hand[counter] = null;
          counter = 50;
        }
      }
      cost = cards[cardSelected].cost.intValue() + 2;
      for (int counter = 0; counter < 1000; counter++) {
        if (playerBoard.trash[counter] == null) {
          playerBoard.trash[counter] = Integer.valueOf(cardSelected);
        }
      }
      playerBoard = GainCard.main(playerBoard, cards, order, turn, cost, GainCard.toDiscard);
      
      break;
    case 11: 
      int topCardLoc = 0;
      for (int counter = 0; counter < 1000; counter++) {
        if (playerBoard.player[order[turn]].discard[counter] == null)
        {
          playerBoard.player[order[turn]].discard[counter] = 
            playerBoard.player[order[turn]].deck[topCardLoc];
          playerBoard.player[order[turn]].deck[topCardLoc] = null;
          counter = 1000;
        }
      }
      for (int newTurn = (turn + 1) % playerBoard.player.length; newTurn != turn; newTurn = (newTurn + 1) % playerBoard.player.length)
      {
        attackedPlayer = playerBoard.player[order[newTurn]].name;
        boolean moat = false;
        for (int counter = 0; counter < 50; counter++) {
          if (playerBoard.player[order[newTurn]].hand[counter].intValue() == 9) {
            moat = true;
          }
        }
        if (moat)
        {
          DisplayMoat dis = new DisplayMoat();
          while (dis.isShowing()) {
            moat = DisplayMoat.GetAnswer();
          }
        }
        if (!moat)
        {
          topCardLoc = 0;
          for (int counter = 0; counter < 1000; counter++) {
            if (playerBoard.player[order[newTurn]].discard[counter] == null)
            {
              playerBoard.player[order[newTurn]].discard[counter] = 
                playerBoard.player[order[turn]].deck[topCardLoc];
              playerBoard.player[order[newTurn]].deck[topCardLoc] = null;
              counter = 1000;
            }
          }
        }
      }
      break;
    case 12: 
      for (int newTurn = (turn + 1) % playerBoard.player.length; newTurn != turn; newTurn = (newTurn + 1) % playerBoard.player.length)
      {
        attackedPlayer = playerBoard.player[order[newTurn]].name;
        boolean moat = false;
        for (int counter = 0; counter < 50; counter++) {
          if (playerBoard.player[order[newTurn]].hand[counter].intValue() == 9) {
            moat = true;
          }
        }
        if (moat)
        {
          DisplayMoat dis = new DisplayMoat();
          while (dis.isShowing()) {
            moat = DisplayMoat.GetAnswer();
          }
        }
        if (!moat)
        {
          Integer trashCardLoc = null;
          Integer gainCardLoc = null;
          Integer discardCardLoc = null;
          if (trashCardLoc != null) {
            for (int counter = 0; counter < 1000; counter++) {
              if (playerBoard.trash[counter] == null)
              {
                playerBoard.trash[counter] = playerBoard.player[order[newTurn]].deck[trashCardLoc.intValue()];
                playerBoard.player[order[newTurn]].deck[trashCardLoc.intValue()] = null;
              }
            }
          }
          if (gainCardLoc != null) {
            for (int counter = 0; counter < 1000; counter++) {
              if (playerBoard.player[order[turn]].discard[counter] == null)
              {
                playerBoard.player[order[turn]].discard[counter] = 
                  playerBoard.player[order[newTurn]].deck[gainCardLoc.intValue()];
                playerBoard.player[order[newTurn]].deck[gainCardLoc.intValue()] = null;
              }
            }
          }
          if (discardCardLoc != null) {
            for (int counter = 0; counter < 1000; counter++) {
              if (playerBoard.player[order[newTurn]].discard[counter] == null)
              {
                playerBoard.player[order[newTurn]].discard[counter] = 
                  playerBoard.player[order[newTurn]].deck[gainCardLoc.intValue()];
                playerBoard.player[order[newTurn]].deck[gainCardLoc.intValue()] = null;
              }
            }
          }
        }
      }
      break;
    case 13: 
      boolean action = false;
      for (int counter = 0; counter < 50; counter++) {
        if (cards[playerBoard.player[order[turn]].hand[counter].intValue()].actionCost.intValue() == 1) {
          action = true;
        }
      }
      if (action)
      {
        playerBoard.player[order[turn]].actions += 1;
        int selectedCard = 0;int cardLoc = 0;
        playerBoard = PlayCard.main(playerBoard, cards, selectedCard, cardLoc, order, turn, false);
        playerBoard = PlayCard.main(playerBoard, cards, selectedCard, cardLoc, order, turn, true);
      }
      break;
    case 14: 
      for (int newTurn = (turn + 1) % playerBoard.player.length; newTurn != turn; newTurn = (newTurn + 1) % playerBoard.player.length) {
        playerBoard.player[order[newTurn]] = DrawCards.main(playerBoard.player[order[newTurn]], 1);
      }
      break;
    case 15: 
      int cardsAlready = 0;
      for (int counter = 0; counter < 50; counter++) {
        if (playerBoard.player[order[turn]].hand[counter] != null) {
          cardsAlready++;
        }
      }
      int cardsInHand = cardsAlready;
      Integer setAsideLoc = null;
      int counter;
      for (; cardsInHand < 7; counter < 50)
    	  //Loop needs fixing
      {
        playerBoard.player[order[turn]] = DrawCards.main(playerBoard.player[order[turn]], 7 - cardsInHand);
        
        cardsInHand = 7;
        if (setAsideLoc != null) {
          for (int counter = 0; counter < 1000; counter++) {
            if (playerBoard.setAside[counter] == null)
            {
              playerBoard.setAside[counter] = playerBoard.player[order[turn]].hand[setAsideLoc.intValue()];
              playerBoard.player[order[turn]].hand[setAsideLoc.intValue()] = null;
              counter = 1000;
              cardsInHand--;
            }
          }
        }
        counter = 0; continue;
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
        counter++;
      }
      break;
    case 16: 
      boolean cardInHand = false;
      for (int counter = 0; counter < 50; counter++) {
        if (playerBoard.player[order[turn]].hand[counter] != null) {
          cardInHand = true;
        }
      }
      if (cardInHand)
      {
        RemodelHand remodel = new RemodelHand();
        boolean[] selected = new boolean[50];
        for (int counter = 0; counter < 50; counter++) {
          selected[counter] = false;
        }
        while (remodel.isShowing()) {
          selected = remodel.GetSelected();
        }
        int cardSelected = 0;
        int cost = 0;
        for (int counter = 0; counter < 50; counter++) {
          if (selected[counter] != 0)
          {
            cardSelected = playerBoard.player[order[turn]].hand[counter].intValue();
            playerBoard.player[order[turn]].hand[counter] = null;
            counter = 50;
          }
        }
        for (int counter = 0; counter < 1000; counter++) {
          if (playerBoard.trash[counter] == null)
          {
            playerBoard.trash[counter] = null;
            counter = 1000;
          }
        }
        cost = cards[cardSelected].cost.intValue() + 3;
        if (cost < 3)
        {
          JOptionPane.showMessageDialog(null, "You gained a copper");
          for (int counter = 0; counter < 50; counter++) {
            if (playerBoard.player[order[turn]].hand[counter] == null)
            {
              playerBoard.player[order[turn]].hand[counter] = Integer.valueOf(0);
              playerBoard.board[0][1].total -= 1;
              counter = 50;
            }
          }
          if (playerBoard.board[0][1].total == 0)
          {
            int largest = playerBoard.randomPileGone;
            for (int y1 = 0; y1 < 4; y1++) {
              for (int x1 = 0; x1 < 4; x1++) {
                if (playerBoard.board[x1][y1].orderGone > largest) {
                  largest = playerBoard.board[x1][y1].orderGone;
                }
              }
            }
            playerBoard.board[0][1].orderGone = (largest + 1);
            if (largest == 3) {
              EndGame.main(playerBoard, cards, order, turn);
            }
          }
        }
        else
        {
          int answer = GainTreasure.main(playerBoard.board, cost);
          if (answer == 0)
          {
            for (int counter = 0; counter < 50; counter++) {
              if (playerBoard.player[order[turn]].hand[counter] == null)
              {
                playerBoard.player[order[turn]].hand[counter] = Integer.valueOf(0);
                playerBoard.board[0][1].total -= 1;
                counter = 50;
              }
            }
            if (playerBoard.board[0][1].total == 0)
            {
              int largest = playerBoard.randomPileGone;
              for (int y1 = 0; y1 < 4; y1++) {
                for (int x1 = 0; x1 < 4; x1++) {
                  if (playerBoard.board[x1][y1].orderGone > largest) {
                    largest = playerBoard.board[x1][y1].orderGone;
                  }
                }
              }
              playerBoard.board[0][1].orderGone = (largest + 1);
              if (largest == 3) {
                EndGame.main(playerBoard, cards, order, turn);
              }
            }
          }
          if (answer == 1)
          {
            for (int counter = 0; counter < 50; counter++) {
              if (playerBoard.player[order[turn]].hand[counter] == null)
              {
                playerBoard.player[order[turn]].hand[counter] = Integer.valueOf(0);
                playerBoard.board[1][1].total -= 1;
                counter = 50;
              }
            }
            if (playerBoard.board[1][1].total == 0)
            {
              int largest = playerBoard.randomPileGone;
              for (int y1 = 0; y1 < 4; y1++) {
                for (int x1 = 0; x1 < 4; x1++) {
                  if (playerBoard.board[x1][y1].orderGone > largest) {
                    largest = playerBoard.board[x1][y1].orderGone;
                  }
                }
              }
              playerBoard.board[1][1].orderGone = (largest + 1);
              if (largest == 3) {
                EndGame.main(playerBoard, cards, order, turn);
              }
            }
          }
          if (answer == 2)
          {
            for (int counter = 0; counter < 50; counter++) {
              if (playerBoard.player[order[turn]].hand[counter] == null)
              {
                playerBoard.player[order[turn]].hand[counter] = Integer.valueOf(0);
                playerBoard.board[2][1].total -= 1;
                counter = 50;
              }
            }
            if (playerBoard.board[2][1].total == 0)
            {
              int largest = playerBoard.randomPileGone;
              for (int y1 = 0; y1 < 4; y1++) {
                for (int x1 = 0; x1 < 4; x1++) {
                  if (playerBoard.board[x1][y1].orderGone > largest) {
                    largest = playerBoard.board[x1][y1].orderGone;
                  }
                }
              }
              playerBoard.board[2][1].orderGone = (largest + 1);
              if (largest == 3) {
                EndGame.main(playerBoard, cards, order, turn);
              }
            }
          }
        }
      }
      else
      {
        JOptionPane.showMessageDialog(null, playerBoard.player[order[turn]].name + "," + 
          "You do not have any cards in your hand to trash");
      }
      break;
    case 17: 
      for (int newTurn = (turn + 1) % playerBoard.player.length; newTurn != turn; newTurn = (newTurn + 1) % playerBoard.player.length)
      {
        attackedPlayer = playerBoard.player[order[newTurn]].name;
        if (playerBoard.board[3][0].total > 0)
        {
          boolean moat = false;
          for (int counter = 0; counter < 50; counter++) {
            if (playerBoard.player[order[newTurn]].hand[counter].intValue() == 9) {
              moat = true;
            }
          }
          if (moat)
          {
            DisplayMoat dis = new DisplayMoat();
            while (dis.isShowing()) {
              moat = DisplayMoat.GetAnswer();
            }
          }
          if (!moat) {
            for (int counter = 0; counter < 1000; counter++) {
              if (playerBoard.player[order[newTurn]].discard[counter] == null)
              {
                playerBoard.player[order[newTurn]].discard[counter] = Integer.valueOf(6);
                playerBoard.board[3][0].total -= 1;
                if (playerBoard.board[3][0].total == 0)
                {
                  int largest = playerBoard.randomPileGone;
                  for (int y = 0; y < 4; y++) {
                    for (int x = 0; x < 4; x++) {
                      if (playerBoard.board[x][y].orderGone > largest) {
                        largest = playerBoard.board[x][y].orderGone;
                      }
                    }
                  }
                  playerBoard.board[3][0].orderGone = (largest + 1);
                  if (largest + 1 == 3) {
                    EndGame.main(playerBoard, cards, order, newTurn);
                  }
                }
              }
            }
          }
        }
        else
        {
          JOptionPane.showMessageDialog(null, "There are no curses left in the pile");
        }
      }
      break;
    case 18: 
      Integer[] revealed = new Integer[2];
      int treasures = 0;
      int counter = 0;
      int shuffles = 0;
      while (treasures < 2)
      {
        for (counter = 999; counter >= 0; counter--) {
          if (playerBoard.player[order[turn]].deck[counter] != null)
          {
            revealed[treasures] = 
              playerBoard.player[order[turn]].deck[counter];
            
            playerBoard.player[order[turn]].deck[counter] = null;
            try
            {
              Thread.sleep(2000L);
            }
            catch (InterruptedException localInterruptedException) {}
            if (cards[revealed[treasures].intValue()].treasureCard.intValue() == 1) {
              for (int counter1 = 0; counter1 < 50; counter1++) {
                if (playerBoard.player[order[turn]].hand[counter1] == null)
                {
                  playerBoard.player[order[turn]].hand[counter1] = revealed[treasures];
                  treasures++;
                  counter1 = 50;
                }
              }
            } else {
              for (int counter1 = 0; counter1 < 1000; counter1++) {
                if (playerBoard.setAside[counter1] == null)
                {
                  playerBoard.setAside[counter1] = revealed[treasures];
                  counter1 = 50;
                }
              }
            }
            counter = -100;
          }
        }
        if (counter > -50)
        {
          shuffles++;
          if (shuffles < 2)
          {
            Random rand = new Random();
            for (counter = 0; counter < 1000; counter++) {
              if (playerBoard.player[order[turn]].discard[counter] != null)
              {
                int cardLoc = rand.nextInt(1000);
                while (playerBoard.player[order[turn]].deck[cardLoc] != null) {
                  cardLoc = (cardLoc + 1) % 1000;
                }
                playerBoard.player[order[turn]].deck[cardLoc] = 
                  playerBoard.player[order[turn]].discard[counter];
                playerBoard.player[order[turn]].discard[counter] = null;
              }
            }
            for (counter = 0; counter < 1000; counter++) {
              if (playerBoard.player[order[turn]].deck[counter] == null) {
                for (int counter1 = counter + 1; counter1 < 1000; counter1++) {
                  if (playerBoard.player[order[turn]].deck[counter1] != null)
                  {
                    playerBoard.player[order[turn]].deck[counter] = 
                      playerBoard.player[order[turn]].deck[counter1];
                    playerBoard.player[order[turn]].deck[counter1] = null;
                    counter1 = 1000;
                  }
                }
              }
            }
          }
          else
          {
            treasures = 2;
          }
        }
      }
      for (counter = 0; counter < 1000; counter++) {
        if (playerBoard.setAside[counter] != null) {
          for (int counter1 = 0; counter1 < 1000; counter1++) {
            if (playerBoard.player[order[turn]].discard[counter1] == null)
            {
              playerBoard.player[order[turn]].discard[counter1] = 
                playerBoard.setAside[counter];
              playerBoard.setAside[counter] = null;
              counter1 = 1000;
            }
          }
        }
      }
    }
    return playerBoard;
  }
  
  public static Integer[] GetHand()
  {
    return hand;
  }
  
  public static String GetAttack()
  {
    return attack;
  }
  
  public static String GetPlayer()
  {
    return player;
  }
  
  public static String GetAttackedPlayer()
  {
    return attackedPlayer;
  }
}
