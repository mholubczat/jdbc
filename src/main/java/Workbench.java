import java.sql.*;

public class Workbench {
    private final static String JDBC_URL = "jdbc:postgresql://localhost:5433/movies";
    private final static String DATABASE_USER = "postgres";
    private final static String DATABASE_PASS = "Programator";


    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(JDBC_URL,DATABASE_USER,DATABASE_PASS);
        Statement statement = connection.createStatement();


ResultSet resultTable = statement.executeQuery("SELECT * FROM films;");
while(resultTable.next()) {

    System.out.println(resultTable.getString(2));
}

        statement.close();
        connection.close();


    }
}
