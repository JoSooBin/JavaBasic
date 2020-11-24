package JSB;

import java.util.Scanner;

//로그인 확인 프로그램
//0.인증용 아이디와 비밀번호 하나 생성해둠
//->abc123, 987zxy
// 1.아이디, 비밀번호를 입력받음
// 2.아이디와 비밀번호가 틀리면 "가입되지 않은 아이디!"
// 3.아이디만 맞으면 "비밀번호가 틀렸음!"
// 4.아이디와 비밀번호가 맞으면 "로그인 성공!"
public class LoginME {
    public static void main(String[] args) {
        String mid = "abc123";
        String mpassword = "987zxy";

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호를 입력하세요 : ");
        String password = sc.nextLine();

        if (mid.equals(id) != true) {
            System.out.println("가입되지 않은 아이디!");
        }
        if(mid.equals(id) == true && mpassword.equals(password) != true) {
            System.out.println("비밀번호가 틀렸음!");
        } else if (mid.equals(id) == true && mpassword.equals(password) == true) {
            System.out.println("로그인 성공!");
        }
    }
}
