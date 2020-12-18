package semiproject;

import JSB.samkangSOEVO;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 성적처리 추상클래스를 상속해서 만든 클래스
* */
public class SamKwangFinalV1Service {
    public void displayMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------\n")
                .append("인사 관리 프로그램 v8\n")
                .append("-------------------\n")
                .append(" 1. \n")
                .append(" 2. CODP 조회\n")
                .append(" 3. CODP 상세조회\n")
                .append(" 4. SOE 수정\n")
                .append(" 5. SOE 상세조회\n")
                .append(" 0. 프로그램 종료 \n")
                .append("-------------------\n")
                .append( " 원하시는 작업은 ? [0,1,2,3,4,5,0] ");
        System.out.print(sb);
    }

    //고객 : 고객번호, 고객이름
    //주문 : 주문번호, 주문일
    //주문항목 : 제품번호, 수량
    //제품 : 제품이름, 단가
    public void readCODP() {
        String fmt = "%10s %10s %10s %10s\n%10s %10s %10s %10s\n";
        StringBuilder sb = new StringBuilder();
        String result = "";

        ArrayList<SamKwangCODPVO> codps = SamKwangFinalV1DAO.selectCODP();

        for(SamKwangCODPVO codp : codps){
            result = String.format(fmt,codp.get고객번호(),codp.get고객이름(),codp.get주문번호(),codp.get주문일().substring(0,10),
                    codp.get제품번호(), codp.get수량(),codp.get제품이름(),codp.get단가());
            sb.append(result);
        }
        System.out.println(sb.toString());
    }

    public void readOneCODP() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s %10s %10s\n%10s %10s %10s %10s %10s\n%10s %10s %10s %10s %10s %10s\n------------------------------------------\n";
        String result = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 주문번호는?");
        int 주문번호 = sc.nextInt();

        ArrayList<SamKwangCODPVO> codps = SamKwangFinalV1DAO.selectOneCODP(주문번호);

        for(SamKwangCODPVO codp : codps){
             result = String.format(fmt, codp.get제품번호(), codp.get주문번호(), codp.get고객번호(), codp.get고객이름(),
                    codp.get주소(), codp.get시도(), codp.get우편번호(), codp.get전화번호(), codp.get주문일().substring(0, 10),
                    codp.get납기일().substring(0, 10), codp.get인사번호(), codp.get수량(), codp.get제품이름(),
                    codp.get제품분류(), codp.get단가(), codp.get재고량());
            sb.append(result);
        }
        System.out.println(sb.toString());
    }

    public void readSOE() {
        String fmt = "%10s %10s %10s %10s %10s %10s\n";
        StringBuilder sb = new StringBuilder();
        String result = "";

        ArrayList<samkangSOEVO> soes = SamKwangFinalV1DAO.selectSOE();

        for(samkangSOEVO soe : soes){
            result = String.format(fmt,soe.get인사번호(),soe.get주문번호(),soe.get운송ID(),soe.get운송이름(),
                    soe.get주문일().substring(0,10), soe.get직책());
            sb.append(result);
        }
        System.out.println(sb.toString());
    }

    public void readOneSOE() {
        String fmt = "%10s %10s %10s %10s %10s %10s\n %10s %10s %10s %10s %10s %10s %10s\n";
        String result = "찾으시는 운송ID가 존재하지 않습니다";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 운송ID는?");
        int 운송ID = sc.nextInt();

        samkangSOEVO soe = SamKwangFinalV1DAO.selectOneSOE(운송ID);

        if(soe != null)
        result = String.format(fmt, soe.get인사번호(), soe.get주문번호(), soe.get운송ID(), soe.get운송이름(),
                soe.get담당자전화번호(), soe.get주문일(), soe.get납기일(), soe.get고객번호(), soe.get주민등록번호(),
                soe.get성명(), soe.get소속부서(), soe.get직책(), soe.get입사일().substring(0, 10));

        System.out.println(result);
    }
}
