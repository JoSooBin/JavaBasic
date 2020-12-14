package JSB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMembers {
    //playgrond 데이터베이스의 bookmembers 테이블에 새로운 도서정보를 입력하는 JDBC프로그램을 작성하세요
    //컬럼정보 : custid, name, address, phone
    //입력은 Scanner 이용
    public static void main(String[] args) {
        //1.도서정보 입력
        Scanner sc = new Scanner(System.in);

        System.out.println("회원번호는?  ");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.println("회원이름은?");
        String name = sc.nextLine();
        System.out.println("회원주소는? ");
        String address = sc.nextLine();
        System.out.println("전화번호는? ");
        String phone = sc.nextLine();

        //2.입력받은 회원정보를
        //bookmembers 테이블에 저장하는 SQL문 작성
        //insert into books values(6,'홍길동','서울특별시 종로구','010-0123-4567')
        String sql = "insert into bookmembers values"+"("+custid+",'"+name+"','"+address+"','"+phone+"')";
        System.out.println(sql);

        //3. 생성한 SQL문을 JDBC를 통해 실행
        String DRV = "org.mariadb.jdbc.Driver";
        String URL ="jdbc:mariadb://mariadb.czqb0qwcxo45.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR ="playground";
        String PWD ="playground2020";

        //a) JDBC 드라이버 초기화
        try {
            Class.forName(DRV);
        } catch (ClassNotFoundException cnf) {
            System.out.println("JDBC 드라이버를 확인하세요!");
        }

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USR, PWD);
        } catch (SQLException se) {
            System.out.println("디비 접속주소가 틀리거나 아이디/비번을 확인하세요");
        }

        // c) SQL문 객체를 생성하고 서버로 전송해서 실행함
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
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
