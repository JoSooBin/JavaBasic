package JSB;

//SungJukV5Main -> SungJukVO -> SungJukService 순으로 호출
public class SungJukV5Main {
    public static void main(String[] args) {

        SungJukService sjsrv = new SungJukService(); //기능만 담고있는 클래스

        SungJukVO  sj = sjsrv.readSungJuk();

        //변수의 유효범위scope
        //변수가 생성된 위치와 사용하는 위치가 다른경우
        //그 결과가 특이할 수 있음
        //변수의 유효범위는 블록이라하고 { }로 표현
        //기본자료형 변수 : call by value
        //참조자료형 변수 : call by reference
        sjsrv.computeSungJuk(sj);
        sjsrv.printSungJuk(sj);
    }
}
