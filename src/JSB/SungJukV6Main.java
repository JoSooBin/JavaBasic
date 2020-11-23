package JSB;

import java.util.Scanner;

/*
* 파일명 : SungJukV6Main
* 작성일 : 2020.11.23
*
* 프로그램 설명: 성적처리프로그램 v6
* 중간고사와 기말고사 성적처리프로그램을 만들려고 함
* SungJukV1을 토대로 중간고사성적과 기말고사 성적 클래스를 상속을 이용해서 작성하세요
* 
* 중간고사 MidSungJuk : 국어, 영어, 수학
* 기말고사 FinalSungJuk : 국어, 영어, 수학,미술art,과학sci
* 성적처리 : ComputeSungjuk
* 결과출력 : PrintSungjuk
* */
public class SungJukV6Main {
    public static void main(String[] args) {
        MidSungJuk msj = new MidSungJuk();

        msj.readSungJuk();
        msj.computeSungJuk();
        msj.printSungJuk();
    }
}

//중간고사
class MidSungJuk {
    //변수선언
    protected String name ;   //한글자:char =''
    protected int kor;
    protected int eng;
    protected int mat;
    protected int sum ;
    protected double mean ;
    protected char grd;

    public MidSungJuk() { }

    public MidSungJuk(String name, int kor, int eng, int mat) { //매개변수를 4개만 넣음. 당장 안쓰니까
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
//        sum = 0;
//        mean =0.0;
//        grd = '가'; // 넣어도되고 안넣어도됨
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

    protected void readSungJuk() {
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
    protected void computeSungJuk() {
        sum = mat + kor + eng;
        mean = (double)sum/3;
        //삼항연산자
        grd = (mean >= 90) ? '수':
              (mean >= 80) ? '우':
              (mean >= 70) ? '미':
              (mean >= 60) ? '양': '가';
    }
    protected void printSungJuk(){
        String fnt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %.2f\n학점 : %c\n";
        String result = String.format(fnt,name,kor,eng,mat,sum,mean,grd);

        System.out.println(result);
    }
}

//기말고사
class FinalSungJuk extends MidSungJuk {
    protected int art;
    protected int sci;

    //생성자
    public FinalSungJuk() { }

    //매개변수생성자 (부모꺼 포함)
    public FinalSungJuk(String name, int kor, int eng, int mat, int art, int sci) {
        //this.name = name;
        //this.kor = kor;
        //this.eng = eng;
        //this.mat = mat; //위 네줄을 아래 super 한줄로 처리할 수 있음
        super(name, kor, eng, mat); //부모클래스에 정의된 멤버변수 초기화 코드를 super라는 이름으로 치환해서 호출 할 수 있음

        this.art = art;
        this.sci = sci;
    }

    @Override
    protected void readSungJuk() {
        //부모클래스에 정의된 멤버변수 초기화 코드를 super라는 이름으로 치환해서 호출 할 수 있음
        //super.메서드이름()
        super.readSungJuk();

        Scanner sc = new Scanner(System.in); //얘는 상속 못받아와서 또 써줘야함
        System.out.print("미술점수를 입력하세요 : ");
        art = sc.nextInt();
        System.out.print("과학점수를 입력하세요 : ");
        sci = sc.nextInt();
    }
}
/*//성적처리
class ComputeSungjuk extends FinalSungJuk {

    @Override
    protected int getSum() { return sum = mat + kor + eng; }

    @Override
    protected double getMean() { return mean = (double)sum/3; }

}
//결과출력
class PrintSungjuk extends ComputeSungjuk {

    @Override
    protected char getGrd() { return grd = (mean >= 90) ? '수':
                                            (mean >= 80) ? '우':
                                            (mean >= 70) ? '미':
                                            (mean >= 60) ? '양': '가'; }

}*/

