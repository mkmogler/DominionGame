import java.io.File;
import java.io.PrintStream;

public class DisplayRules
{
  public static void main()
  {
    try
    {
      if (new File("rules.pdf").exists())
      {
        Process p = 
          Runtime.getRuntime()
          .exec("rundll32 url.dll,FileProtocolHandler rules.pdf");
        p.waitFor();
      }
      else
      {
        System.out.println("rules.pdf does not exists");
      }
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}
