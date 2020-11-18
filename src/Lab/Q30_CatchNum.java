package Lab;

import java.util.Scanner;

public class Q30_CatchNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~999 중 번호 하나를 입력하세요 : ");
        int num1 = sc.nextInt();
        int num2 = (int)(Math.random() * 999) + 1;
        System.out.println(num2);
        switch (num1>=1 && num1<100){
            case num1>num2 :
                System.out.println("추측한 숫자가 큽니다");
                break;
            case num1<num2 :
                System.out.println("추측한 숫자가 작습니다");
                break;
            default:
                System.out.println("빙고! 숫자를 맞췄습니다");
                break;
        };
    }
}
