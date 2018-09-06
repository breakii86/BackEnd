package org.twg.backend;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Florian Determann
 *
 * This is a data pool. It provides the accessor with a pool connection.
 * With this technic it is possible to limit concurrent accesses on database
 * aswell to limit overhead.
 *
 * It's done with the library Hikari. Further information and init of properties is provided in
 * <a href="/src/main/resources/datasource.properties">DataProperties</a>
 */
public class DataSource {
    private static HikariConfig config = new HikariConfig("datasource.properties");
    private static HikariDataSource ds;

    static {
        ds = new HikariDataSource(config);
    }

    private DataSource() {

    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
