
import java.sql.*;
public abstract class IDB {
    public abstract Connection getConnection() throws SQLException, ClassNotFoundException;

}