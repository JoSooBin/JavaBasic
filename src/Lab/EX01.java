package Lab;

public class EX01 {
    public static void main(String[] args) {
        //학생 클래스를 이용해서 객체생성
        Student Kim = new Student();
        //학과 클래스를 이용해서 객체생성
        Majorname comptuer  = new Majorname();
        //과목 클래스를 이용해서 객체생성
        Subject programming = new Subject();
        //교수 클래스를 이용해서 객체생성
        Professor prof = new Professor();

        //학생 클래스
            //201350050
            //김태희
            //경기도고양시
            //1985.3.22
            //컴퓨터
            //504

        //기본 생성자로 만든 객체 내용 출력
        System.out.println("==기본 생성자로 만든 객체 내용 출력==");
        System.out.println(Kim.name);
        System.out.println(comptuer.dept);
        System.out.println(programming.subjname);
        System.out.println(prof.no);
        System.out.println("=================");

        //각 객체의 변수에 값 대입

        // 객체에 저장된 값 출력
        Kim.stdno = 201350050;
        Kim.name = "김태희";
        Kim.addr = "경기도고양시";
        Kim.birth = "1985.3.22";
        Kim.dept = "컴퓨터";
        Kim.prof = "504";
        System.out.println("=================");
        //매개변수 생성자를 이용한 객체 생성 및 초기화
        Student jun = new Student(201252110,"전지현","경기도의정부시","1986.4.30","의상디자인","445");

        // 매개변수 출력
        System.out.println(jun.stdno);
        System.out.println(jun.name);
        System.out.println(jun.addr);
        System.out.println(jun.birth);
        System.out.println(jun.dept);
        System.out.println(jun.prof);

        System.out.println("=================");
        //학과 클래스
              //컴퓨터공학
              //123-4567-8901
            //E동 2층
             // 504
        //기본 생성자로 초기화된 변수 확인
        System.out.println(comptuer.dept);
        System.out.println(comptuer.phone);
        System.out.println(comptuer.office);
        System.out.println(comptuer.chief);

        comptuer.chief = "504";
        comptuer.dept = "컴퓨터공학";
        comptuer.phone = "123-4567-8901";
        comptuer.office = "E동 2층";
        System.out.println("=================");
        //매개변수 생성자를 이용한 객체 생성 및 초기화
        Majorname sic = new Majorname("식품영양","345-6789-0123","F동 8층","556");

        //매개변수출력
        System.out.println(sic.dept);
        System.out.println(sic.phone);
        System.out.println(sic.office);
        System.out.println(sic.chief);

        System.out.println("=================");
        //과목 클래스
            //0205
            //프로그래밍
            //자바 프로그래밍
            //301
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
            //301
            //이순신
            //프로그래밍
        prof.no = "301";
        prof.name = "이순신";
        prof.mjfiled = "프로그래밍";
        //출력
        System.out.println(prof.no);
        System.out.println(prof.name);
        System.out.println(prof.mjfiled);



    }//main
}
