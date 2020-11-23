package JSB;

//인터페이스
//추상메서드와 상수만으로 구성된 특수한 클래스
//어떤 클래스를 만들 때 추상메서드를 통해 기본이 되는 틀을 제공하여
// 규칙에 맞춰 코드를 잘 수 있게 해 줌
//클래스와는 달리 다중상속을 지원함.

//인터페이스 작성시 interface를 사용
//인터페이스를 구현 할때는 implements를 사용
public class Interface {
    public static void main(String[] args) {
        Cat3 c3 = new Cat3();
        System.out.println(c3.cry());
    }
}

class Anlmal3 {
    protected int weight;
    protected int height;
}

interface Animal3Action{
    abstract String cry();
}
class Cat3 extends Anlmal3 implements Animal3Action{
    @Override
    public String cry() {
        return "야옹~야옹~";
    }
}
