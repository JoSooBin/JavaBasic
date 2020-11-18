package Lab;

import java.util.Scanner;
/*27. 다음 조건을 이용해서 현재 연도를 입력하면 윤년 여부를
출력하는 프로그램을 작성하세요. (LeapYear)
가. 현재 연도가 4로 나눠 떨어지지만, 100으로는 나눠 떨어지지 않음
나. 현재 연도가 400으로 나눠 떨어짐*/
public class Q27_LeapYear {
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in); //new는 공간을 잡아라=생성자. 괄호안에 있는거 메소드
            System.out.println("년도를 입력하세요.");
            int year = scanner.nextInt();

                if(year%4 == 0) {//4의배수는 윤년.
                    if((year%4 == 0) && (year%100 == 0)) { //4의 배수지만 100의 배수면 윤년이 아님

                        if(year%400 == 0) { //400의 배수이면 윤년
                            System.out.printf("%d년도는 윤년입니다 \n", year);
                            break;
                        }
                        System.out.printf("%d년도는 윤년이 아닙니다 \n", year);
                        continue;
                    }
                    System.out.printf("%d년도는 윤년입니다 \n", year);
                }
            }
        }
    }

