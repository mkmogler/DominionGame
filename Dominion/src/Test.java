import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;

public class Test
{
  public static void main(String[] args)
  {
    try
    {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      String filename = "c:/Project1";
      String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
      database = database + filename.trim() + ";DriverD=22;READONLY=true}";
      Connection localConnection = DriverManager.getConnection(database, "", "");
    }
    catch (Exception e)
    {
      System.out.println("Error: " + e);
    }
  }
}
