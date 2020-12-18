package semiproject;
/*
* SamKwangFinalV1
* 비즈니스 관리 프로그램 진입점
* */
import java.util.Scanner;

public class SamKwangFinalV1 {
    public static void main(String[] args) {
        SamKwangFinalV1Service sk = new SamKwangFinalV1Service();

        Scanner sc = new Scanner(System.in);
        String menu = "";

        while (true) { //메뉴 띄우고 작업번호 입력을 반복
            sk.displayMenu();
            menu = sc.nextLine();

            switch (menu) {
                case "1":

                    break;
                case "2":
                    sk.readCODP();
                    break;
                case "3":
                    sk.readOneCODP();
                    break;
                case "4":
                    sk.readSOE();
                    break;
                case "5":
                    sk.readOneSOE();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못입력하셨습니다");
            }
        }
    }
}
