package JSB;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 *파일명 : SungJukV4
 * 작성일 : 2020.11.18
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
 * 성적 처리 기능을 구현함으로써 코드가 길어지고 내용파악이 어려워지는것을 방지하가위해 함수(메소드)로 재정의 해 코드를 개선함.
 */
public class Method {

    //메서드
    /*특정 잡업을 수행하기 위해 작성한 명령어들의 묶음
    C언어의 함수와 비슷한 성격을 가지는 프로그래밍 요소
    입력값을 통해 무언가를 하고 그 결과를 도출하는 수학의함수(블랙박스)와 비슷한 개념*/

    //메서드의 목적
    /*프로그램을 작성하다 보면 반복적으로 쓰인 코드를 종종 보는데, 효율적으로 작성하려면 반복문으로 처리하면되지만
    만약 반복문이 반복된다면?
    메서드를 적용하면 기능별로 모듈화를 적용할 수 있기 때문에,
    프로그램의 가독성이 높아지고, 엽업시에도 유용, 기능변경시 유지보수에도 좋음*/

    //메서드 정의
    /*접근제한자, 리턴값 메서드이름(타입, 매개변수명){
        메서드 내용(몸체)
    }*/

    public static void main(String[] args) {
        //Hello, World!! 메세지 출력
        /*for(int i=0;i<3;i++){
        System.out.println("Hello, World!!");
        }*/

        //인사말 출력 메서드 호출(call)
        //sayHello();
        //sayHello2();
        /*sayHello3("Hello, World!!");
        sayHello3("Hello, Java!!");
        sayHello3("Hello, Android!!");*/

        //return 적용한 메서드
        /*String result = sayHello4("안녕 세상아");
        System.out.println(result);*/

        computeNum(1,5);
    }
    
    //간단한 인사 출력 메서드
    //public : 외부 클래스의 메서드 사용허가 여부
    //static : 정적 메서드, 객체생성없이 바로 사용가능한 메서드
    //void: 메서드가 반환하는 값이 없음
    public static void sayHello(){ //정의
        System.out.println("Hello, World!!");
    }

    //간단한 인사 3번 출력 메서드
    public static void sayHello2(){ //정의
        for(int i=0; i<3; i++){
            System.out.println("Hello, World!!");
        }
    }

    //간단한 인사 출력 메서드 sayHello3
    //단, 인삿말은 언제든 변경하도록 재작성
    //매개변수 : 메서드 처리시 필요로 하는 입력값
    public static void sayHello3( String msg ){ //정의
        System.out.println( msg );
    }

    //간단한 인사 출력 메서드 sayHello4
    //단, 인삿말은 언제든 변경하도록 재작성
    //단, 인삿말 출력을 메서드가 바로 하지 않고
    //인삿말 생성 후 호출한 대상으로 넘김
    // return : 메서드내에서 처리한 값을 외부로 보내려면 return이라는 명령문을 사용
    //return시 값의 type와 메서드의 return type은 반드시 일치해야함
    public static String sayHello4( String name ){ //정의
        return name;
    }

    // 두개의 정수를 매개변수로 선언하고 사칙연산한 결과를 출력하는 메서드 : computeNum
    public static void computeNum( int num1, int num2 ){ //정의
        int hap = num1 + num2;
        int cha = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        String fnt = "%d + %d = %d\n%d - %d = %d\n%d x %d = %d\n%d ÷ %d = %d\n";
        String result = String.format(fnt, num1, num2, hap, num1, num2, cha, num1, num2, mul, num1, num2,div);
        System.out.println(result);
    }

}
