import java.sql.*;
import java.util.*;

class UserLogin{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
        String qry = "select * from User where unsername = ? and password = ?";
        PreparedStatement p = con.prepareStatement(qry);
        p.setString(1, username);
        p.setString(2, password);
        ResultSet n = p.executeQuery();
        if (n.next())
           {
                System.out.println("Login successfull " + n.getString("username") );
            }
          else 
           {
                System.out.println("Invalid username or password.");
            }
    }
}