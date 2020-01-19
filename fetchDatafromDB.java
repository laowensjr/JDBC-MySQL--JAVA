import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class fetchDatafromDB extends UpdateFirstName{
public static void fetchDatafromDB(String myDB, String myUSER, String myPASS) throws SQLException{
//Set Connection variable named jCon
Connection jCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+myDB, myUSER, myPASS);
//Prepares Statements to send to DB
PreparedStatement statement = jCon.prepareStatement("select * from contactinfo");
//Retrieve Results
ResultSet result = statement.executeQuery();
while (result.next())
{
//getString retrieves data by column name
System.out.println(result.getString("lastname") + " " + result.getString("firstname"));
//You could override getString to retrieves data by columnIndex
//System.out.println(result.getString(3) + " " + result.getString(2));
}
}
public static void main(String[] args) throws Exception
{
UpdateFirstName("Michael", "Fred");
fetchDatafromDB("YOURDBNAME", "YOURUSER","YOURPASSWORD");
}
}