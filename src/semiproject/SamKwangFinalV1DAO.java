package semiproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SamKwangFinalV1DAO {
    //CODP 테이블에서 기본정보만 조회한 후 넘김
    public static ArrayList<SamKwangCODPVO> selectCODP() {
        ArrayList<SamKwangCODPVO> codps = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = SamKwangJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.selectCODP);
            rs = pstmt.executeQuery();
            while (rs.next()){
                SamKwangCODPVO codp = new SamKwangCODPVO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getInt(8));
                codps.add(codp);
            }
        } catch (SQLException se) {
            System.out.printf("selectCODP에서 오류발생");
        }
        SamKwangJDBC.destoryConn(conn,pstmt,rs);

        return codps;

    }

    //넘겨준 주문번호를 이용해서 CODP에서 주문정보를 조회하고 결과를 넘겨줌
    public static ArrayList<SamKwangCODPVO> selectOneCODP(int 주문번호) {
        ArrayList<SamKwangCODPVO> codps = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = SamKwangJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.selectONECODP);
            pstmt.setInt(1,주문번호);
            rs = pstmt.executeQuery();
            while (rs.next()){
                SamKwangCODPVO codp = new SamKwangCODPVO(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getInt(12),
                        rs.getString(13),
                        rs.getString(14),
                        rs.getInt(15),
                        rs.getInt(16));
                codps.add(codp);
            }
        } catch (SQLException se) {
            System.out.printf("selectCODP에서 오류발생");
            se.printStackTrace();
        }
        SamKwangJDBC.destoryConn(conn,pstmt,rs);

        return codps;
    }
}
