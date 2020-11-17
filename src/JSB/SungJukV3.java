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
 * 학점 계산시 switch문으로.
 *
 * 성적처리 결과 출력시 출력문을 하나만 사용하기로 함
 * Math.round()이용해서 평균은 소수점 둘째자리까지 출력하도록 함
 */
public class SungJukV3 {
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
        String fnt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %s\n학점 : %c\n";
        String result;

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
        //Math.round() : 소수점 반올림 함수
        mean = Math.round(mean*100)/100.0;
        //숫자를 문자로 변환
        result = String.format(fnt, name,kor,eng,mat,sum,String.valueOf(mean),grd);

        //결과출력

        //문자열 연결 연산자(+)로 문장을 만드는 경우
        //String 변수의 특성 때문에 성능 저하 발생
        System.out.println(result);
    }
}
