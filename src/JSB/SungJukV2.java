package JSB;
import java.util.Scanner;
/**
 *파일명 : SungJukV2
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적 처리 프로그램2
 * 이름, 국어, 영어, 수학점수를 키보드로부터 입력받아서
 * 총점, 평균, 학점을 계산하고 결과 출력
 * name, kor, eng, mat, sum, mean, grd
 * 단 평균은 소수점 첫째자리까지 출력
 * 학점 기준은 수우미양가로 함
 * 100-90, 89-80....
 *
 * 삼항연산자 : (조건식) ? : 참일때의 값: 거짓일 때 값
 * 학점 계산시 switch문으로
 */
public class SungJukV2 {
    public static void main(String[] args) {
        //변수선언
        Scanner scanner = new Scanner(System.in);
        String name = "조수빈";   //한글자:char =''
        System.out.print("국어점수를 입력하세요 : ");
        int kor = scanner.nextInt();
        System.out.print("영어점수를 입력하세요 : ");
        int eng = scanner.nextInt();
        System.out.print("수학점수를 입력하세요 : ");
        int mat = scanner.nextInt();

        int sum = 0;
        double mean = 0.0;
        char grd = '가';

        // 처리
        sum = mat + kor + eng;
        mean = (double)sum/3;

        //switch
        switch ((int)mean/10){
            case 10:
            case 9: grd = '수'; break;
            case 8: grd = '우' ; break;
            case 7: grd = '미' ; break;
            case 6: grd = '양' ; break;
            default: grd = '가' ; break;

        }
        //String.format(형식지정자, 변수들)
        mean = Double.parseDouble(String.format("%.1f", mean));

        //결과출력
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat);
        System.out.println("-----------");
        System.out.println("총점 : " + sum);
        //System.out.printf("평균 : %.1f\n", mean);
        System.out.println("평균 : " + mean);
        System.out.println("학점 : " + grd);

    }
}
