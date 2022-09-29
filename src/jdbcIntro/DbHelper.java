package jdbcIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName = "root";
    private String password = "MySQL7032.";
    private String dbURL = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbURL, userName, password);

    }
    public void showErrorMassage(SQLException exception){
        System.out.println("Error: "+exception.getMessage());
        System.out.println("Error code : "+exception.getErrorCode());
    }

}
