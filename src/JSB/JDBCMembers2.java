package JSB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMembers2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("회원번호는?  ");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.println("회원이름은?");
        String name = sc.nextLine();
        System.out.println("회원주소는? ");
        String address = sc.nextLine();
        System.out.println("전화번호는? ");
        String phone = sc.nextLine();

        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql  = "insert into bookmembers values(?,?,?,?)";
        System.out.println(sql);

        conn = JDBCUtil.makeConn();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, custid);
            pstmt.setString(2, name);
            pstmt.setString(3, address);
            pstmt.setString(4, phone);

            int cnt = pstmt.executeUpdate();
            if (cnt>0) System.out.println("회원정보 추가 완료");
        } catch (SQLException ex){
            System.out.println("JDBC 질의문 생성 오류");
        }
        JDBCUtil.destoryConn(conn, pstmt);

    }
}
