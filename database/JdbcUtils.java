import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class JdbcUtils {

    private static Connection connection;

    // Method to load the properties from config.properties
    public static Properties loadProperties() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("config.properties");
        if (inputStream == null) {
            throw new IOException("Config file not found");
        }
        properties.load(inputStream);
        return properties;
    }

    // Method to create and return a database connection
    public static Connection getConnection() throws SQLException, IOException {
        if (connection == null || connection.isClosed()) {
            Properties properties = loadProperties();
            String url = properties.getProperty("db.url");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }

    // Method to close the database connection
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
