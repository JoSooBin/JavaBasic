package Lab;
/*사용자가 연봉과 결혼 여부를 입력하면 다음의 세금율에 의해 납부해야
할 세금을 계산하는 프로그램을 작성하세요 (Tax)
가. 미혼인 경우 : 연봉 3000미만 - 10%,  연봉 3000이상 - 25%
나. 결혼한 경우 : 연봉 6000미만 - 15%,  연봉 6000이상 - 35%*/
import java.util.Scanner;

public class Q26_Salary {
    public static void main(String[] args) {
        double tax = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("결혼 여부를 입력하세요 : ");

        String marry = sc.nextLine();
        System.out.print("연봉를 입력하세요 : ");
        double sal = sc.nextDouble();

        if(marry.equals("미혼")){
            if(sal<3000){
                 tax = sal*0.1;
            } else{ tax = sal*0.25;}

        }
        else if(marry.equals("결혼")){
                if(sal<6000){
                    tax = sal*0.15;
                } else{ tax = sal*0.35;}
            }
            System.out.println("세금은 "+tax+"입니다");
    }//main
}
