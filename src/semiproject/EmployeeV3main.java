package semiproject;
/*
*EmployeeV3Main
* 인사정보프로그램 진입점
* */
import java.util.Scanner;

public class EmployeeV3main {
    public static void main(String[] args) {
        EmployeeV3Service ejsrv = new EmployeeV3Service();

        Scanner sc = new Scanner(System.in);
        String menu = "";

        while (true) { //메뉴 띄우고 작업번호 입력을 반복xvv286
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
                    ejsrv.modifyEmployees();
                    break;
                case "5":
                    ejsrv.removeEmployees();
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
