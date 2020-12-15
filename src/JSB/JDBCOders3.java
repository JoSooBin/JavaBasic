package JSB;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class JDBCOders3 {
    public static void main(String[] args) {
        //모두 출력
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from bookorders";
        String fmt = "%s %s %s %s %s\n";
        StringBuilder sb = new StringBuilder();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery(); // 결과받기

            while (rs.next()){
                String orderid = String.format(rs.getString(1));
                String custid = String.format(rs.getString(2));
                String bookid = String.format(rs.getString(3));
                String saleprice = String.format(rs.getString(4));
                String orderdate = rs.getString(5);
                String result = String.format(fmt,orderid,custid,bookid,saleprice,orderdate);
                sb.append(result);
            }
        } catch (SQLException se) {
            System.out.println("JDBC 질의문 생성오류!");
        }
        JDBCUtil.destoryConn(conn, pstmt, rs);

        System.out.println(sb.toString());


    }
}
