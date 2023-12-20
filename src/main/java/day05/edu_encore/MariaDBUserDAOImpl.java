package day05.edu_encore;

import java.sql.Connection;
import java.sql.DriverManager;

public class MariaDBUserDAOImpl extends UserDAO{
    @Override
    public Connection getConnection() throws Exception {
        //mariadb관련 연결
        //1.driver load....exception
        Class.forName("org.mariadb.jdbc.Driver");

        //2.Connection Open
        String url = "jdbc:mariadb://localhost:3306/encore";
        String uid = "root";
        String pwd = "maria";

        Connection conn = DriverManager.getConnection(url,uid,pwd);
//        System.out.println("driver load & connection success!!!!");
        return conn;
    }
}
