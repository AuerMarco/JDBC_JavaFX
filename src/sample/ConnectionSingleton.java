//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {
    private static ConnectionSingleton connector = new ConnectionSingleton();
    private static String url = "jdbc:mysql://localhost:3306/firstjava";
    private static String user = "root";
    private static String password = "";

    private ConnectionSingleton() {
    }

    public static ConnectionSingleton getConnector() {
        return connector;
    }

    public Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (SQLException var2) {
            var2.printStackTrace();
            return null;
        }
    }
}
