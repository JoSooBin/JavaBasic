package JSB;
import java.util.Scanner;

/**
 *파일명 : SungJukV2
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적 처리 프로그램2
 * 학생 3명의 성적데이터를 기보드로 입력받아
 * 이름, 국어, 영어, 수학점수를 키보드로부터 입력받아서
 * 총점, 평균, 학점을 계산하고 결과 출력
 * name, kor, eng, mat, sum, mean, grd
 * 단 평균은 소수점 첫째자리까지 출력
 * 학점 기준은 수우미양가로 함
 * 100-90, 89-80....
 *
 */
public class SungJukV3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //변수선언

        String name[] = new String[3];
        int kor[] = new int[3];
        int eng[] = new int[3];
        int mat[] = new int[3];
        int sum[] = new int[3];
        double mean[] = new double[3];
        char grd[] = new char[3];
        String fnt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %s\n학점 : %c\n";

        for (int i=0; i<3;i++){
            System.out.println((i+1) + "번째 학생 성적 입력중...");
            System.out.print("이름을 입력하세요 : ");
            name[i] = sc.nextLine();
            System.out.print("국어점수를 입력하세요 : ");
            kor[i] = sc.nextInt();
            System.out.print("영어점수를 입력하세요 : ");
            eng[i] = sc.nextInt();
            System.out.print("수학점수를 입력하세요 : ");
            mat[i] = sc.nextInt();

            sc.skip("\r\n|[\n\r]");
            //수학성적 입력시 같이 입력된 enter가 다음 데이터 입력시 입력값으로 자동 전달됨.
            //해결방법: 미리 엔터키를 제거하는 코드 삽입
        }

        // 처리
        for (int i=0; i<3;i++) {

            sum[i] = mat[i] + kor[i] + eng[i];
            mean[i] = (double) sum[i] / 3;

            //switch
            switch ((int) (mean[i] / 10)) {
                case 10:
                case 9:
                    grd[i] = '수';
                    break;
                case 8:
                    grd[i] = '우';
                    break;
                case 7:
                    grd[i] = '미';
                    break;
                case 6:
                    grd[i] = '양';
                    break;
                default:
                    grd[i] = '가';
                    break;

            }
        }
        //결과출력
        for (int i=0; i<3;i++) {
            System.out.println("-------------------------");
            System.out.printf(fnt, name[i], kor[i], eng[i], mat[i], sum[i], mean[i], grd[i]);

        }
    }
}
