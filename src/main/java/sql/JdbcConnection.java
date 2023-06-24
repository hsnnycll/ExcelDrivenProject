package sql;

import java.sql.*;

public class JdbcConnection {
    public static void main(String[] args) throws SQLException {

        //DriverManager.getConnection(url = "jdbc:mysql://" + host + ":" + port + "/databasename", "username", "password");

        String host = "localhost";
        String port = "3306";
        Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "h1a2s3a4n5");

        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from Employeeinfo where name = 'tam'");

        while (rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("location"));
            System.out.println(rs.getInt("age"));
        }
    }
}
