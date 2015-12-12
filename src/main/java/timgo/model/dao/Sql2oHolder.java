package timgo.model.dao;

import org.postgresql.Driver;
import org.sql2o.Sql2o;

import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;

public class Sql2oHolder {

    public static final Sql2o SQL_2_O;

    static {
        try {
            DriverManager.registerDriver(new Driver());

            InputStream is = ClassLoader.getSystemResourceAsStream("cfg/config.properties");
            Properties props = new Properties();
            props.load(is);

            SQL_2_O = new Sql2o(
                props.getProperty("db_connection_url"),
                props.getProperty("db_username"),
                props.getProperty("db_password")
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private Sql2oHolder() {
    }
}
