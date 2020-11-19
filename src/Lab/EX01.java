package Lab;

public class EX01 {
    public static void main(String[] args) {
        //학생 클래스를 이용해서 객체생성
        //학과 클래스를 이용해서 객체생성
        //과목 클래스를 이용해서 객체생성
        //교수 클래스를 이용해서 객체생성

        //각 객체의 변수에 값 대입

        // 객체에 저장된 값 출력

        //학생 클래스
            /*201350050
            김태희
            경기도고양시
            1985.3.22
            컴퓨터
            504*/
        Student Kim = new Student();

        Kim.stdno = 201350050;
        Kim.name = "김태희";
        Kim.addr = "경기도고양시";
        Kim.birth = "1985.3.22";
        Kim.dept = "컴퓨터";
        Kim.prof = "504";
        //출력
        System.out.println(Kim.stdno);
        System.out.println(Kim.name);
        System.out.println(Kim.addr);
        System.out.println(Kim.birth);
        System.out.println(Kim.dept);
        System.out.println(Kim.prof);

        System.out.println("=================");
        //학과 클래스
            /*컴퓨터공학
              123-4567-8901
              E동 2층
              504*/
        Majorname comptuer  = new Majorname();

        comptuer.chief = "504";
        comptuer.dept = "컴퓨터공학";
        comptuer.phone = "123-4567-8901";
        comptuer.office = "E동 2층";
        //출력
        System.out.println(comptuer.chief);
        System.out.println(comptuer.dept);
        System.out.println(comptuer.phone);
        System.out.println(comptuer.office);

        System.out.println("=================");
        //과목 클래스
            /*0205
            프로그래밍
            자바 프로그래밍
            301*/
        Subject programming = new Subject();

        programming.sbjno = "0205";
        programming.subjname = "프로그래밍";
        programming.subjdesc = "자바 프로그래밍";
        programming.prof = "301";
        //출력
        System.out.println(programming.sbjno);
        System.out.println(programming.subjname);
        System.out.println(programming.subjdesc);
        System.out.println(programming.prof);

        System.out.println("=================");
        //교수 클래스
            /*301
            이순신
            프로그래밍*/
        Professor prof = new Professor();

        prof.no = "301";
        prof.name = "이순신";
        prof.mjfiled = "프로그래밍";
        //출력
        System.out.println(prof.no);
        System.out.println(prof.name);
        System.out.println(prof.mjfiled);

    }//main
}
