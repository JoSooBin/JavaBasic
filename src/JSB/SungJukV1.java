package JSB;
/**
 *파일명 : SungJukV1
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적 처리 프로그램1
 * 이름, 국어, 영어, 수학점수를 설정하면
 * 총점, 평균, 학점을 계산하고 결과 출력
 * name, kor, eng, mat, sum, mean, grd
 * 학점 기준은 수우미양가로 함
 * 100-90, 89-80....
 */
public class SungJukV1 {
    public static void main(String[] args) {
        String name = "조수빈";
        int kor=99, eng=98, mat=99;
        double sum = kor + eng + mat;
        double mean = sum/3;

        /*if(mean>=100 && mean>90){
            System.out.println("학점은 '수'입니다");
        }*/

        System.out.println("이름 : "+ name);
        System.out.println("국어 : "+ kor);
        System.out.println("영어 : "+ eng);
        System.out.println("수학 : "+ mat);
        System.out.println("-----------");
        System.out.println("총점 : "+ sum);
        System.out.println("평균 : "+ mean);
        //System.out.println("학점은"+mat+"입니다");
    }
}
