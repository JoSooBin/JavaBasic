package JSB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCBooks {
    //playgrond 데이터베이스의 books테이블에 새로운 도서정보를 입력하는 JDBC프로그램을 작성하세요
    //컬럼정보 : bookid, bookname, publisher,price
    //입력은 Scanner 이용

    public static void main(String[] args) {
        //1.도서정보 입력
        Scanner sc = new Scanner(System.in);

        System.out.println("도서번호는?  ");
        int bookid = Integer.parseInt(sc.nextLine());
        System.out.println("도서제목는?");
        String bookname = sc.nextLine();
        System.out.println("도서출판사는? ");
        String booklisher = sc.nextLine();
        System.out.println("도서가격은? ");
        int price = Integer.parseInt(sc.nextLine());

        //2.입력받은 도서정보를
        //Books 테이블에 저장하는 SQL문 작성
        //insert into books values(10,'제목','출판사',10000)
        //insert into books values(bookid,bookname,booklisher,price)
        String sql = "insert into books values"+"("+bookid+",'"+bookname+"','"+booklisher+"',"+price+")";
        System.out.println(sql);

        //3. 생성한 SQL문을 JDBC를 통해 실행
        String DRV ="org.mariadb.jdbc.Driver";
        String URL ="jdbc:mariadb://mariadb.czqb0qwcxo45.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR ="playground";
        String PWD ="playground2020";

        //a) JDBC 드라이버 초기화
        try {
            Class.forName(DRV);
        } catch (ClassNotFoundException cnf) {
            System.out.println("JDBC 드라이버를 확인하세요!");
        }
        
        //b) 데이터베이스 서버 접속
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USR, PWD);
        } catch (SQLException se) {
            System.out.println("디비 접속주소가 틀리거나 아이디/비번을 확인하세요");
        }
        
        // c) SQL문 객체를 생성하고 서버로 전송해서 실행함
        Statement stmt = null;
        try {
             stmt = conn.createStatement(); //질의문 객체
             boolean isfail = stmt.execute(sql); //sql문 실행
             if(!isfail) System.out.println("데이터 추가완료!"); //참이면 실행완료
        } catch (SQLException se) {
            System.out.println("JDBC - SQL 실행 오류");
        }

        // d) JDBC 관련 객체는 메모리에서 제거
        if(stmt != null)
            try { stmt.close(); } catch (SQLException se) { }

        if(conn != null)
            try { conn.close(); } catch (SQLException se) { }
    }
}
