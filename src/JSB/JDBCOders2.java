package JSB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCOders2 {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into bookorders values(?,?,?,?,?)";

        Scanner sc = new Scanner(System.in);

        //주문정보 입력받기
        System.out.println("주문번호는?  ");
        int orderid = Integer.parseInt(sc.nextLine());
        System.out.println("회원번호는?");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.println("도서번호는? ");
        int bookid = Integer.parseInt(sc.nextLine());
        System.out.println("도서가격은? ");
        int saleprice = Integer.parseInt(sc.nextLine());
        System.out.println("주문날짜는? ");
        String orderdate = sc.nextLine();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, orderid);
            pstmt.setInt(2, custid);
            pstmt.setInt(3, bookid);
            pstmt.setInt(4, saleprice);
            pstmt.setString(5, orderdate);
            int cnt = pstmt.executeUpdate();
            if (cnt>0) System.out.println("주문정보 추가 완료");
        } catch (SQLException ex){
            System.out.println("JDBC 질의문 생성 오류");
        }
        JDBCUtil.destoryConn(conn, pstmt);

    }
}
