import java.sql.*;

class Query{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
        String qry = "select * from student";
        PreparedStatement p = con.prepareStatement(qry);
        ResultSet n = p.executeQuery();
        while(n.next())
        {
            System.out.println("name: "+n.getString(1)+ "Rollno.: "+n.getString(2)+ "branch: "+n.getString(3));
        }
    }
}