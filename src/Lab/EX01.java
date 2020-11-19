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

        Kim.number = 201350050;
        Kim.name = "김태희";
        Kim.addr = "경기도고양시";
        Kim.birth = "1985.3.22";
        Kim.majorname = "컴퓨터";
        Kim.professor = 504;
        //출력
        System.out.println(Kim.number);
        System.out.println(Kim.name);
        System.out.println(Kim.addr);
        System.out.println(Kim.birth);
        System.out.println(Kim.majorname);
        System.out.println(Kim.professor);

        System.out.println("=================");
        //학과 클래스
            /*컴퓨터공학
              123-4567-8901
              E동 2층
               504*/
        Majorname comptuer  = new Majorname();

        comptuer.professor = 504;
        comptuer.majorname = "컴퓨터공학";
        comptuer.callnum = "123-4567-8901";
        comptuer.addr = "E동 2층";
        //출력
        System.out.println(comptuer.professor);
        System.out.println(comptuer.majorname);
        System.out.println(comptuer.callnum);
        System.out.println(comptuer.addr);

        System.out.println("=================");
        //과목 클래스
            /*0205
            프로그래밍
            자바 프로그래밍
            301*/
        Subject programming = new Subject();

        programming.subjnum = 0205;
        programming.subjname = "프로그래밍";
        programming.outline = "자바 프로그래밍";
        programming.professor = 301;
        //출력
        System.out.println(programming.subjnum);
        System.out.println(programming.subjname);
        System.out.println(programming.outline);
        System.out.println(programming.professor);

    }//main
}
