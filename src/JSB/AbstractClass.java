package JSB;

//추상클래스
//추상메서드를 포함하는 클래스
//추상메서드 : 메서드의 선언부만 있고, 몸체가 없는 메서드.
//메서드의 몸체는 이것을 상속하는 자식클래스에서 정의함.
//
public class AbstractClass {
}

abstract class Animal2 {
    protected int weight;

    abstract String cry();//추상메서드
}