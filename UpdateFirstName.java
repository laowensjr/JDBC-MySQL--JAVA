import java.sql.DriverManager;
import java.sql.*;

public class UpdateFirstName {
public static void UpdateFirstName(String NewFirstName, String OldFirstName)
throws SQLException {
Connection jCon = null;
PreparedStatement pstmt = null;
try {
String myDB = "YOUR DB NAME";
String myUSER = "SUCH AS ROOT OR ADMIN";
String myPASS = "YOUR PASSWORD";
jCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+myDB, myUSER, myPASS);
pstmt = jCon.prepareStatement(
"UPDATE contactinfo " +
"SET firstname = ? " +
"WHERE firstname = ?");
pstmt.setString(1, NewFirstName);
pstmt.setString(2, OldFirstName);
pstmt.executeUpdate();
}
finally {
if (pstmt != null) pstmt.close();
}
}
}