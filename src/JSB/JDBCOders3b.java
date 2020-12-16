package JSB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCOders3b {
    public static void main(String[] args) {
        //주문번호로 조회
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from bookorders where orderid= ?";
        String fmt = "%s %s %s %s %s\n";
        StringBuilder sb = new StringBuilder();

        //조회할 번호 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 주문번호은? ");
        String sid = sc.nextLine();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,Integer.parseInt(sid));
            rs = pstmt.executeQuery(); // 결과받기

            while (rs.next()){
                String orderid = rs.getString(1);
                String custid = rs.getString(2);
                String bookid = rs.getString(3);
                String saleprice = rs.getString(4);
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
