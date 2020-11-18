package JSB;
import java.util.Scanner;

/**
 *파일명 : SungJukV4
 * 작성일 : 2020.11.18
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
 * 코드의 가독성과 유지보수를 용이하게 하기 위해 메서드 기반 코드로 재작성
 */
public class SungJukV4 {
    public static void main(String[] args) {
        //변수선언
        String name[] = new String[3];
        int kor[] = new int[3];
        int eng[] = new int[3];
        int mat[] = new int[3];
        int sum[] = new int[3];
        double mean[] = new double[3];
        char grd[] = new char[3];

        //처리
        readSungJuk(name, kor, eng, mat);
        computeSungJuk(kor, eng, mat, sum, mean, grd);
        //결과 출력
        printSungJuk(name,kor,eng,mat,sum,mean,grd);
    }//main

    //성적데이터 입력받기: readSungJuk
    public static void readSungJuk(String name[], int kor[], int eng[],int mat[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "번째 학생 성적 입력중...");

            System.out.print("이름을 입력하세요 : ");
            name[i] = sc.nextLine();
            System.out.print("국어점수를 입력하세요 : ");
            kor[i] = sc.nextInt(); //문자열을 int숫자로 변환
            System.out.print("영어점수를 입력하세요 : ");
            eng[i] = sc.nextInt();
            System.out.print("수학점수를 입력하세요 : ");
            mat[i] = sc.nextInt();
            sc.skip("\r\n|[\n\r]");
        }
    }

        //성적데이터 총점, 평균, 학점처리: computeSungJuk
        public static void computeSungJuk(int[] kor, int[] eng, int[] mat, int[] sum, double[] mean, char[] grd){
            for (int i = 0; i < 3; i++) {
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
        }

        //처리 결과 출력: printSungJuk
        public static void printSungJuk(String[] name,int[] kor, int[] eng, int[] mat, int[] sum, double[] mean,
        char[] grd){
            String fnt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %.2f\n학점 : %c\n";

            for (int i = 0; i < 3; i++) {
                System.out.println("-------------------------");
                System.out.printf(fnt, name[i], kor[i], eng[i], mat[i], sum[i], mean[i], grd[i]);
            }
        }
    }//class
