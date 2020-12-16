package semiproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/*
* 성적처리 추상클래스를 상속해서 만든 클래스
* */
public class EmployeeV3Service  {
    public void displayMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------\n")
                .append("인사 관리 프로그램 v8\n")
                .append("-------------------\n")
                .append(" 1. 인사 데이터 입력\n")
                .append(" 2. 인사 데이터 조회\n")
                .append(" 3. 인사 데이터 상세조회\n")
                .append(" 4. 인사 데이터 수정\n")
                .append(" 5. 인사 데이터 삭제\n")
                .append(" 0. 프로그램 종료 \n")
                .append("-------------------\n")
                .append( " 원하시는 작업은 ? [0,1,2,3,4,5,0] ");
        System.out.print(sb);
    }

    public void readEmployee() {
       StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s %10s %10s %10s\n";

        String result = String.format(fmt,"empno","lname","email","jobid","mgrid","deptid");
       sb.append(result);

       ArrayList<EmployeeVo> emps = EmployeeV3DAO.selectEmp();

       for(EmployeeVo emp : emps){
           result = String.format(fmt, emp.getEmpno(),emp.getLname(),emp.getEmail(),emp.getJobid()
                   , emp.getMgrid(),emp.getDeptid());
           sb.append(result);
       }
        System.out.println(sb.toString());
    }


}
