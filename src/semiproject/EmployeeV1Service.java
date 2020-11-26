package semiproject;

import JSB.SungJukVO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
* 성적처리 추상클래스를 상속해서 만든 클래스
* */
public class EmployeeV1Service extends EmployeeV1GenericService {
    //멤버변수 선언
    //입력받은 모든 성적데이터를 저장하는 동적배열 변수 선언
    List<EmployeeVo> emdata =new ArrayList<>();

    @Override
    /*
     * 사번, 성, 이메일, 직책, 상사번호, 부서번호 데이터를 입력받아
     * 사번으로 조회
     * 동적배열에 추가함
     * */
    public void newEmployees() {
        String fname, lname, email, hdate, jobid;
        int empno, sal, mgrid, deptid;

        Scanner sc = new Scanner(System.in);

        System.out.print("사번을 입력하세요 : ");
        empno = sc.nextInt();
        sc.nextLine();
        System.out.print("성을 입력하세요 : ");
        fname = sc.nextLine();
        System.out.print("이메일을 입력하세요 : ");
        email = sc.nextLine();
        System.out.print("직책을 입력하세요 : ");
        jobid = sc.nextLine();
        System.out.print("상사번호를 입력하세요 : ");
        mgrid = sc.nextInt();
        System.out.print("부서번호를 입력하세요 : ");
        deptid = sc.nextInt();

        //입력받은 성적데이터를 동적배열에 저장
        EmployeeVo sj = new EmployeeVo(empno, fname, email, jobid, mgrid, deptid, "", " "," ",0);

        //인사정보 조회
        //computeEmployees(sj);

        //처리된 성적데이터를 동적배열에 저장
        emdata.add(sj);
    }

    @Override
    public void readEmployees() {
        String fmt = "사번: %s, 성: %s, 이메일: %s, 직책: %s, 상사번호: %d, 부서번호: %d\n ";

        //동적배열에 저장된 데이터들을 출력하기위해 각 요소를 순회할 수 있도록 Iterator 객체 선언
        Iterator<EmployeeVo> iter =  emdata.iterator();
        while (iter.hasNext()){
            EmployeeVo sj = iter.next();

            System.out.printf(fmt, sj.getEmpno(), sj.getFname(), sj.getEmail(), sj.getJobid(), sj.getMgrid(),sj.getDeptid() );
        }
    }

    @Override
    //출력
    public void readOneEmployees() {
        String fmt = "사번: %s, 성: %s, 이메일: %s, 직책: %s, 상사번호: %d, 부서번호: %d\n "
                +"이름: %s, 이메일: %s, 직책: %s, 상사번호: %d, 부서번호: %d\n ";
        //동적배열에 저장된 데이터들을 출력하기위해 각 요소를 순회할 수 있도록 Iterator 객체 선언
        Iterator<EmployeeVo> iter =  emdata.iterator();
        while (iter.hasNext()){
            EmployeeVo sj = iter.next();

            System.out.printf(fmt, sj.getEmpno(), sj.getFname(), sj.getEmail(), sj.getJobid(), sj.getMgrid(), sj.getDeptid(), sj.getLname(),sj.getPhone(), sj.getHdate(), sj.getSal());
        }
    }
    /*
     * 인사 관리 프로그램의 메뉴 출력 기능
     * */
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

    public void computeEmployees(EmployeeVo sj){

    }

}
