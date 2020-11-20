package JSB;

public class SungJukVO {
    private int kor;
    private int mat;
    private int eng;
    private int sum;
    private double mean;
    private char grd;
    private String fnt;
    private String result;

    public SungJukVO() {

    }

    public SungJukVO(int kor, int mat, int eng, int sum, double mean, char grd, String fnt, String result) {
        this.kor = kor;
        this.mat = mat;
        this.eng = eng;
        this.sum = sum;
        this.mean = mean;
        this.grd = grd;
        this.fnt = fnt;
        this.result = result;
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

    public String getFnt() {
        return fnt;
    }

    public void setFnt(String fnt) {
        this.fnt = fnt;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;

    }
}
