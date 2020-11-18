package Lab;

import java.util.Scanner;

public class Q25_Lotto {
    public static void main(String[] args) {

        int lotto[] = new int[3];
        int i = 0;

        //사용자 입력 로또번호
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (i = 0; i < 3; i++) {
            System.out.print((i + 1) + "번째 숫자를 입력하세요");
            arr[i] = sc.nextInt();
        }
        System.out.print("응모한 번호는");
        for (i = 0; i < 3; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        //랜덤 로또번호
        for (i = 0; i < 3; i++) {
            lotto[i] = (int)(Math.random() * 45) + 1;
                //중복번호 체크
                if (i > 0) {
                    for (int j = 0; j < i; j++) {
                        if (lotto[i] == lotto[j]) {
                            //System.out.println("번호는 중복되어서는 안됩니다.");
                            i--;
                            //continue;
                            break;
                        }
                    }
                }
            }
        System.out.print("로또 번호는");
        for (i = 0; i < 3; i++) {
            System.out.print(lotto[i]+" ");
        }

        //사용자 번호와 로또번호 비교
        int count =0;
        for (i = 0; i<3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                if(arr[i] == lotto[j]) {
                    count++;
                }
            }
        }
        if(count == 3) {System.out.println("상금 1백만 지급");}
        else System.out.println("아쉽지만, 다음 기회를!");
    }
}//class