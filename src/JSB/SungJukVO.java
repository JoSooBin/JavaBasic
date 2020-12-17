package JSB;
/**
 *파일명 : SungJukV5
 * 작성일 : 2020.11.20
 *
 * 프로그램 설명: 성적 처리 프로그램V5
 * 이름, 국어, 영어, 수학, 총점, 평균, 학점에 관한
 * 변수를 정의한 VO클래스
 */
public class SungJukVO { //처리의 대상이 되는 데이터들만 넣기
    private int sjno;
    private String name;
    private int kor;
    private int mat;
    private int eng;
    private int sum;
    private double mean;
    private char grd;
    private String regdate;

    public SungJukVO(String name, int kor, int mat,
                     int eng, int sum, double mean, char grd){
        this.sjno = sjno;
        this.name = name;
        this.kor = kor;
        this.mat = mat;
        this.eng = eng;
        this.sum = sum;
        this.mean = mean;
        this.grd = grd;
        this.regdate = regdate;
    }

    public SungJukVO(int sjno, String name, int kor, int mat,
                     int eng, int sum, double mean, char grd, String regdate) {
        this.sjno = sjno;
        this.name = name;
        this.kor = kor;
        this.mat = mat;
        this.eng = eng;
        this.sum = sum;
        this.mean = mean;
        this.grd = grd;
        this.regdate = regdate;
    }

    public SungJukVO() {

    }


    public String getRegdate() { return regdate; }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getSjno() {
        return sjno;
    }

    public void setSjno(int sjno) {
        this.sjno = sjno;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
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
