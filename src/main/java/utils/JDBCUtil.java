package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    public static Connection getConnection() throws SQLException, IOException {
        String path ="src/main/resources/database.properties";
        try(FileInputStream fis = new FileInputStream(path)) {
            Properties properties =new Properties();
        properties.load(fis);
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        return DriverManager.getConnection(url, user, password);
        }
    }

    public static void checkConnection() throws IOException {
        try (Connection connection = getConnection()) {
            if (connection == null) {
                System.out.println("Kết nối thất bại");
            } else {
                System.out.println("Kết nối thành công " + connection.getCatalog());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
