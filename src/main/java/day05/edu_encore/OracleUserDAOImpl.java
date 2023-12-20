package day05.edu_encore;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleUserDAOImpl extends UserDAO{

    @Override
    public Connection getConnection() throws Exception {
        //mariadb관련 연결
        //1.driver load....exception
        Class.forName("oracle.jdbc.OracleDriver");

        //2.Connection Open
        String url = "jdbc:oracle:thin:@localhost:port:orcl";
        String uid = "root";
        String pwd = "maria";

        Connection conn = DriverManager.getConnection(url,uid,pwd);
        return null;
    }
}
