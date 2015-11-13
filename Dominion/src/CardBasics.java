public class CardBasics
{
  Card[] cards;
  
  public CardBasics()
  {
    this.cards = new Card[''];
    //Removed some symbol that Eclipse didn't like
    
    this.cards[0] = new Card();
    this.cards[0].name = "Copper";
    this.cards[0].money = Integer.valueOf(1);
    this.cards[0].treasureCard = Integer.valueOf(1);
    this.cards[0].img = "copper.jpg";
    
    this.cards[1] = new Card();
    this.cards[1].name = "Silver";
    this.cards[1].money = Integer.valueOf(2);
    this.cards[1].treasureCard = Integer.valueOf(1);
    this.cards[1].img = "silver.jpg";
    this.cards[1].cost = Integer.valueOf(3);
    
    this.cards[2] = new Card();
    this.cards[2].name = "Gold";
    this.cards[2].money = Integer.valueOf(3);
    this.cards[2].treasureCard = Integer.valueOf(1);
    this.cards[2].img = "gold.jpg";
    this.cards[2].cost = Integer.valueOf(6);
    
    this.cards[3] = new Card();
    this.cards[3].name = "Estate";
    this.cards[3].points = Integer.valueOf(1);
    this.cards[3].victoryCard = Integer.valueOf(1);
    this.cards[3].img = "estate.jpg";
    this.cards[3].cost = Integer.valueOf(2);
    
    this.cards[4] = new Card();
    this.cards[4].name = "Duchy";
    this.cards[4].points = Integer.valueOf(3);
    this.cards[4].victoryCard = Integer.valueOf(1);
    this.cards[4].img = "duchy.jpg";
    this.cards[4].cost = Integer.valueOf(5);
    
    this.cards[5] = new Card();
    this.cards[5].name = "Province";
    this.cards[5].points = Integer.valueOf(6);
    this.cards[5].victoryCard = Integer.valueOf(1);
    this.cards[5].img = "province.jpg";
    this.cards[5].cost = Integer.valueOf(8);
    
    this.cards[6] = new Card();
    this.cards[6].name = "Curse";
    this.cards[6].points = Integer.valueOf(-1);
    this.cards[6].victoryCard = Integer.valueOf(1);
    this.cards[6].img = "curse.jpg";
    this.cards[6].cost = Integer.valueOf(0);
    
    this.cards[7] = new Card();
    this.cards[7].name = "Cellar";
    this.cards[7].action = Integer.valueOf(1);
    this.cards[7].actionSpecial = Integer.valueOf(1);
    this.cards[7].img = "cellar.jpg";
    this.cards[7].cost = Integer.valueOf(2);
    this.cards[7].special = Integer.valueOf(1);
    
    this.cards[8] = new Card();
    this.cards[8].name = "Chapel";
    this.cards[8].action = Integer.valueOf(0);
    this.cards[8].actionSpecial = Integer.valueOf(2);
    this.cards[8].img = "chapel.jpg";
    this.cards[8].cost = Integer.valueOf(2);
    this.cards[8].special = Integer.valueOf(1);
    
    this.cards[9] = new Card();
    this.cards[9].name = "Moat";
    this.cards[9].draws = Integer.valueOf(2);
    this.cards[9].actionSpecial = Integer.valueOf(3);
    this.cards[9].img = "moat.jpg";
    this.cards[9].cost = Integer.valueOf(2);
    this.cards[9].special = Integer.valueOf(1);
    
    this.cards[10] = new Card();
    this.cards[10].name = "Chancellor";
    this.cards[10].money = Integer.valueOf(2);
    this.cards[10].actionSpecial = Integer.valueOf(4);
    this.cards[10].img = "chancellor.jpg";
    this.cards[10].cost = Integer.valueOf(3);
    this.cards[10].special = Integer.valueOf(1);
    
    this.cards[11] = new Card();
    this.cards[11].name = "Village";
    this.cards[11].action = Integer.valueOf(2);
    this.cards[11].actionSpecial = Integer.valueOf(0);
    this.cards[11].img = "village.jpg";
    this.cards[11].cost = Integer.valueOf(3);
    this.cards[11].draws = Integer.valueOf(1);
    
    this.cards[12] = new Card();
    this.cards[12].name = "Woodcutter";
    this.cards[12].money = Integer.valueOf(2);
    this.cards[12].actionSpecial = Integer.valueOf(0);
    this.cards[12].img = "woodcutter.jpg";
    this.cards[12].cost = Integer.valueOf(3);
    this.cards[12].buy = Integer.valueOf(1);
    
    this.cards[13] = new Card();
    this.cards[13].name = "Workshop";
    this.cards[13].money = Integer.valueOf(0);
    this.cards[13].actionSpecial = Integer.valueOf(5);
    this.cards[13].img = "workshop.jpg";
    this.cards[13].cost = Integer.valueOf(3);
    this.cards[13].special = Integer.valueOf(1);
    
    this.cards[14] = new Card();
    this.cards[14].name = "Bureaucrat";
    this.cards[14].money = Integer.valueOf(0);
    this.cards[14].actionSpecial = Integer.valueOf(6);
    this.cards[14].img = "bureaucrat.jpg";
    this.cards[14].cost = Integer.valueOf(4);
    this.cards[14].special = Integer.valueOf(1);
    
    this.cards[15] = new Card();
    this.cards[15].name = "Feast";
    this.cards[15].money = Integer.valueOf(0);
    this.cards[15].actionSpecial = Integer.valueOf(7);
    this.cards[15].img = "feast.jpg";
    this.cards[15].cost = Integer.valueOf(4);
    this.cards[15].special = Integer.valueOf(1);
    
    this.cards[16] = new Card();
    this.cards[16].name = "Gardens";
    this.cards[16].money = Integer.valueOf(0);
    this.cards[16].victorySpecial = Integer.valueOf(1);
    this.cards[16].img = "Gardens.jpg";
    this.cards[16].cost = Integer.valueOf(4);
    this.cards[16].special = Integer.valueOf(2);
    
    this.cards[17] = new Card();
    this.cards[17].name = "Militia";
    this.cards[17].money = Integer.valueOf(2);
    this.cards[17].actionSpecial = Integer.valueOf(8);
    this.cards[17].img = "militia.jpg";
    this.cards[17].cost = Integer.valueOf(4);
    this.cards[17].special = Integer.valueOf(1);
    
    this.cards[18] = new Card();
    this.cards[18].name = "Moneylender";
    this.cards[18].money = Integer.valueOf(0);
    this.cards[18].actionSpecial = Integer.valueOf(9);
    this.cards[18].img = "moneylender.jpg";
    this.cards[18].cost = Integer.valueOf(4);
    this.cards[18].special = Integer.valueOf(1);
    
    this.cards[19] = new Card();
    this.cards[19].name = "Remodel";
    this.cards[19].money = Integer.valueOf(0);
    this.cards[19].actionSpecial = Integer.valueOf(10);
    this.cards[19].img = "remodel.jpg";
    this.cards[19].cost = Integer.valueOf(3);
    this.cards[19].special = Integer.valueOf(1);
    
    this.cards[20] = new Card();
    this.cards[20].name = "Smithy";
    this.cards[20].draws = Integer.valueOf(3);
    this.cards[20].actionSpecial = Integer.valueOf(0);
    this.cards[20].img = "smithy.jpg";
    this.cards[20].cost = Integer.valueOf(4);
    this.cards[20].special = Integer.valueOf(0);
    
    this.cards[21] = new Card();
    this.cards[21].name = "Spy";
    this.cards[21].draws = Integer.valueOf(1);
    this.cards[21].action = Integer.valueOf(1);
    this.cards[21].actionSpecial = Integer.valueOf(11);
    this.cards[21].img = "spy.jpg";
    this.cards[21].cost = Integer.valueOf(4);
    this.cards[21].special = Integer.valueOf(1);
    
    this.cards[22] = new Card();
    this.cards[22].name = "Thief";
    this.cards[22].draws = Integer.valueOf(0);
    this.cards[22].actionSpecial = Integer.valueOf(12);
    this.cards[22].img = "thief.jpg";
    this.cards[22].cost = Integer.valueOf(4);
    this.cards[22].special = Integer.valueOf(1);
    
    this.cards[23] = new Card();
    this.cards[23].name = "Throne Room";
    this.cards[23].draws = Integer.valueOf(0);
    this.cards[23].actionSpecial = Integer.valueOf(13);
    this.cards[23].img = "throneroom.jpg";
    this.cards[23].cost = Integer.valueOf(4);
    this.cards[23].special = Integer.valueOf(1);
    
    this.cards[24] = new Card();
    this.cards[24].name = "Council Room";
    this.cards[24].draws = Integer.valueOf(4);
    this.cards[24].actionSpecial = Integer.valueOf(14);
    this.cards[24].img = "councilroom.jpg";
    this.cards[24].cost = Integer.valueOf(5);
    this.cards[24].special = Integer.valueOf(1);
    this.cards[24].buy = Integer.valueOf(1);
    
    this.cards[25] = new Card();
    this.cards[25].name = "Festival";
    this.cards[25].action = Integer.valueOf(2);
    this.cards[25].buy = Integer.valueOf(1);
    this.cards[25].img = "festival.jpg";
    this.cards[25].cost = Integer.valueOf(5);
    this.cards[25].money = Integer.valueOf(2);
    
    this.cards[26] = new Card();
    this.cards[26].name = "Laboratory";
    this.cards[26].draws = Integer.valueOf(2);
    this.cards[26].actionSpecial = Integer.valueOf(0);
    this.cards[26].img = "laboratory.jpg";
    this.cards[26].cost = Integer.valueOf(5);
    this.cards[26].action = Integer.valueOf(1);
    
    this.cards[27] = new Card();
    this.cards[27].name = "Library";
    this.cards[27].draws = Integer.valueOf(0);
    this.cards[27].actionSpecial = Integer.valueOf(15);
    this.cards[27].img = "library.jpg";
    this.cards[27].cost = Integer.valueOf(5);
    this.cards[27].special = Integer.valueOf(1);
    
    this.cards[28] = new Card();
    this.cards[28].name = "Market";
    this.cards[28].draws = Integer.valueOf(1);
    this.cards[28].action = Integer.valueOf(1);
    this.cards[28].img = "market.jpg";
    this.cards[28].cost = Integer.valueOf(5);
    this.cards[28].buy = Integer.valueOf(1);
    this.cards[28].money = Integer.valueOf(1);
    
    this.cards[29] = new Card();
    this.cards[29].name = "Mine";
    this.cards[29].draws = Integer.valueOf(0);
    this.cards[29].actionSpecial = Integer.valueOf(16);
    this.cards[29].img = "mine.jpg";
    this.cards[29].cost = Integer.valueOf(5);
    this.cards[29].special = Integer.valueOf(1);
    
    this.cards[30] = new Card();
    this.cards[30].name = "Witch";
    this.cards[30].draws = Integer.valueOf(2);
    this.cards[30].actionSpecial = Integer.valueOf(17);
    this.cards[30].img = "witch.jpg";
    this.cards[30].cost = Integer.valueOf(5);
    this.cards[30].special = Integer.valueOf(1);
    
    this.cards[30] = new Card();
    this.cards[30].name = "Adventurer";
    this.cards[30].draws = Integer.valueOf(0);
    this.cards[30].actionSpecial = Integer.valueOf(18);
    this.cards[30].img = "adventurer.jpg";
    this.cards[30].cost = Integer.valueOf(6);
    this.cards[30].special = Integer.valueOf(1);
  }
}
