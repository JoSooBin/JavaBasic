package JSB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMembers3b {
    public static void main(String[] args) {
        //이름으로 조회
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from bookmembers where name= ?";
        String fmt = "%s %s %s %s\n";
        StringBuilder sb = new StringBuilder();

        //조회할 이름 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 이름은?");
        String sname = sc.nextLine();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, sname); //책 제목 받기
            rs = pstmt.executeQuery(); // 결과받기

            while (rs.next()){
                String custid = String.format(rs.getString(1));
                String name = rs.getString(2);
                String address = rs.getString(3);
                String phone = rs.getString(3);
                String result = String.format(fmt,custid,name,address,phone);
                sb.append(result);
            }
        } catch (SQLException se) {
            System.out.println("JDBC 질의문 생성오류!");
        }
        JDBCUtil.destoryConn(conn, pstmt, rs);

        System.out.println(sb.toString());
    }
}
