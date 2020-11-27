package JSB;

import java.io.*;

//2차원 표 형태의 데이터를 파일에 저장하기
public class FileReaderWriter2 {
    public static void main(String[] args) throws IOException {
        //학번, 이름, 주소, 생년월일, 학과명, 교수 등으로 구성된 2차원 표 형태의 데이터를 student.dat에 저장

        int hakbun = 20135050;
        String name = "김태희";
        String addr = "경기도 고양시";
        String birth = "1985.03.22";
        String dname = "컴퓨터";
        int prof = 504;

        //학생 기본정보를 저장 할 student.dat에 저장함.
        String fpath = "c:/Java/student.dat";
        FileWriter fw = new FileWriter(fpath);

        //기본 정보를 저장 할 형식 정의
        // 각 항목들은 ,로 구분함
        String fmt = "%s,%s,%s,%s,%s,%s";
        String data = String.format(fmt, hakbun, name, addr, birth, dname, prof);

        fw.write(data);
        fw.close();

        //과목 정보 입력
        //과목번호, 과목명, 과목개요, 담당교수 등으로 구성된 2차원 표 형태의 데이터를 subject.dat에 저장
        String num = "0205";
        String kname = "프로그래밍";
        String gaeyo = "자바 프로그래밍";
        prof = 301;

        //버퍼 기능을 지원하는 Writer 사용
        fpath = "c:/Java/subject.dat";
        fw = new FileWriter(fpath);
        BufferedWriter bw = new BufferedWriter(fw);

        fmt = "%s,%s,%s,%s";
        data = String.format(fmt, num, kname, gaeyo, prof);

        bw.write(data);

        bw.close();
        fw.close();

        //과목 기본정보가 저장된 파일을 읽어서 출력하기
        //과목번호 : ~~
        //과목이름 : ~~
        //...

        FileReader fr = new FileReader(fpath);
        BufferedReader br = new BufferedReader(fr);
        fmt = "과목번호 : %s\n과목명 : %s\n과목개요 : %s\n담당교수 : %s\n";

        //파일 데이터 읽기
        while (br.ready()){
            String line = br.readLine(); //데이터 읽기
            //System.out.println(line);

            String[] item = line.split(","); //읽어온 데이터를 , 단위로 분리해서 배열 변수에 저장
            String result = String.format(fmt, item[0], item[1], item[2], item[3]) ;
            System.out.println(result);
        }

        bw.close();
        fw.close();
    }
}
