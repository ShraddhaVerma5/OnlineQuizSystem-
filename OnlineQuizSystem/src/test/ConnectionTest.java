package test;

import util.DBUtil;
import java.sql.Connection;

public class ConnectionTest {
    public static void main(String[] args) {
        try (Connection conn = DBUtil.getConnection()) {
            if (conn != null) {
                System.out.println("✅ Connected to MySQL successfully!");
            } else {
                System.out.println("❌ Failed to connect.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
