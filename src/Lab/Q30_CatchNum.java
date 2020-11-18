package Lab;

import java.util.Scanner;

public class Q30_CatchNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~999 중 번호 하나를 입력하세요 : ");
        int num1 = sc.nextInt();
        int num2 = (int)(Math.random() * 999) + 1;
        System.out.println("랜덤으로 추출된 숫자는"+num2);
        do{
            if(num1>num2){
                System.out.println("추측한 숫자가 큽니다");
                break;
            }else if(num1<num2){
                System.out.println("추측한 숫자가 작습니다");
                break;
            }else System.out.println("빙고! 숫자를 맞췄습니다");
        }while (num1>=1 && num1<100);
    }
}
