package cz.stefan;

import java.sql.*;

public class InsertExample {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/luxor", "root", "");

        String newnazev = "KOCKOPES";
        String newautor = "SEJKSPYR";
        String newobsah = "sheeesh";
        int newprice = 1010;  

        PreparedStatement preparedStatement = connection.prepareStatement
                ("INSERT INTO knihy VALUES(NULL, ?, ?, ?, ?);");

        preparedStatement.setString(1, newnazev);
        preparedStatement.setString(2, newautor);
        preparedStatement.setString(3, newobsah);
        preparedStatement.setInt(4, newcena);

        preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();
    }

}
