package Jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {

    Connection connection;

    public void setSqlConnection() throws SQLException, ClassNotFoundException {
        //Class.forName("com.mysql.jdbc.Driver");
        String connectionUrl = "jdbc:mysql://172.23.16.30:3306/til_expresso_db";
        connection = DriverManager.getConnection(connectionUrl, "exproot", "exproot@123");
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new SqlConnection().setSqlConnection();
    }

}
