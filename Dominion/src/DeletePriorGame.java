public class DeletePriorGame
{
  public static void main()
  {
    StartUp oldStart = Dominion.GetStart();
    oldStart.dispose();
    if (RunNewGame.GetStart() != null)
    {
      oldStart = RunNewGame.GetStart();
      oldStart.dispose();
    }
    RunNewGame.main();
  }
}
