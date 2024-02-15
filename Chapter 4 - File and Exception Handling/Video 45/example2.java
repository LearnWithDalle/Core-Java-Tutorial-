import java.sql.*;

public class example2 {
    public static Connection connectToDatabase(String url, String username, String password) throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public static void main(String[] args) {
        String url = "LearnWitDalle.com";
        String username = "Dalla";
        String password = "mukeshDalla";

        try {
            Connection connection = connectToDatabase(url, username, password);
            System.out.println("Connected to database");
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}
