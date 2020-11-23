package JSB;
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
        PrintSungjuk sj = new PrintSungjuk();
        System.out.println(sj.kor);
        System.out.println(sj.mat);
        System.out.println(sj.eng);
        System.out.println(sj.art);
        System.out.println(sj.sci);
        System.out.println(sj.sum);
        System.out.println(sj.grd);
    }
}

//중간고사
class MidSungJuk {
    //변수선언
    String name = "조수빈";   //한글자:char =''
    int kor = 99;
    int eng = 98;
    int mat = 99;
}
//기말고사
class FinalSungJuk extends MidSungJuk {
    int art = 99;
    int sci = 98;
}
//성적처리
class ComputeSungjuk extends FinalSungJuk {
    int sum = 0;
    double mean = 0.0;

    @Override
    protected int getSum() { return sum = mat + kor + eng; }

    @Override
    protected double getMean() { return mean = (double)sum/3; }



    
}
//결과출력
class PrintSungjuk extends ComputeSungjuk {

    char grd = '가';

    @Override
    protected char getGrd() { return grd = (mean >= 90) ? '수':
                                            (mean >= 80) ? '우':
                                            (mean >= 70) ? '미':
                                            (mean >= 60) ? '양': '가'; }

}
