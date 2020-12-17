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

    @Override
    /*
     * 사번, 성, 이메일, 직책, 상사번호, 부서번호 데이터를 입력받아
     * 사번으로 조회
     * 동적배열에 추가함
     * */
    public void newEmployees() {
        /*String fname, lname, email, hdate, jobid;
        int empno, sal, mgrid, deptid;
        double comm;*/
        EmployeeVo emp = new EmployeeVo(
                0,"","","","","","",0,0.0,0,0
        );

        Scanner sc = new Scanner(System.in);

        //모든 인사정보는 문자형으로 받되 필요에 따라 적절한 형변환을 해서 변수에 저장
        System.out.print("사번을 입력하세요 : ");
        emp.setEmpno(Integer.parseInt(sc.nextLine()));
        System.out.print("이름을 입력하세요 : ");
        emp.setFname(sc.nextLine());
        System.out.print("성을 입력하세요 : ");
        emp.setLname(sc.nextLine());
        System.out.print("이메일을 입력하세요 : ");
        emp.setEmail(sc.nextLine());
        System.out.print("전화번호를 입력하세요 : ");
        emp.setPhone(sc.nextLine());
        System.out.print("입사일 입력하세요 : ");
        emp.setHdate(sc.nextLine());
        System.out.print("직책을 입력하세요 : ");
        emp.setJobid(sc.nextLine());
        System.out.print("급여를 입력하세요 : ");
        emp.setSal(Integer.parseInt(sc.nextLine()));
        System.out.print("수당을 입력하세요 : ");
        emp.setComm(Double.parseDouble(sc.nextLine()) );
        System.out.print("상사번호를 입력하세요 : ");
        emp.setMgrid(Integer.parseInt(sc.nextLine()));
        System.out.print("부서번호를 입력하세요 : ");
        emp.setDeptid(Integer.parseInt(sc.nextLine()));

        //처리된 성적데이터를 동적배열에 저장
        emdata.add(emp);
    }

    @Override
    public void readEmployees() {
        // 데이터 출력시 간격유지를 위해
        // 형식지정자 앞에 숫자 사용
        String fmt = "%8s %8s %8s %8s %8s %8s\n";

        System.out.printf(fmt,
                "empno","lname","email","jobid","mgrid","deptid");
        Iterator<EmployeeVo> iter = emdata.iterator();

        while(iter.hasNext()) {
            EmployeeVo e = iter.next();
            System.out.printf(fmt, e.getEmpno(),
                    e.getLname(), e.getEmail(), e.getJobid(),
                    e.getMgrid(), e.getDeptid());
        }
    }

    @Override
    /*
    * 상세인사정보 출력
    * 사원번호를 입력받아 출력함
    * */
    public void readOneEmployees() {
        String fmt = "%8s %8s %8s %8s %8s " +
                "%8s %8s %8s %8s %8s %8s\n";

        EmployeeVo emp = new EmployeeVo();
        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 사원번호는?");
        emp.setEmpno(Integer.parseInt(sc.nextLine()));

        for(EmployeeVo e : emdata){
            //입력한 사원번호와 순회해서 꺼낸 사원정보의 사원번호와 비교해서 일치하면
            //이것을 출려하기 위해 다른변수에 저장함
            if(e.getEmpno() == emp.getEmpno()){
                emp = e;
            }
        }
        System.out.printf(fmt, emp.getEmpno(),
                emp.getFname(), emp.getLname(),
                emp.getEmail(), emp.getPhone(),
                emp.getHdate(), emp.getJobid(),
                emp.getSal(), emp.getComm(),
                emp.getMgrid(), emp.getDeptid());
    }

    public void computeEmployees(EmployeeVo sj){

    }

}
