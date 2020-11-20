package JSB;

import java.util.Scanner;

/**
 *파일명 : SungJukService
 * 작성일 : 2020.11.20
 *
 * 프로그램 설명: 성적 처리 프로그램v5
 * 이름, 국어, 영어, 수학점수를 키보드로부터 입력받아서
 * 총점, 평균, 학점을 계산하고 결과 출력
 *
 * 단 평균은 소수점 첫째자리까지 출력
 * 학점 기준은 수우미양가로 함
 * 100-90, 89-80....
 *
 * 삼항연산자 : (조건식) ? : 참일때의 값: 거짓일 때 값
 * 학점 계산시 switch문으로.
 *
 */

public class SungJukService {
    /*
     *성적데이터 입력 메서드
     *@return 키보드로 입력받은 성적데이터 SungJukVO
     */
    public SungJukVO readSungJuk(){ //참조형 데이터타입. readSungJuk에서 입력한 값을 SungJukVO에 넘겨줌
        String name;
        int kor, eng, mat;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어점수를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어점수를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학점수를 입력하세요 : ");
        mat = sc.nextInt();
        
        return new SungJukVO( name, kor, mat, eng, 0, 0, ' ');
    }//readSungJuk
    
    /*
     *입력받은 성적에 대해
     * 총점, 평균 ,학점을 계산하는 메서드
     */
    public void computeSungJuk(SungJukVO sj){ //참조형변수에서 가져옴
        sj.setSum(sj.getKor() + sj.getEng() + sj.getMat() );
        sj.setMean( (double)sj.getSum()/3);
        
        switch ((int)sj.getMean()/10){
            case 10:
            case 9: sj.setGrd('수'); break;
            case 8: sj.setGrd('우'); break;
            case 7: sj.setGrd('미'); break;
            case 6: sj.setGrd('양'); break;
            default: sj.setGrd('가');
        }
    }//computeSungJuk

    /*
     *입력받은 이름, 국어,영어,수학과
     *계산된 총점, 평균 ,학점을 출력하는 메서드
     */
     public void printSungJuk(SungJukVO sj){
         String fnt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %s\n학점 : %c\n";
         String result = String.format(fnt, sj.getName(),sj.getKor(),sj.getEng(),sj.getMat(),
                 sj.getSum(),sj.getMean(),sj.getGrd());
         System.out.println(result);
    }
}
