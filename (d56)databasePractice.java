import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataTest {

public static void main (String[] args) {
  //jdbc:msql://hostname:port/databasename
  String connectionString = "jdbc:mysql://localhost:3306/workouts2020";
  final String SELECT_QUERY = "SELECT * FROM exercise";


  try {
    Connection conn = DriverManager.getConnection(connectionString, "root", "***********");
    System.out.println("Connected succesfully!");
    Statement statement = conn.createStatement();
    statement.executeQuery(SELECT_QUERY);
    ResultSet rs = statement.executeQuery(SELECT_QUERY);

   while (rs.next()) {
     System.out.println("Exercise#: " + rs.getInt(1) + " Exercise name " + rs.getString(2) + " weight: " + rs.getInt(5));
   }
  } catch (SQLException e) {
    System.out.println("Error connection to the database.");
    e.printStackTrace();
  }


}


}
