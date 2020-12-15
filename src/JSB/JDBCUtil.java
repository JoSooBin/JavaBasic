package JSB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtil {
    //JDBC 드라이버 초기화 및 Connection 객체 생성
    public static Connection makeConn(){
        String DRV ="org.mariadb.jdbc.Driver";
        String URL ="jdbc:mariadb://mariadb.czqb0qwcxo45.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR ="playground";
        String PWD ="playground2020";

        Connection conn = null;
        try {
            Class.forName(DRV);
            return DriverManager.getConnection(URL, USR, PWD);
        } catch (ClassNotFoundException cnf) {
            System.out.println("JDBC 드라이버를 확인하세요!");
        }catch (SQLException se) {
            System.out.println("JDBC 연결실패!");
        }
        return conn;
    }

    //관련 객체 해제
    public static void destoryConn(Connection conn, PreparedStatement pstmt){

        if(pstmt != null)
            try { pstmt.close(); } catch (SQLException se) { }
        if(conn != null)
            try { conn.close(); } catch (SQLException se) { }

    }
}
