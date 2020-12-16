package semiproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeV3DAO {
    // employees 테이블에서 사원번호,성,이메일,직책,상사,부서번호들을
    // 조회해서 ArrayList로 구성한 후 EmployeeV3Service로 넘김
    public static ArrayList<EmployeeVo> selectEmp(){
        ArrayList<EmployeeVo> emps = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = EmployeeJDBC.makeConn();
        try{
            pstmt = conn.prepareStatement(EmployeeJDBC.selectEmp);
            rs = pstmt.executeQuery();
            while (rs.next()){
                EmployeeVo e = new EmployeeVo(
                        rs.getInt(1), //empno
                        rs.getString(2),//lanme
                        rs.getString(3),//email
                        rs.getString(4),//jobid
                        rs.getInt(5),//mgrid
                        rs.getInt(6));//deptid
                emps.add(e);
            }
        }catch (SQLException se){
            System.out.println("selectEmp에서 오류 발생");
            se.printStackTrace();
        }
        EmployeeJDBC.destoryConn(conn,pstmt,rs);

        return emps;
    }
}
