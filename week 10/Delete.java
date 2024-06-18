import java.sql.*;

class Delete{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
        String qry = "delete from student where name = 'Shyam'";
        PreparedStatement p = con.prepareStatement(qry);
        int n = p.executeUpdate();
        if(n>0)
        {
            System.out.println("Deleted");
        }
        else
        {
            System.out.println("Not Deleted");
        }
    }
}