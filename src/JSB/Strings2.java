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

        //지정한 위치의 문자 추출: charAt
        str = "123456-1234567";
        System.out.println(str.charAt(7));

        //정규표현식에 따라 일치여부 확인 : matches
        //정규식 사용가능 메서드 : split, replaceAll
        //문자열 형태 확인할때. 비밀번호 영어+숫자+특수문자 들어갔는지 확인하는 등
        int num = 1234567;
        String str1 = String.format("%d",num);
        String str2 = "1234567";
        System.out.println(str1.matches(str2));
        str1 = String.format("%,d",num);
        System.out.println(str1.matches(str2));

        System.out.println(str.matches("[a-z].+"));
        System.out.println(str.matches("[0-9].+"));

        //정규표현식 regular expression
        //특정한 규칙을 가진 문자열의 집합을 표현하기 위해 사용하는 형식언어
        //[] : 문자집합표현, -는 두 문자 사이의 범위 표현. 문자집합이나 범위를 나타냄
        //[0-9] : 숫자집합 ([0123456789])
        //[a-z A-Z] : 영문자집함
        //[가-힣] : 한글집합
        //* : 0번 이상 무한개의 임의의 문자 반복
        //ab* : ab, aba, ab1, ...
        //+ : 1번 이상 무한개의 임의의 문자 반복
        //ab+ : aba, ab1, abA, abaa...
        //? : 0개 또는 1개의 임의의 문자 반복
        //ab? : aba, abb, .... ab0, abZ, abz
        //{n, m} : 최소 n개 이상 m개 이하 반복
        //[0-9]{3,4} : 123, 987, 1234, 9876
        //^:문자열 시작
        //^123: 123으로 시작하는 문자열 의미
        //$ : 문자열 끝
        //132$ : 123으로 끝나는 문자열 의미
        // . : 임의의 문자를 의미
        //. {3, } : 문자의 최소길이는 3이다.

        //다음 문자열이 전화번호 형식에 맞게 작성되었는지 알아보는 정규식을 작성하세요
        //010-123-4567, 011-1234-5678

        String pattern1 = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}"; //가운데자리가 3자리~4자리

        String phone = "010-123-4567";
        System.out.println( phone.matches(pattern1) );  //true

        phone = "011-1234-5678";
        System.out.println( phone.matches(pattern1) ); //true

        //ex)사용자 아이디가 다음규칙에 맞게 적합하게 작성되었는지 확인
        //영문자 소문자/대문자 하나씩, 숫자, 특수기호
        //abc132!XYZ, 132jkl 하나는 거짓 뒤에는 참으로
        String pattern2 = "[a-zA-Z0-9!]+";

        String uid = "abc132!XYZ";
        System.out.println(uid.matches(pattern2));//true
        uid = "132jkl";
        System.out.println(uid.matches(pattern2));//true

        //첫글자는 영문자 소문자/대문자
        //두번째는 영문자, 숫자, 특수기호()등이 포함
        //아이디 길이는 6자 ~ 18자
        //abc132!XYZ, 132jkl
        String pattern3 = "^[a-zA-Z]{1}[a-zA-Z0-9!?@$]{5,17}"; //{1} 생략가능

        uid = "abc132!XYZ";
        System.out.println(uid.matches(pattern2));//true
        uid = "123456789013245"; //범위 초과
        System.out.println(uid.matches(pattern3)); //false
        uid = "132jkl"; //시작이 숫자
        System.out.println(uid.matches(pattern3)); //false

    }
}
