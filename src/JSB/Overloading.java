package JSB;

//메서드 다중정의
//객체지향 중요개념 중 하나인 다형성에 해당
//같은 이름의 메서드를 중복해서 정의하는 것을 의미
//한 클래스에 같은 이름의 메서드가 2개 이상 존재 할 수 있음
//이때 메서드의 서명만 다르게 작성한다면 정의 가능
public class Overloading {

}

class NonOverloading {
    //간단한 덧셈 프로그램
    //1.정수 2개를 더하는 프로그램
    public int addInt(int a, int b){
        return a + b;
    }
    //2.실수 2개를 더하는 프로그램
    public double addDouble(double a, double b){
        return a + b;
    }
    //3.정수 3개를 더하는 프로그램
    public int addInt3(int a, int b,int c){
        return a + b + c;
    }
}
