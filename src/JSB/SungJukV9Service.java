package JSB;

import java.io.*;
import java.util.Scanner;

public class SungJukV9Service extends SungJukV8Service {

    private String fpath = "c:/Java/sungjuk.dat";
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;

    public void displayMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------\n")
                .append("성적 처리프로그램 v9\n")
                .append("-------------------\n")
                .append(" 1. 성적 데이터 입력\n")
                .append(" 2. 성적 데이터 조회\n")
                .append(" 3. 성적 데이터 상세조회\n")
                .append(" 4. 성적 데이터 수정\n")
                .append(" 5. 성적 데이터 삭제\n")
                .append(" 0. 프로그램 종료 \n")
                .append("-------------------\n")
                .append( " 원하시는 작업은 ? [0,1,2,3,4,5,0] ");
        System.out.print(sb);
    }

    //SungJukV8SerVice의 newSungJuk를 재정의
    @Override
    public void newSungJuk() {
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

        //입력받은 성적데이터를 동적배열에 저장
        SungJukVO sj = new SungJukVO(name, kor, eng, mat,0,0,' ');

        //총점, 평균, 학점을 계산
        computeSungJuk(sj);

        //처리된 성적데이터를 동적배열에 저장
        sjdata.add(sj);

        try {
            writeSungJuk(sj);
        } catch (IOException e) {
            System.out.println("파일쓰기 중 오류!");
            e.printStackTrace();
        }
    }

    /*
    * writeSungJuk
    * 입력받은 성적데이터를 sungjuk.dat에 저장
    * */
    protected void writeSungJuk(SungJukVO sj) throws IOException {
        String fmt = "%s,%s,%s,%s,%s,%.1f,%s";

        fw = new FileWriter(fpath);
        bw = new BufferedWriter(fw);

        String data = String.format(fmt,sj.getName(),sj.getKor(),sj.getEng(),sj.getMat(),sj.getSum(),sj.getMean(),sj.getGrd());
        bw.write(data);

        bw.close();
        fw.close();
    }
}
