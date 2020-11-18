package Lab;

import java.util.Scanner;

//사용자로부터 숫자(1 - 9)를 하나 입력 받아, 구구단을 출력하는 프로그램을
//작성해보세요. 단, 1 - 9 이외의 숫자나 문자를 입력 받으면 “잘못 입력하셨습니다!!”라는 메시지를 출력하도록 합니다. (GuGuDan)
public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~9 중 번호 하나를 입력하세요");
        int dan = sc.nextInt();
        if (dan>=1 && dan<=9){
            for(int i=1; i<10; i++){
                int result = dan*i;
                System.out.println(dan+" x "+i+" = "+result);
            }
        }else System.out.println("잘못 입력하셨습니다!!");
    }
}
