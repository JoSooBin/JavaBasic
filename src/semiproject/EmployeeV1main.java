package semiproject;
/*
* 인사정보프로그램 진입점
* */
import java.util.Scanner;

public class EmployeeV1main {
    public static void main(String[] args) {
        EmployeeV1Service ejsrv = new EmployeeV1Service();

        Scanner sc = new Scanner(System.in);
        String menu = "";
        while (true) { //메뉴 띄우고 작업번호 입력을 반복
            ejsrv.displayMenu();
            menu = sc.nextLine();

            switch (menu) {
                case "1":
                    ejsrv.newEmployees();
                    break;
                case "2":
                    ejsrv.readEmployees();
                    break;
                case "3":
                    ejsrv.readOneEmployees();
                    break;
                case "4":
                    break;
                case "5":
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
