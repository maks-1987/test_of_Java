package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class H2_test {
    // Connection DB
    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:" + "./DataBase/MyH2", "root", "root");
            Statement statement =  conn.createStatement();
            statement.execute("create table pawn(name varchar(20))");
            System.out.println("create table already");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

