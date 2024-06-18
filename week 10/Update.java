import java.sql.*;

class Update{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
        String qry = "update student set name = 'Ram' where name = 'Seetha";
        PreparedStatement p = con.prepareStatement(qry);
        int n = p.executeUpdate();
        if(n>0)
        {
            System.out.println("Updated");
        }
        else
        {
            System.out.println("Not Updated");
        }
    }
}