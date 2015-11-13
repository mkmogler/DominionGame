public class Players
{
  String name;
  Integer[] deck;
  Integer[] hand;
  Integer[] play;
  Integer[] discard;
  int money;
  int actions;
  int buys;
  int points = 0;
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String t)
  {
    this.name = t;
  }
}
