import java.sql.*;

class Insert{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
        String qry = "insert into student values('Abhi','abhi@gmail.com','swewedwq');";
        PreparedStatement p = con.prepareStatement(qry);
        int n = p.executeUpdate();
        if(n>0)
        {
            System.out.println("Inserted");
        }
        else
        {
            System.out.println("Not inserted");
        }
    }
}