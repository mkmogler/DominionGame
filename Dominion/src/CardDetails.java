public class CardDetails
{
  public static Card[] main()
  {
    Card[] cards = new Card[''];
    //Some Symbol Removed

    
    cards[0] = new Card();
    cards[0].name = "Copper";
    cards[0].money = Integer.valueOf(1);
    cards[0].treasureCard = Integer.valueOf(1);
    cards[0].img = "copper.jpg";
    
    cards[1] = new Card();
    cards[1].name = "Silver";
    cards[1].money = Integer.valueOf(2);
    cards[1].treasureCard = Integer.valueOf(1);
    cards[1].img = "silver.jpg";
    cards[1].cost = Integer.valueOf(3);
    
    cards[2] = new Card();
    cards[2].name = "Gold";
    cards[2].money = Integer.valueOf(3);
    cards[2].treasureCard = Integer.valueOf(1);
    cards[2].img = "gold.jpg";
    cards[2].cost = Integer.valueOf(6);
    
    cards[3] = new Card();
    cards[3].name = "Estate";
    cards[3].points = Integer.valueOf(1);
    cards[3].victoryCard = Integer.valueOf(1);
    cards[3].img = "estate.jpg";
    cards[3].cost = Integer.valueOf(2);
    
    cards[4] = new Card();
    cards[4].name = "Duchy";
    cards[4].points = Integer.valueOf(3);
    cards[4].victoryCard = Integer.valueOf(1);
    cards[4].img = "duchy.jpg";
    cards[4].cost = Integer.valueOf(5);
    
    cards[5] = new Card();
    cards[5].name = "Province";
    cards[5].points = Integer.valueOf(6);
    cards[5].victoryCard = Integer.valueOf(1);
    cards[5].img = "province.jpg";
    cards[5].cost = Integer.valueOf(8);
    
    cards[6] = new Card();
    cards[6].name = "Curse";
    cards[6].points = Integer.valueOf(-1);
    cards[6].victoryCard = Integer.valueOf(1);
    cards[6].img = "curse.jpg";
    cards[6].cost = Integer.valueOf(0);
    
    cards[7] = new Card();
    cards[7].name = "Cellar";
    cards[7].action = Integer.valueOf(1);
    cards[7].actionSpecial = Integer.valueOf(1);
    cards[7].img = "cellar.jpg";
    cards[7].cost = Integer.valueOf(2);
    cards[7].special = Integer.valueOf(1);
    
    cards[8] = new Card();
    cards[8].name = "Chapel";
    cards[8].action = Integer.valueOf(0);
    cards[8].actionSpecial = Integer.valueOf(2);
    cards[8].img = "chapel.jpg";
    cards[8].cost = Integer.valueOf(2);
    cards[8].special = Integer.valueOf(1);
    
    cards[9] = new Card();
    cards[9].name = "Moat";
    cards[9].draws = Integer.valueOf(2);
    cards[9].actionSpecial = Integer.valueOf(3);
    cards[9].img = "moat.jpg";
    cards[9].cost = Integer.valueOf(2);
    cards[9].special = Integer.valueOf(1);
    
    cards[10] = new Card();
    cards[10].name = "Chancellor";
    cards[10].money = Integer.valueOf(2);
    cards[10].actionSpecial = Integer.valueOf(4);
    cards[10].img = "chancellor.jpg";
    cards[10].cost = Integer.valueOf(3);
    cards[10].special = Integer.valueOf(1);
    
    cards[11] = new Card();
    cards[11].name = "Village";
    cards[11].action = Integer.valueOf(2);
    cards[11].actionSpecial = Integer.valueOf(0);
    cards[11].img = "village.jpg";
    cards[11].cost = Integer.valueOf(3);
    cards[11].draws = Integer.valueOf(1);
    
    cards[12] = new Card();
    cards[12].name = "Woodcutter";
    cards[12].money = Integer.valueOf(2);
    cards[12].actionSpecial = Integer.valueOf(0);
    cards[12].img = "woodcutter.jpg";
    cards[12].cost = Integer.valueOf(3);
    cards[12].buy = Integer.valueOf(1);
    
    cards[13] = new Card();
    cards[13].name = "Workshop";
    cards[13].money = Integer.valueOf(0);
    cards[13].actionSpecial = Integer.valueOf(5);
    cards[13].img = "workshop.jpg";
    cards[13].cost = Integer.valueOf(3);
    cards[13].special = Integer.valueOf(1);
    
    cards[14] = new Card();
    cards[14].name = "Bureaucrat";
    cards[14].money = Integer.valueOf(0);
    cards[14].actionSpecial = Integer.valueOf(6);
    cards[14].img = "bureaucrat.jpg";
    cards[14].cost = Integer.valueOf(4);
    cards[14].special = Integer.valueOf(1);
    
    cards[15] = new Card();
    cards[15].name = "Feast";
    cards[15].money = Integer.valueOf(0);
    cards[15].actionSpecial = Integer.valueOf(7);
    cards[15].img = "feast.jpg";
    cards[15].cost = Integer.valueOf(4);
    cards[15].special = Integer.valueOf(1);
    
    cards[16] = new Card();
    cards[16].name = "Gardens";
    cards[16].money = Integer.valueOf(0);
    cards[16].victorySpecial = Integer.valueOf(1);
    cards[16].img = "Gardens.jpg";
    cards[16].cost = Integer.valueOf(4);
    cards[16].special = Integer.valueOf(2);
    
    cards[17] = new Card();
    cards[17].name = "Militia";
    cards[17].money = Integer.valueOf(2);
    cards[17].actionSpecial = Integer.valueOf(8);
    cards[17].img = "militia.jpg";
    cards[17].cost = Integer.valueOf(4);
    cards[17].special = Integer.valueOf(1);
    
    cards[18] = new Card();
    cards[18].name = "Moneylender";
    cards[18].money = Integer.valueOf(0);
    cards[18].actionSpecial = Integer.valueOf(9);
    cards[18].img = "moneylender.jpg";
    cards[18].cost = Integer.valueOf(4);
    cards[18].special = Integer.valueOf(1);
    
    cards[19] = new Card();
    cards[19].name = "Remodel";
    cards[19].money = Integer.valueOf(0);
    cards[19].actionSpecial = Integer.valueOf(10);
    cards[19].img = "remodel.jpg";
    cards[19].cost = Integer.valueOf(3);
    cards[19].special = Integer.valueOf(1);
    
    cards[20] = new Card();
    cards[20].name = "Smithy";
    cards[20].draws = Integer.valueOf(3);
    cards[20].actionSpecial = Integer.valueOf(0);
    cards[20].img = "smithy.jpg";
    cards[20].cost = Integer.valueOf(4);
    cards[20].special = Integer.valueOf(0);
    
    cards[21] = new Card();
    cards[21].name = "Spy";
    cards[21].draws = Integer.valueOf(1);
    cards[21].action = Integer.valueOf(1);
    cards[21].actionSpecial = Integer.valueOf(11);
    cards[21].img = "spy.jpg";
    cards[21].cost = Integer.valueOf(4);
    cards[21].special = Integer.valueOf(1);
    
    cards[22] = new Card();
    cards[22].name = "Thief";
    cards[22].draws = Integer.valueOf(0);
    cards[22].actionSpecial = Integer.valueOf(12);
    cards[22].img = "thief.jpg";
    cards[22].cost = Integer.valueOf(4);
    cards[22].special = Integer.valueOf(1);
    
    cards[23] = new Card();
    cards[23].name = "Throne Room";
    cards[23].draws = Integer.valueOf(0);
    cards[23].actionSpecial = Integer.valueOf(13);
    cards[23].img = "throneroom.jpg";
    cards[23].cost = Integer.valueOf(4);
    cards[23].special = Integer.valueOf(1);
    
    cards[24] = new Card();
    cards[24].name = "Council Room";
    cards[24].draws = Integer.valueOf(4);
    cards[24].actionSpecial = Integer.valueOf(14);
    cards[24].img = "councilroom.jpg";
    cards[24].cost = Integer.valueOf(5);
    cards[24].special = Integer.valueOf(1);
    cards[24].buy = Integer.valueOf(1);
    
    cards[25] = new Card();
    cards[25].name = "Festival";
    cards[25].action = Integer.valueOf(2);
    cards[25].buy = Integer.valueOf(1);
    cards[25].img = "festival.jpg";
    cards[25].cost = Integer.valueOf(5);
    cards[25].money = Integer.valueOf(2);
    
    cards[26] = new Card();
    cards[26].name = "Laboratory";
    cards[26].draws = Integer.valueOf(2);
    cards[26].actionSpecial = Integer.valueOf(0);
    cards[26].img = "laboratory.jpg";
    cards[26].cost = Integer.valueOf(5);
    cards[26].action = Integer.valueOf(1);
    
    cards[27] = new Card();
    cards[27].name = "Library";
    cards[27].draws = Integer.valueOf(0);
    cards[27].actionSpecial = Integer.valueOf(15);
    cards[27].img = "library.jpg";
    cards[27].cost = Integer.valueOf(5);
    cards[27].special = Integer.valueOf(1);
    
    cards[28] = new Card();
    cards[28].name = "Market";
    cards[28].draws = Integer.valueOf(1);
    cards[28].action = Integer.valueOf(1);
    cards[28].img = "market.jpg";
    cards[28].cost = Integer.valueOf(5);
    cards[28].buy = Integer.valueOf(1);
    cards[28].money = Integer.valueOf(1);
    
    cards[29] = new Card();
    cards[29].name = "Mine";
    cards[29].draws = Integer.valueOf(0);
    cards[29].actionSpecial = Integer.valueOf(16);
    cards[29].img = "mine.jpg";
    cards[29].cost = Integer.valueOf(5);
    cards[29].special = Integer.valueOf(1);
    
    cards[30] = new Card();
    cards[30].name = "Witch";
    cards[30].draws = Integer.valueOf(2);
    cards[30].actionSpecial = Integer.valueOf(17);
    cards[30].img = "witch.jpg";
    cards[30].cost = Integer.valueOf(5);
    cards[30].special = Integer.valueOf(1);
    
    cards[31] = new Card();
    cards[31].name = "Adventurer";
    cards[31].draws = Integer.valueOf(0);
    cards[31].actionSpecial = Integer.valueOf(18);
    cards[31].img = "adventurer.jpg";
    cards[31].cost = Integer.valueOf(6);
    cards[31].special = Integer.valueOf(1);
    
    return cards;
  }
}
