package semiproject;

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

        ArrayList<> codp = SamKwangFinalV1DAO.selectCODP();

        for(){

        }
        System.out.println(sb.toString());
    }

    public void readOneCODP() {
    }

    public void readSOE() {
    }

    public void readOneSOE() {
    }
}
