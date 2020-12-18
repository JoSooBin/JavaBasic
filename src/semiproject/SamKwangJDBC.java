package semiproject;

import JSB.JDBCUtil;

public class SamKwangJDBC extends JDBCUtil {
    public static String selectCODP = " select 고객번호,고객이름,주문번호,주문일,제품번호,수량,제품이름,단가 from CODP order by 주문번호 desc ";
    public static String selectONECODP = " select * from CODP where 주문번호 = ? ";
}
