package Lab;
import java.io.*;
/*29. 사용자로부터 소문자를 입력 받아 대문자로 출력하는 프로그램을 작성해보세요. 단, 소문자 이외의 숫자나 문자를 입력 받으면 “잘못 입력하셨습니다!!”라는 메시지를 출력하도록 합니다. (UpperCase)

문자 입력 시 System.in.read() 사용
A의 유니코드 값 : 65,      a의 유니코드 값 : 97*/
public class Q29_low2upr {
    public static void main(String[] args) throws IOException {
        System.out.print("소문자 알파벳을 입력하세요 : ");
        int x = System.in.read();
        System.out.println("소문자 유니코드 = " + x);
        int y = x-32;
        System.out.println("대문자 유니코드 = " + y);
        char Dae = (char)y;
        System.out.println("대문자 = " + Dae);
    }
}
