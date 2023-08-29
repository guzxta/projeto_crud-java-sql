package DAO;
import java.sql.*;

public class Conexao {

    public static Connection conectaBD () {
        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/gamershop?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "g2020";
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}



