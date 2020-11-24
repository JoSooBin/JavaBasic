package JSB;

//클래스/인터페이스 형변환
//특정 객체가 자식클래스/인터페이스 타입에서
//부모클래스/인터페이스 타입 또는 반대로 형변환하는것을 의미
public class OOPCasting {
    public static void main(String[] args) {
        Unit u1 = new Unit();
        Marine m1 = new Marine();
        Firebat f1 = new Firebat();

        u1.attack();
        m1.attack();
        f1.attack();

        Unit m2 = new Marine();
        //Marine 객체는 자동으로 Unit 객체로 형 변환 (상속받은 자식은 부모껄로 형변환 가능)
        //이처럼 상속 관계에 있는 클래스간의 객체 생성시
        // 자식클래스 타입의 객체를 부모클래스타입의 객체로
        //선언하는 경우 업캐스팅upcastring라 함.
        m2.attack();

        Firebat f2 = (Firebat) new Unit();
        //Unit 객체를 Unit Firebat객체로 형 변환하려면
        // 명시적 형변환 필요
        //이처럼 상속 관계에 있는 클래스간의 객체 생성시
        //부모클래스 타입의 객체를 자식클래스타입의 객체로
        //선언하는 경우 다운캐스팅downcasting이라 함.
        //단, 컴파일시에는 오류가 나지않지만
        //실행시 오류 발생!(서로 다른 형일때)
        f2.attack();
    }
}

class Unit {
    protected int hp;
    protected int ap;

    public void attack(){
        System.out.println("공격중입니다...");
    }
}

class Marine extends Unit{
    @Override
    public void attack() {
        System.out.println("해병대가 공격중...");
    }
}
class Firebat extends Unit{
    @Override
    public void attack() {
        System.out.println("불곰이 공격중....");
    }
}
