package sql;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        // url=jdbc:mysql://localhost:3306/library?serverTimezone=UTC&useSSL=false
        // url=jdbc:mysql://localhost:3306/library
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "77553300");
        Statement statement = connection.createStatement();
        statement.executeQuery("SELECT * FROM user");
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user");


        if (connection != null) {
            System.out.println("Connected to the database test");
        }
        while(resultSet.next()){
            System.out.println(resultSet.getString("login"));
        }


    }
}
