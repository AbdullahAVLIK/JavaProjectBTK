package jdbcIntro;

import java.sql.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from city;");
            ArrayList<Country> countries = new ArrayList<>();
            while (resultSet.next()) {
                countries.add(new Country(resultSet.getString("Code"),
                                          resultSet.getString("Name"),
                                          resultSet.getString("Continent"),
                                          resultSet.getString("Region")));
            }
            System.out.println(countries.size());
        } catch (SQLException e) {
            helper.showErrorMassage(e);
        } finally {
            connection.close();
        }

    }


}
