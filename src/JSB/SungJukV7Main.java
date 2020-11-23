package JSB;

import java.util.Scanner;

/*
 * 파일명 : SungJukV6Main
 * 작성일 : 2020.11.23
 *
 * 프로그램 설명: 성적처리프로그램 v7
 * 중간고사와 기말고사 성적처리프로그램을 만들려고 함
 * SungJukV6Main을 토대로 중간고사성적과 기말고사 성적 클래스를 인터페이스를 이용해서 작성하세요
 *
 * 부모클래스 : SungJukV7
 * 인터페이스 : ISungJukV6
 * 중간고사 MidSungJuk2 : 국어, 영어, 수학
 * 기말고사 FinalSungJuk2 : 국어, 영어, 수학,미술art,과학sci
 * 성적입력 : readSungJuk
 * 성적처리 : ComputeSungjuk
 * 결과출력 : PrintSungjuk
 * */
public class SungJukV7Main {
    public static void main(String[] args) {
        //MidSungJuk2 msj2 = new MidSungJuk2();
        //msj2.readSungJuk();
        //msj2.computeSungJuk();
        //msj2.printSungJuk();

        FinalSungJuk2 fsj2 = new FinalSungJuk2();
        fsj2.readSungJuk();
        fsj2.computeSungJuk();
        fsj2.printSungJuk();
    }
    
}

//추상클래스(변수들에 대한 내용)
abstract class SungJukV7{
    protected String name ;   //한글자:char =''
    protected int kor;
    protected int eng;
    protected int mat;
    protected int sum ;
    protected double mean ;
    protected char grd;

    //생성자
    public SungJukV7() { }

    public SungJukV7(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }
}

//인터페이스 작성(기능에 대한 가이드)
interface ISunJukV7{ //하위와 같은 메소드들이 있다.
    void readSungJuk();
    void computeSungJuk();
    void printSungJuk();
}

//인터페이스 구현 (인터페이스에 정의된 규칙에따라 정의)

//중간고사
class MidSungJuk2 extends SungJukV7 implements ISunJukV7 {

    @Override
    public void readSungJuk() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어점수를 입력하세요 : ");
        kor = sc.nextInt(); //문자열을 int숫자로 변환
        System.out.print("영어점수를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학점수를 입력하세요 : ");
        mat = sc.nextInt();
    }

    @Override
    public void computeSungJuk() {
        sum = mat + kor + eng;
        mean = (double)sum/3;
        //삼항연산자
        grd = (mean >= 90) ? '수': 
              (mean >= 80) ? '우':
              (mean >= 70) ? '미':
              (mean >= 60) ? '양': '가';
    }

    @Override
    public void printSungJuk() {
        String fnt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %.2f\n학점 : %c\n";
        String result = String.format(fnt,name,kor,eng,mat,sum,mean,grd);

        System.out.println(result);
    }
}
//기말고사
class FinalSungJuk2 extends SungJukV7 implements ISunJukV7 {

    //변수 2개 추가(미술, 과학)
    protected int art;
    protected int sci;

    //생성자
    public FinalSungJuk2() {
    }

    public FinalSungJuk2(int art, int sci) {
        this.art = art;
        this.sci = sci;
    }

    public FinalSungJuk2(String name, int kor, int eng, int mat, int art, int sci) {
        super(name, kor, eng, mat);
        this.art = art;
        this.sci = sci;
    }

    @Override
    public void readSungJuk() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어점수를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어점수를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학점수를 입력하세요 : ");
        mat = sc.nextInt();
        System.out.print("미술점수를 입력하세요 : ");
        art = sc.nextInt();
        System.out.print("과학점수를 입력하세요 : ");
        sci = sc.nextInt();
    }

    @Override
    public void computeSungJuk() {
        sum = mat + kor + eng + art + sci;
        mean = (double)sum/5;
        //삼항연산자
        grd = (mean >= 90) ? '수':
              (mean >= 80) ? '우':
              (mean >= 70) ? '미':
              (mean >= 60) ? '양': '가';
    }

    @Override
    public void printSungJuk() {
        String fnt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n미술 : %d\n과학 : %d\n총점 : %d\n평균 : %.2f\n학점 : %c\n";
        String result = String.format(fnt,name,kor,eng,mat,art,sci,sum,mean,grd);
        System.out.println(result);
    }
}