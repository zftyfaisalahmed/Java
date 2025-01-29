package jdbcexecute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataProg {
    private static Connection con;
    private static Statement stmt;
    private static ResultSet res;
    private static ResultSetMetaData metaData;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establish Connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/janjdbc", "root", "@Faisal123");

        if (con == null) {
            System.out.println("Connection Failed");
        } else {
            System.out.println("Connected to Database");
            String sql = "select * from employee";
            stmt = con.createStatement();
            res = stmt.executeQuery(sql);
            metaData = res.getMetaData();

            int count = metaData.getColumnCount();
            for (int i = 1; i <= count; i++) {
                System.out.println(metaData.getColumnName(i));
                System.out.println(metaData.getColumnDisplaySize(i));
                System.out.println(metaData.getColumnLabel(i));
                System.out.println(metaData.getColumnTypeName(i));
                System.out.println(metaData.getSchemaName(i));
                System.out.println(metaData.getTableName(i));
                System.out.println(metaData.getColumnClassName(i));
                System.out.println(metaData.isAutoIncrement(i));
                System.out.println(metaData.isCaseSensitive(i));
                System.out.println(metaData.isNullable(i));
                System.out.println(metaData.isReadOnly(i));
                System.out.println(metaData.isWritable(i));
                System.out.println("=====================");
            }
        }
    }
}
