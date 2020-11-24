package JSB;

import java.util.Scanner;
import java.util.SplittableRandom;

//문자열처리 유용한 기능을 제공하는 메서드
//
public class Strings2 {
    public static void main(String[] args) {
        //문자열 검색
        //indexOf(문자) : 지정한 문자가 찾기, 위치값 출력
        String str = "Hello, World!!";
        int idx = str.indexOf('W');
        System.out.println(idx);
        int idxs = str.indexOf("Hello");
        System.out.println(idxs);

        //문자열 길이 : length
        System.out.println(str.length());

        //문자열 검색
        //lastIndexOf(문자) : 오른쪽기준 지정한 문자 찾기, 위치값 출력
        str = "Hello, Hi, Noon";
        idx = str.lastIndexOf('H');
        System.out.println(idx);
        idx = str.lastIndexOf('n');
        System.out.println(idx);

        //문자 바꾸기 : replace
        //replace(찾을문자열, 바꿀문자열)
        str = "A*B*C*D";
        str = str.replace("*","-");//(대상, 바꿀대상)
        System.out.println(str);

        //문자열 분리 : split
        //지정한 문자를 기준으로 문자열을 나눠 배열에 저장
        //split(구분자)
        str = "201350050,김태희,경기도,1985.3.22,컴퓨터,504";
        String[] result = str.split(",");
        /*for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }*/
        for(String data : result){
            System.out.println( data );
        }//향상된 for문을 사용하면 배열을 쉽게 다룰 수 있음

        //문자열 추출 : substring
        //substring(시작위치, 끝위치-1) //시작위치~끝위치까지 뽑아냄
        str = "Hello, World!!";
        String word = str.substring(7,12);
        System.out.println(word);

        //ex) 주민번호에서 성별체크하는 프로그램 코드 작성
        //123456-1234567, 987654-4567890
        //1, 2 : 2000년 이전 남여 구분
        //3, 4 : 2000년 이후 남여 구분

        String jumin = "123456-1234567";
        String gender = jumin.substring(7,8);
        String result2 = "";

        switch (gender) {
            case  "1" : result2 = "2000년 이전 출생 남자"; break;
            case  "2" : result2 = "2000년 이전 출생 여자"; break;
            case  "3" : result2 = "2000년 이후 출생 남자"; break;
            case  "4" : result2 = "2000년 이후 출생 여자"; break;
        }
        System.out.println(result2);

    }
}
