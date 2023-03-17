
package br.com.AetherVoyages.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
        public Connection getConnection () {
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/BDProject_aether",
                    "AetherVoyages", "12345");
        } catch (Exception e) {
            throw new RuntimeException (e);
        }
    }
}
