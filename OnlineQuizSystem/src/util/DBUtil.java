package util;
import config.DBConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class DBUtil {
    static {
        try { Class.forName("com.mysql.cj.jdbc.Driver"); }
        catch (ClassNotFoundException e) { e.printStackTrace(); }
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PASS);
    }
}