import java.sql.*;
import java.util.*;
class StudentDisplay{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int GivenAge = sc.nextInt();
        String qry = "select * from student where age >= ?";
        PreparedStatement p = con.prepareStatement(qry);
        p.setString(1,GivenAge); 
        ResultSet n = p.executeQuery();
        while(n.next())
        {
            System.out.println("name: "+n.getString(1)+ "Rollno.: "+n.getString(2)+ "branch: "+n.getString(3));
        }
    }
}