import java.sql.*;
import java.util.Properties;

public class KoneksiDB {
    public static Connection connect() {
        Connection conn = null;
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("db.properties"));
            String url = "jdbc:mysql://" + props.getProperty("host") + "/";
            conn = DriverManager.getConnection(url, props);
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
