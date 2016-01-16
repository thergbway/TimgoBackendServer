package timgo.model.dao;

import org.postgresql.Driver;
import org.sql2o.Sql2o;

import java.io.InputStream;
import java.net.URL;
import java.sql.DriverManager;
import java.util.Properties;

public class Sql2oHolder {

    public static final Sql2o SQL_2_O;

    static {
        try {
            DriverManager.registerDriver(new Driver());

            SQL_2_O = new Sql2o(
                "jdbc:postgresql://localhost:5432/timgo",
                "postgres",
                "default"
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private Sql2oHolder() {
    }
}
